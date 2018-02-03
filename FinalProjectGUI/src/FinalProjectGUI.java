import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class FinalProjectGUI {

    public static Connection conn;
    public static Statement stat;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
        	while (conn == null || stat == null || !conn.isValid(5)) {
	            Class.forName("org.postgresql.Driver");
	            String url = "jdbc:postgresql://localhost/CWRUDrinks";
	            Properties props = new Properties();
	            props.setProperty("user", "postgres");
	            props.setProperty("password", "123456");
	            conn = DriverManager.getConnection(url, props);
	            stat = conn.createStatement();
	            
        	}
        } catch (Exception e) {
            e.printStackTrace(); 
        }
        if (conn != null)
        	System.out.println("Got conn");
        if (stat != null)
        	System.out.println("Got Stat");
        if ((conn != null) && (stat != null)) {
	        JFrameForm form = new JFrameForm();
	        form.setVisible(true); 
        }
    }
    
}
