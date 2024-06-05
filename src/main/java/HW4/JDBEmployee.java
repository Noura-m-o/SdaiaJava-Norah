package HW4;
import java.sql.*;


public class JDBEmployee {


    public static void main(String[] args) throws SQLException {

        String query = "select * from employees" ;

        try (Connection conn = ConnPoolConfig.getConnection();){
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                Employee employee = new Employee(rs);
                System.out.println(employee);
            }


        }
    }
}
