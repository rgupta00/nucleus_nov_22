package com.day1.pra;

import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;

class MyResouce implements AutoCloseable{
    @Override
    public void close() throws Exception {
        throw new SQLException("ex exception");
    }
}

public class DemoEx {
    public static void main(String[] args) {
        try(MyResouce r=new MyResouce()){
            if(1==1)
                throw new IOException();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
