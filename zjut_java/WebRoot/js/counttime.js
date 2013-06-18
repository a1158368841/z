// JavaScript Document
var h=0;//小时
var m=1;//分钟
var s=20;//秒
function countTime(){
	if(s == 0){
		if(m == 0){
			if(h == 0){
				alert("时间到");
			}else{
				h--;
				m=59;	
			}
		}else{
			m--;
			s=59;	
		}
	}else{
	s--;	
	}
}

function count(){
	var show = document.getElementById("showtime");
	
	show.innerHTML = h+":"+m+":"+s;
	countTime();
	setTimeout("count()",1000);
}
