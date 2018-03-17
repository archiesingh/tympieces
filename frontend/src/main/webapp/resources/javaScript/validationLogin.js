function validationLogin()
{
	var result=true;
	var i=document.getElementsByTagName("input");
	if(i[0].value.length==0){
		alert("Please enter the UserName");
		return false;
	}
	else if(i[1].value.length==0){
		alert("Please enter the Password");
		return(result);
	}
	return true;
}