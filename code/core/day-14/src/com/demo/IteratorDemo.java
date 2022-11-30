package com.demo;

import java.util.Iterator;
import java.util.Objects;

class Loan{
  private int id;
  private String name;

}
class Bank implements MyIterable{

 @Override
 public MyIterator iterator() {
  return new MyIteratorImpl();
 }
 class MyIteratorImpl implements MyIterator{
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
interface  MyIterator {
 boolean hasNext();
 Object next();
 void remove();
}
interface MyIterable{
 MyIterator  iterator();
}

public class IteratorDemo {

 public static void main(String[] args) {

 }
}