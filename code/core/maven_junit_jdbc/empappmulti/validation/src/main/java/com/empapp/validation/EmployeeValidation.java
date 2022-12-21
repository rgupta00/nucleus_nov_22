package com.empapp.validation;

public class EmployeeValidation {
    //M, F
    public static boolean isValidGender(String genderType){
        if (genderType==null)
            return false;
        return genderType.matches("M|F");
    }


    public static boolean isValidDate(String dateString){
        if (dateString==null)
            return false;
        return dateString.matches("([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]");
    }

    public static boolean isValidEmailId(String emailId){
        if (emailId==null)
            return false;
        return emailId.matches("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
    }

    public static boolean isValidPhoneNo(String phoneNo){
        if (phoneNo==null)
            return false;
        return phoneNo.matches("(0|91)?[789][0-9]{9}");
    }
}
