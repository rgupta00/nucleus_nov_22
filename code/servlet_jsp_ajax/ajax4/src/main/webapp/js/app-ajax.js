$(document).ready(function() {
	$('#userName').keyup(function() {
	    let info=$('#userName').val();
		$.ajax({
			url : 'checkusername.jsp?ver=' + info,
			success : function(responseText) {
				$('#ajaxGetUserServletResponse').html(responseText);
			}
		});
	});
});