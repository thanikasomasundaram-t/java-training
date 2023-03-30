import java.sql.*;

public class TransactionPairs {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost/paris";
        Connection connection = null;
        Statement statement;
        PreparedStatement salesUpdate;
        PreparedStatement totalUpdate;
        String saleUpdateQuery = "update COFFES " +
            "set SALES = ? where COF_NAME like ?";
        String totalUpdateQuery = "update COFFES " +
            "set TOTAL = TOTAL + ? where COF_NAME like ?";
        String query = "select COF_NAME, SALES, TOTAL from COFFES ";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }
        try {
            connection = DriverManager.getConnection(url, "root", "thanika@18");
            salesUpdate = connection.prepareStatement(saleUpdateQuery);
            totalUpdate = connection.prepareStatement(totalUpdateQuery);
            int[] salesForWeek = {
                175,
                150,
                60,
                155,
                90
            };
            String[] coffees = {
                "Colombian",
                "French_Roast",
                "Espresso",
                "Colombian_Decaf",
                "French_Roast_Decaf"
            };
            int len = coffees.length;
            connection.setAutoCommit(false);
            for (int i = 0; i < len; i++) {
                salesUpdate.setInt(1, salesForWeek[i]);
                salesUpdate.setString(2, coffees[i]);

                salesUpdate.executeUpdate();
                totalUpdate.setInt(1, salesForWeek[i]);
                totalUpdate.setString(2, coffees[i]);
                totalUpdate.executeUpdate();
                connection.commit();
            }
            connection.setAutoCommit(true);
            salesUpdate.close();
            totalUpdate.close();
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                String c = rs.getString("COF_NAME");
                int s = rs.getInt("SALES");
                int t = rs.getInt("TOTAL");
                System.out.println(c + " " + s + " " + t);
            }
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
            if (connection != null) {
                try {
                    System.err.print("Transaction is being ");
                    System.err.println("rolled back");
                    connection.rollback();
                } catch (SQLException excep) {
                    System.err.print("SQLException: ");
                    System.err.println(excep.getMessage());
                }
            }
        }
    }
}