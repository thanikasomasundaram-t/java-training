import java.sql.*;

class Connector {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    Connector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "thanika@18");
            statement = connection.createStatement();
            
            statement.execute("create table pradeep(id int, name varchar(20), dept int)");
            
            statement.executeUpdate(" insert into pradeep values (001,'sakre',23)");
            statement.executeUpdate(" insert into pradeep values (002,'pradeep',223)");
            statement.executeUpdate(" insert into pradeep values (003,'vivek',243)");
            resultSet = statement.executeQuery("select * from pradeep");
            while (resultSet.next())
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + "" + resultSet.getInt(3));
            
            statement.execute("drop table pradeep");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ConnectionTest {
    public static void main(String args[]) {
        new Connector();
    }
}