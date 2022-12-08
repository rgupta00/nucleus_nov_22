package com.hello;
import java.sql.*;//from JSR
public class A_HelloWorldJdbc {
    public static void main(String[] args) {
        //load the drive
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
       }catch (ClassNotFoundException ex){
           ex.printStackTrace();
       }

        Connection connection=null;
      try{
           connection=DriverManager
                  .getConnection("jdbc:mysql://localhost:3306/nu22","root","root");

          //Statement vs PreparedStatement vs CallableStatement
          Statement stmt=connection.createStatement();

          //executeQuery        vs executeUpdate        vs execute
          //select, rs              cud, no of row          if i dont know the type of query
                                    //effective             i am taking quary from user at run time

          ResultSet rs=stmt.executeQuery("select * from emp");
          while (rs.next()){
              System.out.println(rs.getInt("id")+" : "+ rs.getString("name")+" : "+ rs.getDouble("salary"));
          }
          System.out.println("con is done");
      }catch (SQLException ex){
          ex.printStackTrace();
      }finally {
         try{
             connection.close();
         }catch (SQLException e){
             e.printStackTrace();
         }
      }
    }
}
