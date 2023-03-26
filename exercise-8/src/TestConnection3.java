import java.sql.*;

class MakeConnection {
    Connection con;
    Statement stmt;
    ResultSet rs;
    MakeConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "thanika@18");
            stmt = con.createStatement();
            
            stmt.executeUpdate(" insert into pradeep values (001,'sakre',23)");
            int i2 = stmt.executeUpdate(" insert into pradeep values (001,'pradeep',223)");
            int i3 = stmt.executeUpdate(" insert into pradeep values (001,'vivek',243)");
            rs = stmt.executeQuery("select * from pradeep");
            while (rs.next())
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + "" + rs.getInt(3));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class TestConnection3 {
    public static void main(String args[]) {
        new MakeConnection();
    }
}