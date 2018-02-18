function validationShipping()
{
	var result=true;
	var i=document.getElementsByTagName("input");
	if(i[0].value.length==0)
	result=false;
	if(!result)
		alert("Please enter the UserName");
	else if(i[1].value.length==0)
		result=false;
	if(!result)
		alert("Please enter the Name");
	else if(i[2].value.length==0)
		result=false;
	if(!result)
		alert("Please enter the Email Address");
	else if((i[3].value.length==0)||(i[3].value.length<=9))
		result=false;
	if(!result)
		alert("Please Mobile Number");
	else if(i[4].value.length==0)
		result=false;
	if(!result)
		alert("Please select your  Password");
		return(result);
}