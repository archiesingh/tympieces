function validationAddCategory()
{
	var result=true;
	var i=document.getElementsByTagName("input");
	if(i[0].value.length==0)
	result=false;
	if(!result)
		alert("Please enter the Category name");
	else if(i[1].value.length==0)
		result=false;
	if(!result)
		alert("Please enter the Category Description");
	return(result);
}