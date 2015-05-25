$(function() {
//	Load mock users
	$.getJSON( "/user", function( data ) {
		var users = "";
		$.each( data, function( key, value ) {
			users += "<option value='" + value.id + "'>" + value.name + "</option>";
		});
		
		$("#mock_user").append(users);
		$('#mock_user').selectpicker('refresh');
	});
	
//	Initiate FileUpload plugin (Kartik)
	
	$("#file-input").fileinput({
			showCaption: false,
		 	uploadUrl: "/file/upload", // server upload action
		    uploadAsync: true,
		    maxFileCount: 1
	});
	
	
	
//	Load file details
	$.getJSON( "/file", function( data ) {
		var files = "";
		$.each( data, function( key, value ) {
			files += "<tr>";
			files += "<th scope='row'>" + value.id + "</th>";
			files += "<td>" + value.name + "</td>";
			files += "<td>" + value.desc + "</td>";
			files += "<td></td>";
			files += "<td>" + value.credate + "</td>";
			files += "<td></td>";
			files += "</tr>";
		});
		$("#fileList").append(files);
	});
});