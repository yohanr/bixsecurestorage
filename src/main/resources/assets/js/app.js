$(function() {
	$.getJSON( "/user", function( data ) {
		var users = "";
		$.each( data, function( key, value ) {
			users += "<option value='" + value.id + "'>" + value.name + "</option>";
		});
		
		$("#mock_user").append(users);
		$('#mock_user').selectpicker('refresh');
	});
});