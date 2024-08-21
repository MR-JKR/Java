import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Insert{
    public static void main(String[]args){
        String URL="jdbc:mysql://localhost:3306/demo1";
        String USER="root";
        String PASSWORD="skselva@2004";
        try{
            Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
            String insertSQL="INSERT INTO Book_Beast(book_id,F_Name,L_Name,Email,Published_Date)VALUES(?,?,?,?,?)";
            PreparedStatement insertStatement=con.prepareStatement(insertSQL);
            insertStatement.setString(1,"101");
            insertStatement.setString(2,"Selva");
            insertStatement.setString(3,"Kumar");
            insertStatement.setString(4,"skselva984@gmail.com");
            insertStatement.setString(5,"2024-08-19");
            insertStatement.executeUpdate();
            System.out.println("Insert operation  completed");
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
    }
}
