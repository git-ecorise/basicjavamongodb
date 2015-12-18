$(document).ready(function(){

	$("#btnAdd").click(function(){
		
		var rollno=$("#rollno").val();
		var name=$("#name").val();
		var branch=$("#branch").val();
		var add=$("#add").val();

		var jsonData=new Object();
		
		jsonData.rollno=rollno;
		jsonData.name=name;
		jsonData.branch=branch;
		jsonData.add=add;

		var dataJSON=JSON.stringify(jsonData);
			
			$.ajax({
				method:"GET",
				url:"AddStudent",
				data:{
					studentdata:dataJSON
				},
				success:function(data)
				{
					alert("Student Inserted Successfully");
			       // location.reload();
			        document.getElementById("addStudentform").reset();
				}
			})
					
	})
})