$(document).ready(function() {
	// SUBMIT FORM
    $("#customerForm").submit(function(event) {
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		ajaxPost();
	});
    
    function ajaxPost() {
    	// PREPARE FORM DATA
    	var formData = {
    		name : $("#name").val(),
    		age : $("#age").val(),
    		city : $("#city").val()
    	}
    	// DO POST
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url : window.location + "api/customer/save",
			data : JSON.stringify(formData),
			dataType : 'json',
			success : function(result) {
				if(result.status == "Done") {
					$("#postResultDiv").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" + 
												"Post Successfully! <br>" +
												"---> Customer's Info: Name = " + 
												result.data.name + " , Age = " + result.data.age + ", City = " + result.data.city + "</p>");
				} else {
					$("#postResultDiv").html("<strong>Error</strong>");
				}
				console.log(result);
			},
			error : function(e) {
				alert("Error!")
				console.log("ERROR: ", e);
			}
		});
    	// Reset FormData after Posting
    	resetData();
    }
    
    function resetData(){
    	$("#name").val("");
    	$("#age").val("");
    	$("#city").val("");
    }
});
