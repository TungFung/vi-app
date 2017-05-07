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
		<title>工单查询</title>
		<link rel="icon" href="img/icon.ico">
		<link href="css/bootstrap.css" rel="stylesheet">
		<link href="css/bootstrap-theme.css" rel="stylesheet">
		<link href="css/theme.css" rel="stylesheet">

		<script type="text/javascript" src="js/jquery-2.1.0.js"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
		<script type="text/javascript" src="js/bootstrap-table.js" ></script>
		<script>
            function applyDatetimeFormatter(value, row, index){
                var newDate = new Date();
                newDate.setTime(value);
                return newDate.toDateString();
            }

            function toCaseDetailPage(){
                window.location = "views/telWork/telWorkDetail.jsp";
            }

            function returnBtn(){
                return '<button onclick="toCaseDetailPage()">工单详情</button>';
            }

			$(function(){
				$('#myTable').bootstrapTable({
				    columns: [{
				        field: 'caseNo',
				        title: '工单号'
				    },{
				        field: 'caseType',
				        title: '工单类型'
				    },{
				        field: 'caseLevel',
				        title: '工单等级'
				    },{
				        field: 'caseStatus',
				        title: '工单状态'
				    },{
				        field: 'custName',
				        title: '客户姓名'
				    },{
				        field: 'loanAmount',
				        title: '借款金额'
				    },{
				        field: 'applyDatetime',
				        title: '申请时间',
                        formatter: applyDatetimeFormatter
				    },{
				        field: 'applyPhoneNo',
				        title: '申请手机'
				    },{
                        field: 'workerCode',
                        title: '客服编号'
                    },{
				        field: 'operate',
                        title: '工单详情',
                        formatter: returnBtn
                    }]
				});
			});
		</script>
	</head>

	<body>
		<!-- nav -->
		<c:import url="../nav.jsp" />

		<div class="container theme-showcase" role="main">
			<div class="page-header">
				<h1>电核作业 <small>工单查询</small></h1>
			</div>
			
			<table id="myTable" 
				   data-striped="true"
				   data-search="true"
				   data-show-refresh="true"
				   data-show-toggle="true"
				   data-show-columns="true"
				   data-show-pagination-switch="true"
				   data-pagination="true"
				   data-id-field="id"
				   data-page-list="[10, 25, 50, 100, ALL]"
				   data-url="telWork/queryMyCases">
			</table>
		</div>
	</body>

</html>