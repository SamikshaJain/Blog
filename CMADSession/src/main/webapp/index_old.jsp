<html>
<head>
    <meta charset="utf-8">
<script type="text/javascript" src="scripts/jquery-2.2.3.js"></script>
<script>
$(document).ready(function() {
	$.get("rest/user", function(data){
		var rowTemplate = $("#templates table").html();
		console.log(rowTemplate );
		for(index in data){
			var row = rowTemplate.replace("username",data[index].name)
						.replace("email",data[index]. emailId)
						.replace("agey",data[index].age);
			$("#users").append(row);
		}
	});
});
</script>
  </head>
<body>
<div id="templates" style="display: none;">
	<table>
		<tr><td>username</td><td>email</td><td>age</td></tr>
	</table>
</div>
<table id="users">
<tr><td>User ID</td><td>Email</td><td>Age</td></tr>
</table>
</body>
</html>
