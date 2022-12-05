package com.c;
class MyResource implements AutoCloseable{
    public void myResourceProcessing(){
        throw new RuntimeException("run time ex");
    }
    @Override
    public void close() throws Exception {
        throw new NullPointerException("npe");
    }
}
public class A_Demo {

    private static void myFuncation() throws Exception{
        try (MyResource resource= new MyResource()) {
            resource.myResourceProcessing();
        }
    }
    public static void main(String[] args)  {
       try{
           myFuncation();
       }catch (Exception ex){
           System.out.println("Exception encountered: " + ex.toString());
           final Throwable[] suppressedExceptions = ex.getSuppressed();
               for (final Throwable exception : suppressedExceptions) {
                   System.out.println("tt" + exception.toString());
               }

       }
    }

}
