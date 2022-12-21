function load(id, url){
	
	var ajaxObject=null; 
	
	 if (window.XMLHttpRequest)
		 ajaxObject=new XMLHttpRequest(); 
	 
	 else if(window.ActiveXObject) /*ie 6 and 7*/
		 ajaxObject=new ActiveXObject("Microsoft.XMLHTTP"); 
	 
	 if(ajaxObject!=null){ 
		 /*Open an GET request for resource url asynch.*/
		 ajaxObject.open("GET",url,true);
		 ajaxObject.send(null);
	 }
	 else{
		 alert("Not having suitable browser ...");
	 }
	 
	ajaxObject.onreadystatechange=function(){
		if(ajaxObject.readyState==4 && ajaxObject.status==200){
			document.getElementById(id).innerHTML=ajaxObject.responseText;
		}
	};

}