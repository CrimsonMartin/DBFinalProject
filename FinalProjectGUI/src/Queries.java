
import java.sql.ResultSet;
import java.sql.Statement;


public class Queries {
    
    public static ResultSet queryOne(String inputOne) {
        ResultSet rs = null;
        try {
        Statement stat = FinalProjectGUI.stat;
        rs = stat.executeQuery("SELECT p.name, s.drinkname, s.price "
        						+"FROM Place_of_Service p, Sells s "
        						+"WHERE p.id = s.pos_id AND "
        								+"s.price <= " + inputOne
        						+"ORDER BY p.name");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public static ResultSet queryTwo(String inputOne) {
        ResultSet rs = null;
        try {
        Statement stat = FinalProjectGUI.stat;
        rs = stat.executeQuery("SELECT p.name, p.address, s.price "
							+"FROM Place_Of_Service p, Sells s "
							+"WHERE s.drinkname = '" + inputOne + "' AND "
									+"s.pos_id = p.id AND "
									+"s.price <= ALL (SELECT s2.price "
													+"FROM Sells s2 "
													+"WHERE s2.drinkname= '" + inputOne + "') ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public static ResultSet queryThree(String inputOne) {
        ResultSet rs = null;
        try {
        Statement stat = FinalProjectGUI.stat;
        rs = stat.executeQuery("SELECT e.name, e.startTime, e.dateOfEvent "
							+ "FROM Place_of_Service p, Hosts h, Event e "
							+ "WHERE p.name = '" + inputOne + "' AND "
									+ "p.id = h.pos_id AND "
									+ "h.eventname = e.name"); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public static ResultSet queryFour(String inputOne) {
        ResultSet rs = null;
        try {
        Statement stat = FinalProjectGUI.stat;
        rs = stat.executeQuery("SELECT d.type, sum(b.num_bought) "
								+"FROM Student s, Drink d, Buys b "
								+"WHERE s.year = " + inputOne + " AND "
										+"b.sid = s.sid AND "
										+"d.name = b.drinkname "
								+"GROUP BY d.type ");
        
        
        } catch (Exception e) {
            e.printStackTrace();
            if (FinalProjectGUI.stat == null) 
            	System.out.println("NULL STAT");
            if (FinalProjectGUI.conn == null)
            	System.out.println("NULL CONN");
            
            
        }
        return rs;
    }
}
