<html>
<body>
<h3>Welcome to Register Page</h3>
<form action="save" method="post">
<pre>
Locations:
<select name="locs" multiple="multiple">
	<option value="HYD">HYD</option>
	<option value="BAN">BAN</option>
	<option value="CHN">CHN</option>
	<option value="DHL">DHL</option>
</select>
ID   : <input type="text" name="empId"/>	
NAME : <input type="text" name="empName"/>	
SAL  : <input type="text" name="empSal"/>
Gender:
 <input type="radio" name="empGen" value="Male">Male
 <input type="radio" name="empGen" value="Female">Female
Address:<textarea name="addr"></textarea>
Project: 
 <select name="empPrj">
 	<option value="">-SELECT-</option>
 	<option value="P1">P1</option>
 	<option value="P2">P2</option>
 	<option value="P3">P3</option>
 </select>  
Languages:
<input type="checkbox" name="langs" value="English"/>English 
<input type="checkbox" name="langs" value="Hindi"/>Hindi 
<input type="checkbox" name="langs" value="Telugu"/>Telugu 
<input type="checkbox" name="langs" value="kannada"/>Kannada 
<input type="submit" value="Register"/>	
</pre>
</form>
</body>
</html>
