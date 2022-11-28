package com.day6.assignment1;

import java.util.Iterator;
import java.util.List;

class Data{
    private String info;

    public Data(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
interface MyIterator extends Iterator {
    public boolean hashNext();
    public  Object next();
    public void remove();
}

class DataCollection implements Iterable<Object>{
    private List<Data> data;

    public DataCollection(List<Data> data) {
        this.data = data;
    }

    @Override
    public Iterator<Object> iterator() {
        return new MyIteratorImp();
    }
    class MyIteratorImp implements MyIterator{

        @Override
        public boolean hashNext() {
            return false;
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }
}
public class Main {
    public static void main(String[] args) {
        DataCollection dataCollection=new DataCollection();
        dataCollection.iterator();
    }
}