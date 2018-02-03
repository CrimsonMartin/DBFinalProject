package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCStaticMain {

	private static Connection conn = null;
	private static Statement stat = null;
	
	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost/CWRUDrinks";
			Properties props = new Properties();
			props.setProperty("user" ,  "postgres");
			props.setProperty("password" ,  "123456");
			conn = DriverManager.getConnection(url ,  props);
			stat = conn.createStatement();
			
			queryOne();
			
			System.out.println("");
			System.out.println("*********************************************************************");
			System.out.println("");
			
			queryTwo();
			
			System.out.println("");
			System.out.println("*********************************************************************");
			System.out.println("");
			
			queryThree();
			
			System.out.println("");
			System.out.println("*********************************************************************");
			System.out.println("");
			
			queryFour();
			
			stat.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void queryOne() {
		try {
			System.out.println("!!!FIND PLACES OF SERVICE THAT SERVE BEER BUT NOT WHISKEY!!!"); 
			ResultSet rs = stat.executeQuery("SELECT DISTINCT p.name, p.address "
										+	"FROM Place_Of_Service p, Drink d, Sells s "
										+	"WHERE d.type = 'beer' AND "
										+	"s.drinkname = d.name AND "
										+	"s.pos_id = p.id "
										+   "EXCEPT "
										+   "SELECT DISTINCT p.name, p.address "
										+	"FROM Place_Of_Service p, Drink d, Sells s "
										+	"WHERE d.type = 'whiskey' AND "
										+	"s.drinkname = d.name AND "
										+	"s.pos_id = p.id "); 
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void queryTwo() {
		try {
			System.out.println("!!!FIND THE ATTENDENCE FOR EACH EVENT!!!"); 
			ResultSet rs = stat.executeQuery("SELECT e.name, e.dateofevent, COUNT(a) "
											+ "FROM Event e, Attend a "
											+ "Where e.name = a.eventname "
											+ "GROUP BY e.name, e.dateofevent ");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " , " + rs.getString(2) + " , " + rs.getString(3));
			}
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void queryThree() {
		try {
			System.out.println("!!!FIND BEST RATED BARTENDERS, THEIR WORK PLACE, AND THEIR SHIFT!!!"); 
			ResultSet rs = stat.executeQuery("SELECT b.name, b.rating, w.start_shift, w.end_shift, p.name, p.address "
											+ "FROM Bartender b, Works w, Place_Of_Service p "
											+ "WHERE b.name = w.bartendername AND "
													+ "W.POS_ID = p.ID AND "
													+ "b.rating >= ALL (SELECT rating "
																	+ "FROM bartender); "); 
			while (rs.next()) {
				System.out.println(rs.getString(1) + " , " + rs.getString(2) + " , " + rs.getString(3) + " , " + rs.getString(4) + " , " + rs.getString(5) + " , " + rs.getString(6));
			}
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void queryFour() {
		try {
			System.out.println("!!!FIND PLACES OF SALE, THEIR OWNER AND ITS AVERAGE PRICE PER DRINK!!!"); 
			ResultSet rs = stat.executeQuery("SELECT p.name, m.name, avg(s.price) " 
											+"FROM Place_Of_Service p, manager m, manages q, sells s "
											+"WHERE p.id = q.pos_id AND "
													+"q.mid = m.mid AND "
													+"s.pos_id = p.id "
											+"GROUP BY p.name, m.name ");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " , " + rs.getString(2) + " , " + rs.getString(3));
			}
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


