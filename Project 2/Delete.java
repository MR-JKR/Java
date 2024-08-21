import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
          private static final String URL = "jdbc:mysql://localhost:3306/Demo1";
      private static final String USER = "root"; 
      private static final String PASSWORD = "skselva@2004"; 

      public static void main(String[] args) {
            try {
                  // Connection to the database
                  Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

                  // Delete Operation SQL query based on L_Name
                  String deleteSQL = "DELETE FROM Book_Beast WHERE L_Name = ?";
                  PreparedStatement deleteStatement = con.prepareStatement(deleteSQL);

                  // Set the last name for the record to delete
                  deleteStatement.setString(1, "kannan"); // Last name (L_Name)

                  // Execute the delete operation
                  int rowsDeleted = deleteStatement.executeUpdate();
                  if (rowsDeleted > 0) {
                        System.out.println("Delete operation completed. Rows deleted: " + rowsDeleted);
                  } else {
                        System.out.println("No rows deleted. Check the provided last name.");
                  }

            } catch (SQLException e) {
                  System.out.println("Error during delete: " + e.getMessage());
            }
      }
}
