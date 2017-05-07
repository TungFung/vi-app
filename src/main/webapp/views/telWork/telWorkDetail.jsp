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
		<title>工单详情</title>
		<link rel="icon" href="img/icon.ico">
		<link href="css/bootstrap.css" rel="stylesheet">
		<link href="css/bootstrap-theme.css" rel="stylesheet">
		<link href="css/theme.css" rel="stylesheet">

		<script type="text/javascript" src="js/jquery-2.1.0.js"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
        <script>
            function toCaseAnsPage(){
                window.location = "views/telWork/telWorkAns.jsp";
            }

            $(function(){

                $("#pbcPhoneNo").click(function(){
                    toCaseAnsPage();
                });

                $("#companyTel").click(function(){
                    toCaseAnsPage();
                });

                $("#residentialTel").click(function(){
                    toCaseAnsPage();
                });

                $("#applyPhoneNo").click(function(){
                    toCaseAnsPage();
                });
            });
        </script>
	</head>

	<body>
        <!-- nav -->
        <c:import url="../nav.jsp" />

		<div class="container theme-showcase" role="main">
			<div class="page-header">
				<h1>电核作业 <small>工单详情</small></h1>
			</div>

			<div class="panel panel-title">
				<div class="panel-body">
					<span>工单号：12345678</span>
					<span style="margin-left: 30px;">姓名：李某某</span>
					<a href="views/telWork/telWork.jsp" class="pull-right">关闭工单</a>
				</div>
			</div>

			<div class="list-group">
				<a href="javascript:;" class="list-group-item active">
					<h4 class="list-group-item-heading">核身提醒</h4>
				</a>
				<a href="javascript:;" class="list-group-item">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>风险程度</th>
								<th>核身目的</th>
								<th>核身提示</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>高风险</td>
								<td>盗号+盗卡（触犯欺诈规则）</td>
								<td>首次借款，重点核实身份真实性</td>
							</tr>
						</tbody>
					</table>
				</a>
			</div>

			<div class="list-group">
				<a href="javascript:;" class="list-group-item active">
					<h4 class="list-group-item-heading">联系方式</h4>
				</a>
				<a href="javascript:;" class="list-group-item">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>人行手机</th>
								<th>单位号码</th>
								<th>住宅电话</th>
								<th>申请手机</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									<button id="pbcPhoneNo" type="button" class="btn btn-success">13812345678</button>
								</td>
								<td><button id="companyTel" type="button" class="btn btn-success">0755-81234567</button></td>
								<td><button id="residentialTel" type="button" class="btn btn-success">0755-88889999</button></td>
								<td><button id="applyPhoneNo" type="button" class="btn btn-success">13812345678</button></td>
							</tr>
						</tbody>
					</table>
				</a>
			</div>

			<div class="list-group">
				<a href="javascript:;" class="list-group-item active">
					<h4 class="list-group-item-heading">申请信息</h4>
				</a>
				<a href="javascript:;" class="list-group-item">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>客群</th>
								<th>申请渠道</th>
								<th>申请时间</th>
								<th>申请额度</th>
								<th>总额度</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>滴滴司机</td>
								<td>第三方平台</td>
								<td>2014-08-12</td>
								<td>20000</td>
								<td>100000</td>
							</tr>
						</tbody>
					</table>
				</a>
			</div>

			<div class="list-group">
				<a href="javascript:;" class="list-group-item active">
					<h4 class="list-group-item-heading">征信信息</h4>
				</a>
				<a href="javascript:;" class="list-group-item">
					<h4 class="list-group-item-heading">人行信息</h4>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>职业</th>
								<th>行业</th>
								<th>居住地址</th>
								<th>单位地址</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>司机</td>
								<td>交通运输</td>
								<td>深圳市南山区前海花园</td>
								<td>深圳市南山区滴滴公司</td>
							</tr>
						</tbody>
					</table>
				</a>
				<a href="javascript:;" class="list-group-item">
					<h4 class="list-group-item-heading">公安信息</h4>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>姓名</th>
								<th>曾用名</th>
								<th>户籍</th>
								<th>出生日期</th>
								<th>身份证号码</th>
								<th>生肖</th>
								<th>婚姻状况</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>李某某</td>
								<td>李小某</td>
								<td>广东深圳</td>
								<td>1982-01-01</td>
								<td>44152219820101000000</td>
								<td>虎</td>
								<td>已婚</td>
							</tr>
						</tbody>
					</table>
				</a>
				<a href="javascript:;" class="list-group-item">
					<h4 class="list-group-item-heading">学历信息</h4>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>学历</th>
								<th>学位</th>
								<th>毕业院校</th>
								<th>入学时间</th>
								<th>毕业时间</th>
								<th>所学专业</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>统招本科</td>
								<td>学士学位</td>
								<td>深圳大学</td>
								<td>1998-09-01</td>
								<td>2002-06-01</td>
								<td>软件工程</td>
							</tr>
						</tbody>
					</table>
				</a>
			</div>

			<div class="list-group">
				<a href="javascript:;" class="list-group-item active">
					<h4 class="list-group-item-heading">历史核身记录</h4>
				</a>
				<a href="javascript:;" class="list-group-item">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>核身日期</th>
								<th>核身目的</th>
								<th>核身方式</th>
								<th>核身结果</th>
								<th>备注</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>2014-05-05</td>
								<td>首次申请贷款核实身份</td>
								<td>电话核实</td>
								<td>通过</td>
								<td>无异常</td>
							</tr>
						</tbody>
					</table>
				</a>
				</a>
			</div>

		</div>

	</body>

</html>