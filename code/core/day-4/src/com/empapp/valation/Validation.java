package com.empapp.valation;

public class Validation {
    private Validation(){}
    public static  boolean isValidId(Integer id){
        return id.toString().length()==5;
    }

    //IT, SALES, HR, FIN
    public static boolean isValidDept(String  deptName){
        if(deptName==null)
            return  false;
        return  deptName.matches("IT|SALES|HR|FIN");
    }

    public static boolean isValidPhoneNumber(String  phoneNumber){
        if(phoneNumber==null)
            return  false;

        return  phoneNumber.matches("(0|91)?[6-9][0-9]{9}");

    }

}
