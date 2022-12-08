package com.hello;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//A C   I   D  Spring framwork support declartive tx mgt
//@Tranactional

public class K_TxAccount {
    public static void main(String[] args) {
        Connection connection=null;
        try {
            connection = ConnectionFactory.getConnection();

            connection.setAutoCommit(false);

            PreparedStatement pstmt = connection
                    .prepareStatement("update account set balance=balance-10 where id=?");
            pstmt.setInt(1, 1);
            pstmt.executeUpdate();
            pstmt = connection.prepareStatement("update account set balance=balance+10 where id=?");
            pstmt.setInt(1, 2);
            pstmt.executeUpdate();

            connection.commit();

        } catch (SQLException e) {
           try{
               connection.rollback();
           }catch (SQLException ex){}
            e.printStackTrace();
        }
    }
}
