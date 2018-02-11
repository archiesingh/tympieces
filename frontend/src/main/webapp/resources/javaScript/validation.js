function validation()
{
	var result=true;
	var i=document.getElementsByTagName("input");
	if(i[0].value.length==0)
	result=false;
	else if(i[1].value.length==0)
		result=false;
	else if(i[2].value.length==0)
		result=false;
	else if(i[3].value.length==0)
		result=false;
	else if(i[4].value.length==0)
		result=false;
	else if(i[5].value.length==0)
		result=false;
	else if(i[6].value.length==0)
		result=false;
	if(!result)
		alert("Please match validation");
return(result);
}