<%@ page language="java" 
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我不是真正的慕课网</title>

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/main.css"
	type="text/css" />
</head>
<body>
	<div id="main">
		<div class="newcontainer" id="course_intro">
		  <form name="mainForm" action="<%= request.getContextPath()%>/student/cteate222" method="post">
			  <div>
				  <span>学生学号:</span><input type="text" id="studentId" name="studentId"> 秒
			  </div>
			  <div>
		       <span>学生名称:</span><input type="text" id="studentName" name="studentName">
		    </div>
		    <div>
		       <span>课程类型:</span>
		       <select id="studentType" name="studentType">
                  <option value="0">理科</option>
                  <option value="1" selected="selected">文科</option>
                  <option value="2">体育</option>
                </select>
		    </div> 
		    <div>
		       <span>课程介绍:</span>
		       <textarea id="vnote" name="vnote" rows="5" style="width:480px"></textarea>
		    </div> 
		    <div>
		       <input type="submit" id="btnPass" value="提交" />
		    </div> 
		  </form>
		</div>
	</div>
</body>
</html>