function validation()
{
	var result=true;
	var i=document.getElementsByTagName("input");
	if(i[0].value.length==0){
		alert("Please enter the product name");
		return false;
	}
	else if(i[1].value.length==0){
		alert("Please enter the product price");
	return false;
	}
	else if(i[2].value.length==0){
		alert("Please enter the quantity");
	return false;
	}
	else if(i[3].value.length==0){
		alert("Please enter dial color");
	return false;
	}
	else if(i[4].value.length==0){
	alert("Please enter band color");
	return false;
	}
	else if(i[5].value.length==0){
		alert("Please enter watch moment type");
	return false;
	}
	else if(i[6].value.length==0){
		alert("Please enter watch display type");
	return false;
	}
	else if(i[7].value.length==0){
		alert("Please enter case material");
	return false;
	}
	else if(i[8].value.length==0){
		alert("Please enter water resistence depth");
	return false;
	}
	else if(i[9].value.length==0){
		alert("Please enter warrenty");
	return false;
	}
	else if(i[12].value.length==0){
		alert("Please select a picture");
		return false;
	}
return true;
}