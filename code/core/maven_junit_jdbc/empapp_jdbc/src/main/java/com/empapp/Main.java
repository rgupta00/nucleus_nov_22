package com.empapp;
import java.sql.*;//1. import java.sql
public class Main {
    public static void main(String[] args) {


        try( Connection connection=ConnectionFactory.getConnection()){

            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while (rs.next()){
                System.out.println(rs.getInt(1)+": "+
                        rs.getString("name")+": "+rs.getDouble("salary"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }





        //2. load the driver
//     try{
//         Class.forName("com.mysql.cj.jdbc.Driver");// oracle
//         System.out.println("---done---");
//     }catch (ClassNotFoundException e){
//         e.printStackTrace();
//     }
//        Connection connection=null;
//     try{
//        connection=    DriverManager.getConnection("jdbc:mysql://localhost:3306/nu22","root","root");
//       Statement stmt=connection.createStatement();
//       ResultSet rs=stmt.executeQuery("select * from emp");
//       while (rs.next()){
//           System.out.println(rs.getInt(1)+": "+
//                   rs.getString("name")+": "+rs.getDouble("salary"));
//       }
//     }catch (SQLException ex){
//         ex.printStackTrace();
//     }catch (Exception ex){
//         ex.printStackTrace();
//     }finally {
//         try {
//             connection.close();
//         } catch (SQLException e) {
//             throw new RuntimeException(e);
//         }
//     }

    }
}