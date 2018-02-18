function validationAddSupplier()
{
	var result=true;
	var i=document.getElementsByTagName("input");
	if(i[0].value.length==0){
	result=false;
		alert("Please enter the Supplier name");
	}
	else if(i[1].value.length==0){
		result=false;
		alert("Please enter the Supplier Description");
	}
	return(result);
}