function validate(){

    var name=document.getElementById("nameId").value;
    var pass=document.getElementById("passId").value;
    
    if(name==""){
        alert("name is blank");
        return false;
    }
        
    if(pass==""){
        alert("pass is blank");
        return false;
    }
    
    return true;


}
