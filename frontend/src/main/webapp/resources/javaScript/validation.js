function validation()
{
	var result=true;
	var i=document.getElementsByTagName("input");
	if(i[0].value.length==0)
	result=false;
	if(!result)
		alert("Please enter the product name");
	else if(i[1].value.length==0)
		result=false;
	if(!result)
		alert("Please enter the product price");
	else if(i[2].value.length==0)
		result=false;
	if(!result)
		alert("Please enter the quantity");
	else if(i[3].value.length==0)
		result=false;
	if(!result)
		alert("Please enter dial color");
	else if(i[4].value.length==0)
		result=false;
	if(!result)
		alert("Please enter band color");
	else if(i[5].value.length==0)
		result=false;
	if(!result)
		alert("Please enter watch moment type");
	else if(i[6].value.length==0)
		result=false;
	if(!result)
		alert("Please enter watch display type");
	else if(i[7].value.length==0)
		result=false;
	if(!result)
		alert("Please enter case material");
	else if(i[8].value.length==0)
		result=false;
	if(!result)
		alert("Please enter water resistence depth");
	else if(i[9].value.length==0)
		result=false;
	if(!result)
		alert("Please enter warrenty");
	else if(i[12].value.length==0)
		result=false;
	if(!result)
		alert("Please select a picture");

return(result);
}