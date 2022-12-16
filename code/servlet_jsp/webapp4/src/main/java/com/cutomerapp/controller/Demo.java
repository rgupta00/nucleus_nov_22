package com.cutomerapp.controller;

import com.cutomerapp.dao.ConnectionFactory;

import java.sql.Connection;

public class Demo {
    public static void main(String[] args) {
        Connection connection= ConnectionFactory.getConnection();
        if(connection!=null)
            System.out.println("done");
    }
}
