package AppPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class ConnectSQLite {

    Connection connection = null;
    ResultSet resultSet = null;
    Statement statement = null;
    PreparedStatement pst = null;
    
    
    public static void main(String[] args) {
    
    }
    
    public void  ConnectSQLite()
    {

    }

    public void updateTable(String query, JTable jt){
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:ems.db");
            pst = connection.prepareStatement(query);
            resultSet = pst.executeQuery();
            jt.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            System.out.println("Error1 : " +e.getMessage());
        } finally {
            try {
                //statement.close();
                connection.close();
                resultSet.close();
                pst.close();
            } catch (Exception e) {
                System.out.println("Error2 : " + e.getMessage());
            }
        }
        
    }
    
    
    
    public void InsertData(String query) {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:ems.db");
            System.out.println("Success !!");
            statement = connection.createStatement();
            statement.executeUpdate(query);
            
        } catch (Exception e) {
            System.out.println("Error : " + e);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.out.println("Error : " + e.getMessage());
            }
        }
    }


    public String readData(String query,String columnName) {
        String name1 = "";
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:ems.db");
            System.out.println("Success !!");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            String name = resultSet.getString(columnName);
            name1 = name;
            
//            while (resultSet.next()) {
//                System.out.println("EMPLOYEE NAME:" + );
//            }
            
        } catch (Exception e) {
            System.out.println("Error : " +e.getMessage());
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.out.println("Error : " +e.getMessage());
            }
        }
        return name1;
    }
}
