$(document).ready(function(e){
  $("button").click(function(e){
	  e.preventDefault();
    $.ajax({url: "/findcuurency", 
    	data: {
    		username: $("#username").val(),
    		Currency: $("#Currency").val()
        },
        contentType: "application/json; charset=utf-8",
    	success: function(result){
    		
    	console.log("test"+result);
      $("#divCheckbox").html(result);
    }});
  });
});