<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;
%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <base href='<%=basePath %>' />
    <!-- 修改页面请求的根地址为 http://ip:port/app-name/ -->
    <title>Home Page</title>
    <link rel="icon" href="img/icon.ico">
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    <link href="css/theme.css" rel="stylesheet">

    <script type="text/javascript" src="js/jquery-2.1.0.js" ></script>
    <script type="text/javascript" src="js/bootstrap.js" ></script>

  </head>

  <body>

    <!-- nav -->
    <c:import url="nav.jsp" />

    <div class="container theme-showcase" role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron">
        <h1>核身系统</h1>
        <p>通过电话语音、远程视频、征信、大数据分析等各种手段，实现对用户身份进行核验，确认客户身份，发现用户潜在欺诈风险，盗号风险，伪冒等风险</p>
      </div>
      
    </div>
  </body>
</html>