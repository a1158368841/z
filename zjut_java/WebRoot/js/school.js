$(function(){
	
	var URL="univ_findProvinces";
	$.getJSON(URL,function(data){
		$.each(data,function(i,txt){
			$("#province").append("<option value='"+txt.province+"'>"+txt.province+"</option>");
		});
	});
	
	$("#province").change(function(){
		$("#city").empty();
		$("#univ").empty();
		$("#city").append("<option value=''>---option---</option>");
		$("#univ").append("<option value=''>---option---</option>");
		var p  = $("#province").val();
		var URL="univ_findCities?province="+encodeURI(encodeURI(p,"utf-8"),"utf-8");
		$.getJSON(URL,function(data){
			$.each(data,function(i,txt){
				$("#city").append("<option value='"+txt.city+"'>"+txt.city+"</option>");
			});
		});
	});
	
	$("#city").change(function(){
		$("#univ").empty();
		$("#univ").append("<option value=''>---option---</option>");
		var p  = $("#province").val();
		var c  = $("#city").val();
		
		var URL="univ_findUnivs?province="+encodeURI(encodeURI(p,"utf-8"),"utf-8")+"&city="+encodeURI(encodeURI(c,"utf-8"),"utf-8");
		$.getJSON(URL,function(data){
			$.each(data,function(i,txt){
				$("#univ").append("<option value='"+txt.value+"'>"+txt.univ+"</option>");
			});
		});
	});
});