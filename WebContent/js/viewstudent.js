$(document).ready(function(){

	var table=$("#tableStudent");
		$.ajax({
			method:"Post",
			url:"viewstudentcontroller",
			success:function(data)
			{
				$("#row ").remove();
				$.each(data,function(key,value){
					table.append('<tr id="row1"><td id="rollno">'+value.rollno+'</td><td id="name">'+value.name+'</td><td id="branch">'+value.branch+'</td><td id="add">'+value.add+'</td></tr>');
					})
			}
	})
});
