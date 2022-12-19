$(document).ready(function() {
	$('#userName').keyup(function() {
		$.ajax({
			url : 'GetUserServlet',
			data : {
				userName : $('#userName').val()
			},
			success : function(responseText) {
				$('#ajaxGetUserServletResponse').text(responseText);
			}
		});
	});
});