package com.day15.session1.io.basics;

class TryException extends Exception { }
class FinallyException extends Exception { }
public class SuppressedExceptions {
    public static void main(String[] args) throws Exception {
        try {
            callTryFinallyBlock();
        } catch (Exception e) {
            e.printStackTrace(); //Only Finally Exception is Caught**
        }
    }

    private static void callTryFinallyBlock() throws Exception {
        Throwable t = null;
        try
        {
            throw new TryException();
        }
        catch (Exception e) {
            t = e;
        }
        finally
        {
            FinallyException fEx = new FinallyException();
            if(t != null)
                fEx.addSuppressed(t);
            throw fEx;
        }

//        try {
//            throw new TryException();//This is lost**
//        }
//        finally{
//            FinallyException fEx = new FinallyException();
//            throw fEx;
//        }
    }
}