<%@ page language="java" 
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列表页面</title>

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/main.css" type="text/css" />
</head>
<style type="text/css">

	table{
		font-size:15px;
	}
	table{
		table-layout:fixed;
		empty-cells:show;
		border-collapse: collapse;
		margin:0 auto;
	}
	td{
		height:30px;
	}
	.table{
		border:1px solid #cad9ea;
		color:#666;
	}
	.table td{
		font-size:100%;
		border:1px solid #cad9ea;
		padding:0 1em 0;
		font-weight:bold;
		background-color:#f5fafe;
		text-align:center;/** 设置水平方向居中 */
	}
	.table th{
		border:1px solid #cad9ea;
		padding:1em 1em 1em;
		word-break: keep-all;white-space:nowrap;
		font-size:150%;
		background-color:#F5FAE1;
	}
	.table tr td:nth-child(odd){
		padding:0 1em 0;
		font-weight:bold;
		background-color:#f5fafe;
	}
</style>
<script src="<%=request.getContextPath()%>/resources/js/jquery-1.7.2.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/tools.js"></script>



<body>
<div style="top:0;left:150px;width:500px;z-index:10;">
	<form id="form" class="form-inline"  method="post" onsubmit = "return false">
		<div class="ui-widget">
			<input id="btnSearch" type="button" class="btn btn-primary" style="width : 50px; font-size: 14px" value="查询">
			<input id="btnAdd" type="button" class="btn btn-primary" style="width : 50px; font-size: 14px" value="新增">
			<input id="btnMotify" type="button" class="btn btn-primary" style="width : 50px; font-size: 14px" value="修改">
			<input id="btnDel" type="button" class="btn btn-primary" style="width : 50px; font-size: 14px" value="删除">
		</div>
	</form>
</div>



<div>


	<div style="width:98%;height:690px;background-color:#fff;border :1px solid Silver;float:left">
		<div class = "content"  style="width:100%;height:100%; overflow:scroll;">
			<table id ="houseList" class="table table-hover" style="float: left;">
				<tr><th width=600px colspan="2" class="text-center">楼内使用单位</th></tr>
			</table>
		</div>
	</div>
</div>
</body>

<script type="text/javascript">
	$(window).load(function(){//DOM结构渲染完成后加载
		//	getHousejson();//获取绘图的json数据
		//	appendList();//加载左侧房屋列表
	});

	/* 加载绘图部分 */
	var json = null;
	function getHousejson(){//获取json数据
		var url = "ajaxFloor.do?method=GetHouseInfo3&id="+id+"&ect="+Math.random();
		var loaderinfo = dhtmlxAjax.getSync(url);
		if(loaderinfo.xmlDoc.responseText!="error"&&loaderinfo.xmlDoc.responseText!="no---"){
			json = jQuery.parseJSON(loaderinfo.xmlDoc.responseText);
		}
	}

	function appendList() {
		var list = '';
		var i=0;
		var len=0;
		for(var js2 in json){
			len++;
		}
		if(len!=0)
			list += '<tr><th width=300px  rowspan="'+len+'">使用单位</th>';
		$.each(json,function(index,value){
			if(i==0){
				i++;
				list += '<td>'+value+'</td></tr>';
			}
			else
				list += '<tr><td>'+value+'</td></tr>';
		})
		list=[list].join("");
		var $list = $(list);
		$('#houseList').append( $list );
	}

	$("#btnSearch").on('click',function(){
		var searchUrl = "<%= request.getContextPath()%>/student/getInfo/123";
		window.open(searchUrl);
	//	window.location.href=searchUrl;

/*		$.ajax({
			type: 'get',
			datatype: 'json',
			url: searchUrl,
			success: function (data) {
				//根据name获取元素进行赋值
				console.log(data)
			}
		})*/
	});
	$("#btnAdd").on('click',function(){
		var searchUrl = "<%= request.getContextPath()%>/student/add";
		window.open(searchUrl);
	});
	$("#btnMotify").on('click',function(){
		var searchUrl = "<%= request.getContextPath()%>/student/edit?edit=123";
		window.open(searchUrl);
	});$("#btnDel").on('click',function(){
		var searchUrl = "<%= request.getContextPath()%>/student/edit?delid=123";
		window.open(searchUrl);
	});

</script>

</html>