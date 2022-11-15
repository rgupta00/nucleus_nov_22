package a.b;

 public class A {
  private  int i=88;
  int j=66;
  protected int  k=99;
  public int m=7777;

  private void fooPrivate(){
   System.out.println("foo private method");
  }
   void fooDefault(){
   System.out.println("foo default method");
  }
  protected void fooProteted(){
   System.out.println("foo protected method");
  }
  public void fooPublic(){
   System.out.println("foo public method");
  }
}
