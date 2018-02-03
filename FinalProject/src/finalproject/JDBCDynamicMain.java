package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JDBCDynamicMain {

	private static Connection conn = null;
	private static Statement stat = null;
	
	public static void main(String[] args) {

		
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost/CWRUDrinks";
			Properties props = new Properties();
			props.setProperty("user", "postgres");
			props.setProperty("password", "123456");
			conn = DriverManager.getConnection(url, props);
			stat = conn.createStatement();
			Scanner scanner = new Scanner(System.in);
			
			queryOne(scanner);
			
			System.out.println("");
			System.out.println("*********************************************************************");
			System.out.println("");
			
			queryTwo(scanner);
				
			System.out.println("");
			System.out.println("*********************************************************************");
			System.out.println("");
			
			queryThree(scanner);
			
			System.out.println("");
			System.out.println("*********************************************************************");
			System.out.println("");
			
			queryFour(scanner);
			
			System.out.println("");
			System.out.println("*********************************************************************");
			System.out.println("");
			
			queryFive(scanner);
			
			System.out.println("");
			System.out.println("*********************************************************************");
			System.out.println("");
			
			querySix(scanner);
			
			
			stat.close();
			conn.close();
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void queryOne(Scanner scanner){
		try {
			
			System.out.println("!!! INPUT A PLACE OF SERVICE TO SEE EVENTS IT HOSTS !!!");	
			String input = scanner.nextLine();
			ResultSet rs = stat.executeQuery("SELECT e.name, e.startTime, e.dateOfEvent "
											+ "FROM Place_of_Service p, Hosts h, Event e "
											+ "WHERE p.name = '" + input + "' AND "
													+ "p.id = h.pos_id AND "
													+ "h.eventname = e.name"); 
			while (rs.next()) {
				System.out.println(rs.getString(1) + " , " + rs.getString(2) + " , " + rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void queryTwo(Scanner scanner){
		try {
			
			System.out.println("!!! INPUT DRINK NAME TO FIND CHEAPEST PRICE AND WHERE TO BUY IT !!!");	
			String input = scanner.nextLine();
			ResultSet rs = stat.executeQuery("SELECT p.name, p.address, s.price "
											+"FROM Place_Of_Service p, Sells s "
											+"WHERE s.drinkname = '" + input + "' AND "
													+"s.pos_id = p.id AND "
													+"s.price <= ALL (SELECT s2.price "
																	+"FROM Sells s2 "
																	+"WHERE s2.drinkname= '" + input + "') "); 
			while (rs.next()) {
				System.out.println(rs.getString(1) + " , " + rs.getString(2) + " , " + rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void queryThree(Scanner scanner){
		try {
			
			System.out.println("!!! INPUT DAY OF THE WEEK TO SEE ALL OPEN PLACES AND HOURS !!!");	
			String input = scanner.nextLine();
			ResultSet rs = stat.executeQuery("SELECT p.name, o.open_hour, o.close_hour "
											+"FROM Place_Of_Service p, Operational_Times o, is_Open i "
											+"WHERE o.open_day = '" + input + "' AND "
													+"o.OT = i.OT AND "
													+"i.POS_ID = p.id"); 
			while (rs.next()) {
				System.out.println(rs.getString(1) + " , " + rs.getString(2) + " , " + rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void queryFour(Scanner scanner){
		try {
			
			System.out.println("!!! INPUT A COUNTRY TO FIND ALCOHOL MADE IN THAT COUNTRY !!!");	
			String input = scanner.nextLine();
			ResultSet rs = stat.executeQuery("SELECT d.name, d.type "
											+"FROM Drink d, Company c, Makes m "
											+"WHERE c.country = '" + input + "' AND "
													+"c.cname = m.cname AND "
													+"m.drinkname = d.name "); 
			while (rs.next()) {
				System.out.println(rs.getString(1) + " , " + rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void queryFive(Scanner scanner){
		try {
			
			System.out.println("!!! FIND DRINKS AND THEIR LOCATIONS FOR THIS PRICE OR LESS !!!");	
			String input = scanner.nextLine();
			ResultSet rs = stat.executeQuery("SELECT p.name, s.drinkname, s.price "
        						+"FROM Place_of_Service p, Sells s "
        						+"WHERE p.id = s.pos_id AND "
        								+"s.price <= " + input
        						+"ORDER BY p.name");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " , " + rs.getString(2) + " , " + rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void querySix(Scanner scanner){
		try {
			
			System.out.println("!!! ENTER A GRADUATION YEAR AND SEE NUMBER OF DRINKS CONSUMED BY TYPE FOR THAT CLASS !!!");	
			String input = scanner.nextLine();
			ResultSet rs = stat.executeQuery("SELECT d.type, sum(b.num_bought) "
											+"FROM Student s, Drink d, Buys b "
											+"WHERE s.year = " + input + " AND "
													+"b.sid = s.sid AND "
													+"d.name = b.drinkname "
											+"GROUP BY d.type ");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " , " + rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}