//---------------------------------------1、工具---------------------------------------
//1.js验证只能输入数字.
//if(value.length>0 && value.match(/[\x01-\xFF]*/)==false){
//	alert("n1不能输入中文！");
//}
function ischecknumber(value){
	if(isNaN(value)){
		alert("输入格式不正确，只能输入数字(没特殊符号)!");
	}
	return isNaN(value);
}
function ischecknumber2(value){
	if(isNaN(value)){
		return false;
	}
	return true;
}
//把字符串转化为整形数字
function StringToNumb(value){
	if(isNaN(parseInt(value))){
		return null;
	}else{
		return parseInt(value);
	}
}


//事件开始时间必须要比结束时间前面或者相同
function check_st_end_Date(StartDate,EndDate){
	if(!isStartEndDate(ChangeDateToString2(StartDate.value),ChangeDateToString2(EndDate.value))){
		alert("开始日期不能大于结束日期");   
	    return false;   
	}
	return true;	
}
String.prototype.replaceAll = function(reallyDo, replaceWith, ignoreCase) {  
    if (!RegExp.prototype.isPrototypeOf(reallyDo)) {  
        return this.replace(new RegExp(reallyDo, (ignoreCase ? "gi": "g")), replaceWith);  
    } else {  
        return this.replace(reallyDo, replaceWith);  
    }  
}
function isStartEndDate(startDate,endDate){   
    //alert(startDate "===" endDate);   
    if(startDate.length>0&&endDate.length>0){   
     var startDateTemp = startDate.split(" ");   
     var endDateTemp = endDate.split(" ");   
     var arrStartDate = startDateTemp[0].split("-");   
     var arrEndDate = endDateTemp[0].split("-");   
     var arrStartTime = startDateTemp[1].split(":");   
     var arrEndTime = endDateTemp[1].split(":");   
     var allStartDate = new Date(arrStartDate[0],arrStartDate[1],arrStartDate[2],arrStartTime[0],arrStartTime[1],arrStartTime[2]);   
     var allEndDate = new Date(arrEndDate[0],arrEndDate[1],arrEndDate[2],arrEndTime[0],arrEndTime[1],arrEndTime[2]);   
     if(allStartDate.getTime()>allEndDate.getTime()){   
      return false;   
     }   
    }   
    return true;   
}
function CheckDate(DateIn){
	if(typeof(DateIn) == "undefined"){
		return null;
	}else{
		return FormatDate(DateIn);
	}
}
function CheckDate2(DateIn){
	if(typeof(DateIn) == "undefined"){
		return null;
	}else{
		return FormatDate2(DateIn);
	}
}
function FormatDate(DateIn){
	return ChangeDateToString(new Date(DateIn));
}
function FormatDate2(DateIn){
	return ChangeDateToString2(new Date(DateIn));
}
 // 将日期类型转换成字符串型格式yyyy-MM-dd     
function ChangeDateToString(DateIn) {      
	var Year=0;
	var Month=0;
	var Day=0;
	var CurrentDate="";       
	//初始化时间      
	Year = DateIn.getFullYear();
	Month = DateIn.getMonth()+1;
	Day = DateIn.getDate();
	CurrentDate = Year + "-";
	if (Month >= 10 ){
		CurrentDate = CurrentDate + Month + "-";
	}else{
		CurrentDate = CurrentDate + "0" + Month + "-";
	}
	if (Day >= 10 ){
		CurrentDate = CurrentDate + Day ;
	}else{
		CurrentDate = CurrentDate + "0" + Day ;
	}
	return CurrentDate;
}
 // 将日期类型转换成字符串型格式yyyy-MM-dd HH:SS   
function ChangeDateToString2(DateIn) {      
	var Year=0;
	var Month=0;
	var Day=0;
	var Hours=0;
	var Min=0;
	var CurrentDate="";       
	//初始化时间      
	Year = DateIn.getFullYear();
	Month = DateIn.getMonth()+1;
	Day = DateIn.getDate();
	Hours = DateIn.getHours();
	Min = DateIn.getMinutes();
	CurrentDate = Year + "-";
	if (Month >= 10 ){
		CurrentDate = CurrentDate + Month + "-";
	}else{
		CurrentDate = CurrentDate + "0" + Month + "-";
	}
	if (Day >= 10 ){
		CurrentDate = CurrentDate + Day + " ";
	} else {
		CurrentDate = CurrentDate + "0" + Day + " ";
	}
	if (Hours >= 10){
		CurrentDate = CurrentDate + Hours + ":";
	}else{
		CurrentDate = CurrentDate + "0" + Hours + ":";
	}
	if (Min >= 10){
		CurrentDate = CurrentDate + Min ;
	}else{
		CurrentDate = CurrentDate + "0" + Min ;}
	return CurrentDate;
}
//对企业树进行排序
function treesort(result){
	for(var i=0;i<result.length;i++){
		result.sort(function(a,b){
	    	return a.entCode.localeCompare(b.entCode); 
		});
		treesort(result[i].item);
	}	
}
//对企业树进行排序
function treesort2(result){
	for(var i=0;i<result.length;i++){
		result.sort(function(a,b){
	    	return a.ent_code.localeCompare(b.ent_code); 
		});
		treesort2(result[i].children);
	}	
}
//url取值
function GetArgsFromHref(sArgName,href) {
	var sHref = href;//测试数据，实际情况是用window.location.href得到URL
	var args = sHref.split("?");
	var retval = "";
	if (args[0] == sHref) /*参数为空*/
	{
		return retval; /*无需做任何处理*/
	}
	var str = args[1];
	args = str.split("&");
	for ( var i = 0; i < args.length; i++) {
		str = args[i];
		var arg = str.split("=");
		if (arg.length <= 1)
			continue;
		if (arg[0] == sArgName)
			retval = arg[1];
	}
	return retval;
}
//Tree
function getEntTree(arr,result){
	for(var i=0;i<result.length;i++){
		var row={"id":"","text":"","item":[]};
		row.id=result[i].ent_id;
		row.text=result[i].ent_name;
		row.tooltip=result[i].parent_id;
		if(result[i].isfather=="1")
			row.child="1";			
		arr.push(row);
		getEntTree(row.item,result[i].children);
	}	
	return arr;
}
// 将日期类型转换成字符串型格式yyyy-MM-dd (获取指定日期的后一天)  
function getNextDay(d){
    d = new Date(d);
    d = +d + 1000*60*60*24;
    d = new Date(d);
    Year = d.getFullYear();
    Month = d.getMonth()+1;
    Day = d.getDate();
    if (Month < 10 ){
    	Month =  "0" + Month;
	}
	if (Day < 10 ){
		Day = "0" + Day;
	}
    //格式化
    return Year+"-"+Month+"-"+Day;
}
//对电子文件下载返回结果处理
function ToDealWithFileDownload(result){
	if(result == "error"){
		alert("电子文件操作失败！");
		return false;
	}else if(result == "no1" ){
		alert("该电子文件不存在服务器，或已删除！");
		return false;
	}else if(result == "no2"){
		alert("电子文件记录不存在，请刷新页签！");
		return false;
	}else{
		return true;
	}
}
String.prototype.endWith = function(str) {
	if (str == null || str == "" || this.length == 0 || str.length > this.length)
		return false;
	if (this.substring(this.length - str.length) == str)
		return true;
	else
		return false;
	return true;
}
String.prototype.startWith = function(str) {
	if (str == null || str == "" || this.length == 0 || str.length > this.length)
		return false;
	if (this.substr(0, str.length) == str)
		return true;
	else
		return false;
	return true;
}
//---------------------------------------2、字段校验---------------------------------------
//身份证校验(返回值（true：是；false:不是）)
function isCardnumber(data){
	var reg = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
	if(!reg.test(data)){
		alert("身份证号码格式不正确！");
	}
    return reg.test(data)	
}
function ismonth(str) {
	for(var ilen=0;ilen<str.length;ilen++){
		if(str.charAt(ilen)>='0'&&str.charAt(ilen) <='9' ){
			return true;
		} 
	}
	return false;
}
//联系方式校验
function isNumbers(data){
	var reg = /^[0-9]*$/;
	if(!reg.test(data)){
		alert("输入格式不正确,只能输入数字！");
	}
    return reg.test(data)
}

function myBrowser(){
    var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串
    var isOpera = userAgent.indexOf("Opera") > -1;
    if (isOpera) {
        return "Opera"
    } //判断是否Opera浏览器
    else if (userAgent.indexOf("Firefox") > -1) {
        return "FF";
    } //判断是否Firefox浏览器
    else if (userAgent.indexOf("Chrome") > -1){
    	return "Chrome";
    }
    else if (userAgent.indexOf("Safari") > -1) {
        return "Safari";
    } //判断是否Safari浏览器
    else if (userAgent.indexOf("compatible") > -1 && userAgent.indexOf("MSIE") > -1 && !isOpera) {
        return "IE";
    }; //判断是否IE浏览器
}
function number(number){//验证数字
	var a=/^[0-9]*$/;
	if(a.test(number)){
		return true;
	}else{
		return false;
	}
}
function charLength(n,chars){//验证长度为n的字符
	var a=new RegExp("^.{"+n+"}$");
//	var a=/^.{3}$/;
	if(a.test(chars)){
		return true;
	}else{
		return false;
	}
}
function checkTel(tel){
	var a=new RegExp("(?:(\\(\\+?86\\))(0[0-9]{2,3}\\-?)?([2-9][0-9]{6,7})+(\\-[0-9]{1,4})?)|" +  
                "(?:(86-?)?(0[0-9]{2,3}\\-?)?([2-9][0-9]{6,7})+(\\-[0-9]{1,4})?)");
	if(!a.test(tel)){
		return false;
	}else
		return true;
	
}
function charsOfAz(chars,type){
	var a;
	if(type=="Eng"){
		a=/^[A-Za-z]+$/;//验证英文组合字符串
	}if(type=="engNum"){
		a=/^[A-Za-z0-9]+$/;//验证英文数字组合字符串
	}
	if(type=="eng"){
		a=/^[a-z]+$/;//验证小写英文组合字符串
	}
	if(type=="ENG"){
		a=/^[A-Z]+$/;//验证大写英文组合字符串
	}
	if(a.test(chars)){
		return true;
	}else{
		return false;
	}
}
/*function emailOf(chars){
	var a=/^\w+[-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;//验证email
	if(a.test(chars)){
		return true;
	}else{
		return false;
	}
}*/
function chinese(chars){
	var a=/^[\u4e00-\u9fa5],{0,}$/;//验证汉字
	if(a.test(chars))	{
		return true;
	}else{
		return false;
	}
}
function personID(chars){
	var a=/^\d{15}|\d{}18$/;//验证15或18位身份证号码
	if(a.test(chars)){
		return true;
	}else{
		return false;
	}
}
function phone1(chars){
	var a=/\d{3}-\d{8}|\d{4}-\d{7}/;//验证电话号码
	if(a.test(chars)){
		return true;
	}else{
		return false;
	}
} 
function phone2(chars){
	var a=/^1[0-9][0-9]{1}[0-9]{8}|^15[9]{1}[0-9]{8}/;//验证手机号
	if(a.test(chars)){
		return true;
	}else{
		return false;
	}
}

function QQNmuber(QQ,n){
	var a=new RegExp("[0-9]{4,"+n+"}");
	//var a=/[0-9]{4,n}/;//验证n位QQ号（大于4位）
	if(a.test(QQ)){
		return true;
	}else{
		return false;
	}
}
function postCode(Code){
	var a=/[1-9]\d{5}(?!\d)/;//邮编
	if(a.test(Code)){
		return true;
	}else{
		return false;
	}
}
////---------------------------------------3、sweetalert--------------------------------------
function swalert(title){//alert美化
	alert(title);
/* 	swal({   
		title: title,
		confirmButtonText: "确定"
	})*/
}
function swalertError(title){//alert美化
	alert(title);
/*	swal({ 
		title: title,
		type: "error",
		confirmButtonText: "确定"
	})*/
}
function swalertDel(title,CBtype){//confirm美化
    if (confirm(title)){
    	swalertDelFunction(CBtype);
    }
/* 	swal({ 
		title: title,  
		text: "被删除的记录将无法恢复!", 
		type: "warning",  
		showCancelButton: true,   
		confirmButtonColor: "#DD6B55", 
		confirmButtonText: "确定删除",  
		cancelButtonText: "取消"
	//	closeOnConfirm: false
	},function(isConfirm){
		if (isConfirm) {
			swalertDelFunction(CBtype);
		}
	}); */
}


function swalertZx(title,CBtype){//confirm美化
    if (confirm(title)){
    	swalertDelFunction(CBtype);
    }
/* 	swal({ 
		title: title,  
		text: "被注销的记录将无法恢复!", 
		type: "warning",  
		showCancelButton: true,   
		confirmButtonColor: "#DD6B55", 
		confirmButtonText: "确定注销",  
		cancelButtonText: "取消"
	//	closeOnConfirm: false
	},function(isConfirm){
		if (isConfirm) {
			swalertDelFunction(CBtype);
		}
	}); */
}

function swalertZf(title,CBtype){//confirm美化
    if (confirm(title)){
    	swalertDelFunction(CBtype);
    }
/* 	swal({ 
		title: title,  
		text: "被作废的记录保留信息，但无法复原业务!", 
		type: "warning",  
		showCancelButton: true,   
		confirmButtonColor: "#DD6B55", 
		confirmButtonText: "确定作废",  
		cancelButtonText: "取消"
	//	closeOnConfirm: false
	},function(isConfirm){
		if (isConfirm) {
			workflow_Cancle_record(CBtype);
		}
	}); */
}
function swalertSave(title,CBtype){//confirm美化
    if (confirm(title)){
    	swalertDelFunction(CBtype);
    }
/* 	swal({ 
		title: title,  
		text: "确定后,信息将永久保存,无法再次修改与删除!", 
		type: "warning",  
		showCancelButton: true,   
		confirmButtonColor: "#DD6B55", 
		confirmButtonText: "确定保存",  
		cancelButtonText: "取消"
	//	closeOnConfirm: false
	},function(isConfirm){
		if (isConfirm) {
			swalertDelFunction(CBtype);
		}
	}); */
}
Array.prototype.onlyRemoveObj=function(dx)
{
	if(isNaN(dx)||dx>this.length){return false;}
	for(var i=0;i<this.length;i++)
	{
		if(this[i]==this[dx])
		{
			this[i]=null;
		}
	}
}

Array.prototype.removeObj = function(dx) {
    if (isNaN(dx) || dx > this.length) {
        return false;
    }
    for (var i = 0,
    n = 0; i < this.length; i++) {
        if (this[i] != this[dx]) {
            this[n++] = this[i]
        }
    }
    this.length -= 1　
}

loadXML = function(xmlString){
    var xmlDoc=null;
    //判断浏览器的类型
    //支持IE浏览器 
    if(!window.DOMParser && window.ActiveXObject){   //window.DOMParser 判断是否是非ie浏览器
        var xmlDomVersions = ['MSXML.2.DOMDocument.6.0','MSXML.2.DOMDocument.3.0','Microsoft.XMLDOM'];
        for(var i=0;i<xmlDomVersions.length;i++){
            try{
                xmlDoc = new ActiveXObject(xmlDomVersions[i]);
                xmlDoc.async = false;
                xmlDoc.loadXML(xmlString); //loadXML方法载入xml字符串
                break;
            }catch(e){
            }
        }
    }
    //支持Mozilla浏览器
    else if(window.DOMParser && document.implementation && document.implementation.createDocument){
        try{
            /* DOMParser 对象解析 XML 文本并返回一个 XML Document 对象。
             * 要使用 DOMParser，使用不带参数的构造函数来实例化它，然后调用其 parseFromString() 方法
             * parseFromString(text, contentType) 参数text:要解析的 XML 标记 参数contentType文本的内容类型
             * 可能是 "text/xml" 、"application/xml" 或 "application/xhtml+xml" 中的一个。注意，不支持 "text/html"。
             */
            domParser = new  DOMParser();
            xmlDoc = domParser.parseFromString(xmlString, 'text/xml');
        }catch(e){
        }
    }
    else{
        return null;
    }

    return xmlDoc;
}

/*dhtmlXGridObject.prototype.getCheckedRows = function(a) {
	console.log("正在使用tool.js中覆写的getCheckedRows");
	var result="";
	
	if(this.cellType[a]=="ch"){
		result="-1";
		
		var list=this.rowsBuffer;
		for(var index in list){
			if(isNaN(index)){
				continue;
			}
			
			if(list[index]==null){
				continue;
			}
			
			var id=list[index].idd;
			var value=list[index].children[a].chstate;
			
			if(value=="1"){
				if(result=="-1"){
					result=id;
				}
				else{
					result+=(","+id);
				}
			}
		}
	}
	
	return result;
}*/