// JavaScript Document
 var type="";
 var title="";
function draw1(){
type="line";
title="各模块各时段点击率";
var URL = "/zjut_java/admin/countByFunction";
	$.getJSON(URL,function(data){
                    
                    	drawChart(data);
                    }); 
};

function draw2(){
var URL = "/zjut_java/admin/countByFunctionsum";
type="column";
title="各模块总点击率";
	$.getJSON(URL,function(data){
                    
                    	drawChart(data);
                    }); 
};

function draw3(){
var URL = "/zjut_java/admin/countByProvince";
type="column";
title="各省排行";
	$.getJSON(URL,function(data){
                    
                    	drawChart(data);
                    }); 
};

function draw4(){
//var data={province:encodeURI($("#province").val(),"utf-8")};
var province=$("#province").val();
alert(province);
var URL ="/zjut_java/admin/countByCity?province="+encodeURI(encodeURI(province,"utf-8"),"utf-8");
type="column";
title=province+"各市排行";
	 $.getJSON(URL,function(data){
                    
                    	drawChart(data);
                    });  

};

function draw5(){
var URL = "/zjut_java/admin/countByQuestion1";
type="column";
title="错题排行";
	$.getJSON(URL,function(data){
                    
                    	drawChart(data);
                    }); 
};

function draw6(){
var URL = "/zjut_java/admin/countByQuestion2";
type="column";
title="错题排行";
	$.getJSON(URL,function(data){
                    
                    	drawChart(data);
                    }); 
};

function draw7(){
	var URL = "/zjut_java/admin/sta_countByTime";
	type="line";
	title="用时分布";
		$.getJSON(URL,function(data){
	                    
	                    	drawChart(data);
	                    }); 
	};
function drawChart(data) {
//		alert(data);
		var d=data;
        var chart = new Highcharts.Chart({
            chart: {type: type,
            renderTo: 'show_chart'},
            title: {
            	text:title
            },
            tooltip: {
                headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
                pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                    '<td style="padding:0"><b>{point.y} mm</b></td></tr>',
                footerFormat: '</table>',
                shared: true,
                useHTML: true
            },
            plotOptions: {
                pie: {
                    allowPointSelect: true,
                    cursor: 'pointer',
                    dataLabels: {
                        enabled: true,
                        color: '#000000',
                        connectorColor: '#000000',
                        formatter: function() {
                            return '<b>'+ this.point.name +'</b>: '+ this.percentage +' %';
                        }
                    }
                }
            },
       
            series:d
        });
    };