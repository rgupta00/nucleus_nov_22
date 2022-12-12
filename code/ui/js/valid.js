function validate(){
    var isValid=true;
    var name=document.getElementById('myNameId').value;
    var password=document.getElementById('myPassId').value;
    var phoneno=document.getElementById('phoneno').value;
    var emailId=document.getElementById('emailId').value;

    if(isBlank(name)){
        document.getElementById('nameMsg').innerHTML="enter name";
        document.getElementById('nameMsg').style.color='red';

        isValid=false;
    }
    if(isBlank(password)){
        document.getElementById('passMsg').innerHTML="enter password";
        document.getElementById('passMsg').style.color='red';
        isValid=false;
    }
    if(isBlank(phoneno)){
        document.getElementById('phonenoMsg').innerHTML="enter phoneno";
        document.getElementById('phonenoMsg').style.color='red';
        isValid=false;
    }
    if(!isValidPhoneNumber(phoneno)){
        document.getElementById('phonenoMsg').innerHTML="enter valid phoneno";
        document.getElementById('phonenoMsg').style.color='red';
        isValid=false;
    }
   
    if(!isValidEmail(emailId)){
        document.getElementById('emailidMsg').innerHTML="enter valid email";
        document.getElementById('emailidMsg').style.color='red';
        isValid=false;
    }
    return isValid;
}
function isBlank(val){
    return (val=='')?true:false;
}

function isValidEmail(email){
    var eamilRE=/^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$/;
    if(email.match(eamilRE)){
        return true;
    }else
    return false;

}
function isValidPhoneNumber(phoneNo){
    var phoneRE = /^[2-9]{2}[0-9]{8}$/;
    if(phoneNo.match(phoneRE)){
        return true;
    }else
    return false;
}