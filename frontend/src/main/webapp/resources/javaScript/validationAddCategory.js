function validationAddCategory()
{	var i=document.getElementsByTagName("input");
	var j=document.getElementsByTagName("textarea");
	if(i[0].value.length==0){
		alert("Please enter the Category name");
		return false;
	}
	if(j[0].value.length==0){
		alert("Please enter the Category Description");
		return false;
	}
	return true;
}