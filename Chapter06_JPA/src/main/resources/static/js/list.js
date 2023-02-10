$(function() {
	$.ajax({
		type: "post",
		url: "/user/getUserList",
		dataType: "json", // text, html, xml, json
		success: function(data) {
			// alert(JSON.stringify(data));
			$.each(data, function(index, items) {
				$("<tr/>").append($("<td/>", {
							align: "center",
							text: items.name
						})).append($("<td/>", {
								align: "center",
								text: items.id
						})).append($("<td/>", {
									align: "center",
									text: items.pwd
						})).appendTo($("#userListTable"));
			});
		},
		error: function(err) {
			console.log(err);
		},
	}); // $.ajax
}); // $function

$('#searchBtn').click(function() {
	if ($('#keyword').val() == '')
		alert('검색어를 입력하세요');
	else
		$.ajax({
			type: 'post',
			url: '/user/search',
			//data:{'searchOption':$('#searchOption').val(),
			//		'keyword':$('#keyword').val()}
			data: $('#searchForm').serialize(), //사용하려면 name값 name="searchForm" 필요
			dataType: 'json',
			success: function(data) {
				console.log(JSON.stringify(data));
				
				$('#userListTable tr:gt(0)').remove();
				
				$.each(data, function(index, items) {
					$("<tr/>").append($("<td/>", {
								align: "center",
								text: items.name
							})).append($("<td/>", {
									align: "center",
									text: items.id
							})).append($("<td/>", {
										align: "center",
										text: items.pwd
							})).appendTo($("#userListTable"));
				});
			},
			error: function(err) {
				console.log(err);
			}
		});
});//searchBtn
