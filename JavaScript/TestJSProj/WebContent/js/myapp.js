function add(x, y) {
	if(x!=0 && y!=0) {
		return x + y;
	}
}

function myMessage() {

	var x = 10;
	var y;
/*	
	document.writeln("<h1>X = " + x + "</h1>");
	document.writeln("<h1>Y = " + y + "</h1>");
	
	console.log("X = " + x);
	console.log("Y = " + y);
*/	
	if(x > 50) {
		console.log("X is larger");
	}
	else if(x > 30) {
		console.log("x is large");
	}
	else {
		console.log("X is small");
	}
	
	switch(x) {
		case 1:
			console.log("x is 1");
			break;
		case 2:
			console.log("x is 2");
			break;
		default:
			console.log("x is default");
	}
	
	var day = "Sunday";
	switch(day) {
		case "Monday":
			console.log("Day is Monday");
			break;
		
	}
	
	var accountObj = { 
			"accid": 10,
			"accname": "Mike",
			"accbalance": 50000
	};
	/*
	accountObj = {
		"fixed_deposit": 100000
	}; //override
	*/
	
	accountObj["fixed_deposit"] = 100000; //Adding new property
	
	for (var accountProperty in accountObj) {
		console.log(accountProperty + " - " + accountObj[accountProperty]);
	}
}



















