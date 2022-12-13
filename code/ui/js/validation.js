function validate(){
  var name=document.getElementById("nameId").value;
  var password=document.getElementById("passId").value;

  if(name==""){
    document.getElementById("nameMsg").innerHTML="Enter name";
    document.getElementById("nameMsg").style.color="red";
    return false;
  }

  if(password==""){
    document.getElementById("passwordMsg").innerHTML="Enter password";
    document.getElementById("passwordMsg").style.color="red";
    return false;
  }

  return true;

}
