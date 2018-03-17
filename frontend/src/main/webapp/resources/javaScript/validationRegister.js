function validationRegister()
{
	var result=true;
	var i=document.getElementsByTagName("input");
	if(i[0].value.length==0){
		alert("Please enter the UserName");
	return false;
	}
		else if(i[1].value.length==0){
		alert("Please enter the Name");
	return false;
		}
		else if(i[2].value.length==0){
		alert("Please enter the Email Address");
	return false;
		}
		else if((i[3].value.length==0)||(i[3].value.length<=9)){
		
		alert("Please Mobile Number");
		}
		else if(i[4].value.length==0){
		alert("Please select your  Password");
		}
	return 	true;
}