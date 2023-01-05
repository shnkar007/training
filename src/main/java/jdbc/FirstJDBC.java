package jdbc;

import java.sql.*;
import java.util.Properties;

public class FirstJDBC {
    public Connection getConnection() {
        Connection conn = null;
        try {
            String userName = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost/training";
            Properties props = new Properties ( );
            props.put ("user", userName);
            props.put ("password", password);
            conn = DriverManager.getConnection (url, props);
            System.out.println ("Connection successful");
        } catch (Exception e) {
            e.printStackTrace ( );
        }
        return conn;
    }

    public void retrieveData() {
        Connection conn = getConnection ( );
        try {
            Statement stmt = conn.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE );
            ResultSet rs = stmt.executeQuery ("select * from mytraining");

            while (rs.next ( )) {
                System.out.println ("course name " + rs.getString ("name"));
            }
            rs.moveToInsertRow ();
            rs.updateInt("course_id",3);
            rs.updateString("name","cybersecurity");
            rs.updateString("duration","60");
            rs.updateInt("id",7);
            rs.insertRow ();
        } catch (SQLException e) {

        } finally {
            if (conn != null) {
                try {
                    conn.close ( );
                } catch (SQLException e) {

                }
            }
        }
    }

    public void callableStatementDemo(){
        Connection conn = getConnection();
        String name = null;
        String proc = "create procedure training.courseproc1(" +
                "OUT coursenm varchar(45))"+"\n"+
                "BEGIN"+"\n"+
                "select name into coursenm where course_id = 2;"+"\n"+
                "END"+"\n" ;
        try{
             Statement statement = conn.createStatement();

            //statement.executeUpdate (proc);
            CallableStatement stmt = conn.prepareCall("{?=call training.courseproc1()}");
            if(stmt!=null){
           //stmt.setInt(2,2);
            stmt.registerOutParameter (1,Types.VARCHAR);
            stmt.execute();
            }else{
                System.out.println("procedure contains null");
            }
            if(stmt.getString(1)!=null){
                name=stmt.getString(1);
            }
            System.out.println("course name is null");
            //name=stmt.getString(2);
           // System.out.println(name);
        }catch(SQLException e){
            e.printStackTrace ();
        }
    }

    public void insert() {
        Connection conn = getConnection ( );
        try {
            Statement stmt = conn.createStatement ( );
            stmt.executeUpdate ("insert into training.mytraining values(2,'ai','45',2)");

        } catch (SQLException e) {

        } finally {
            if (conn != null) {
                try {
                    conn.close ( );
                } catch (SQLException e) {

                }
            }
        }
    }
        public static void main (String[] args){
            FirstJDBC fJdbc = new FirstJDBC ( );
            //fJdbc.getConnection ( );
           // fJdbc.insert ();
            //fJdbc.retrieveData ();
            fJdbc.callableStatementDemo();
        }
  }

