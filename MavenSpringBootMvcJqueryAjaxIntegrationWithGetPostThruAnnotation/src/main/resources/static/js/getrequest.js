$( document ).ready(function() {
	// GET REQUEST
	$("#getAllCustomerId").click(function(event){
		event.preventDefault();
		ajaxGet();
	});
	
	// DO GET
	function ajaxGet(){
		$.ajax({
			type : "GET",
			url : window.location + "api/customer/all",
			success: function(result){
				if(result.status == "Done"){
					$('#getResultDiv ul').empty();
					var custList = "";
					$.each(result.data, function(i, customer){
						var customer = "- Customer Id = " + i + ", Name = " + customer.name + ", Age = " + customer.age + ", City = " + customer.city + "<br>";
						$('#getResultDiv .list-group').append(customer)
			        });
					console.log("Success: ", result);
				}else{
					$("#getResultDiv").html("<strong>Error</strong>");
					console.log("Fail: ", result);
				}
			},
			error : function(e) {
				$("#getResultDiv").html("<strong>Error</strong>");
				console.log("ERROR: ", e);
			}
		});	
	}
})