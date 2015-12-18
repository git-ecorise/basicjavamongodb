$(document).ready(function(){

	 var inputdata=$("#input").val();
	
	$("#btnSearchStudent").click(function(){
		if (inputdata=="") {
		$("#tableStudent td").remove();
		var input=$("#input").val(); 

	var table=$("#tableStudent");
	
		$.ajax({
			method:"Post",
			url:"SearchStudentController",
			data:{
				id:input,
			},
			success:function(data)
			{
				$("#row ").remove();
				$.each(data,function(key,value){
					table.append('<tr id="row1"><td id="rollno">'+value.rollno+'</td><td id="name">'+value.name+'</td><td id="branch">'+value.branch+'</td><td id="add">'+value.add+'</td></tr>');
					})
			}
		})
		}
		else
			{
			alert("Please Enter Correct Rollno..!");
			}
	})
	
});
