import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mulesoft {
	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:movie.db");
			// String query = "INSERT INTO movies values('ROBO','rajinikanth','aishwarya
			// rai','shakar',2010)";
			// String query = "INSERT INTO movies
			// values('jersey','nani','shraddha','gowtham',2)";
			// String query = "CREATE TABLE movies(movie_name VARCHAR(20),actor VARCHAR(20),
			// " + " actress VARCHAR(20), director VARCHAR(20), " + "Release_Year INT )";
			String query = "SELECT * FROM movies";

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {

				System.out.println(rs.getString(1) + ":" + rs.getString(2) + ":" + rs.getString(3) + ":"
						+ rs.getString(4) + ":" + rs.getInt(5));
			}

			st.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
