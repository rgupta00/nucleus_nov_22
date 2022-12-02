package com.day1.pra;
class TryException extends Exception {
}

class FinallyException extends Exception {
}

public class ExSuppress {
    public static void main(String[] args) {
        try{
            callMethod();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void callMethod() throws Exception{
        Throwable t=null;
        try{
            if(1==1)
                throw new TryException();
        }catch (Exception e){
            t=e;
        }
        finally {
            FinallyException ex=new FinallyException();
            ex.addSuppressed(t);
            throw ex;
        }
    }
}

