$(document).ready(function(){

	$("#logout").click(function(e){
		e.preventDefault();
		$("#logout-form").submit();
	});
});