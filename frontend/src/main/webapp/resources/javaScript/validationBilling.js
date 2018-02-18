function validationBilling()
{
	var result=true;
	var i=document.getElementsByTagName("input");
	if(i[0].value.length==0)
	result=false;
	if(!result)
		alert("Please enter the Name");
	else if((i[3].value.length==0)||(i[3].value.length<=9))	
		result=false;
	if(!result)
		alert("Please enter the Mobile Number");
	else if(i[2].value.length==0)
		result=false;
	if(!result)
		alert("Please enter the House Number");
	else if(i[3].value.length==0)
		result=false;
	if(!result)
		alert("Please enter City");
	else if(i[4].value.length==0)
		result=false;
	if(!result)
		alert("Please enter State");
	else if(i[5].value.length==0)
		result=false;
	if(!result)
		alert("Please enter Pin Code");
	else if(i[6].value.length==0)
		result=false;
	return(result);
}