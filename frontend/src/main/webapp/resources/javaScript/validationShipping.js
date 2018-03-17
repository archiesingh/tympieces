function validationShipping()
{
	var result=true;
	var i=document.getElementsByTagName("input");
	if(i[0].value.length==0){
		result=false;
		alert("Please enter the Name");}
	else if((i[1].value.length==0)||(i[1].value.length!=10))
	{	result=false;
		alert("Please enter the Mobile Number 1");
	}
	else if(i[2].value.length==0)
	{	result=false;
		alert("Please enter the House Number");
	}
	else if(i[3].value.length==0)
	{	result=false;
		alert("Please enter City");
	}
	else if(i[4].value.length==0)
	{	result=false;
		alert("Please enter State");
	}
	else if(i[5].value.length==0)
	{	result=false;
		alert("Please enter Pin Code");
	}
	else if(i[6].value.length==0)
	{	result=false;
			alert("Please enter the Name");
	}
	else if((i[7].value.length==0)||(i[7].value.length!=10))
	{		result=false;
			alert("Please enter the Mobile Number");
	}
	else if(i[8].value.length==0)
	{		result=false;
			alert("Please enter the House Number");
	}
	else if(i[9].value.length==0)
	{		result=false;
			alert("Please enter City");
	}
	else if(i[10].value.length==0)
	{		result=false;
			alert("Please enter State");
	}
	else if(i[11].value.length==0)
	{		result=false;
			alert("Please enter Pin Code");
	}
	return(result);
}