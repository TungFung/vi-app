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
		<title>问题回单情况提交</title>
		<link rel="icon" href="img/icon.ico">
		<link href="css/bootstrap.css" rel="stylesheet">
		<link href="css/bootstrap-theme.css" rel="stylesheet">
		<link href="css/theme.css" rel="stylesheet">
		<link rel="stylesheet" href="css/font-awesome.css" />
		<link rel="stylesheet" href="css/build.css" />

		<script type="text/javascript" src="js/jquery-2.1.0.js"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
	</head>

	<body>
        <!-- nav -->
        <c:import url="../nav.jsp" />

		<div class="container theme-showcase" role="main">
			<div class="page-header">
				<h1>电核作业 <small>问题回答情况提交</small></h1>
			</div>

			<div class="panel panel-title">
				<div class="panel-body">
					<span>电话类型：人行手机</span>
					<span style="margin-left: 30px;">电话号码：13812345678</span>
					<button type="button" class="btn btn-primary btn-sm">拨打</button>
					<span style="margin-left: 30px;">电话状态:</span>
					<select class="btn btn-default dropdown-toggle">
						<option></option>
						<option value="0">无人接听</option>
						<option value="1">本人接听</option>
						<option value="2">亲友接听</option>
						<option value="3">不认识本人</option>
					</select>
					<a href="views/home.jsp" class="pull-right">关闭工单</a>
				</div>
			</div>

			<div class="list-group">
				<a href="javascript:;" class="list-group-item active">
					<h4 class="list-group-item-heading">开始语</h4>
				</a>
				<a href="#" class="list-group-item">
					<p>【开始语】：您好！这里是XX公司工作人员给您致电。请问您是XXX[先生/小姐]吗？</p>
					<p>【通话沟通】：XXX[先生/小姐]，感谢您使用XXX产品，为了确认您账户安全，我们需要与您核对相关信息。请问您现在方便讲电话吗？</p>
					<p>【核实身份】：好的，谢谢。请问您身份证号码最后4位数是什么？（证件号码后4位：XXXX）</p>
					<p>【替换问题】:不麻烦您查询了，您告诉我出生日期和生肖就可以了。（出生日期：XXXX-XX-XX，生肖：X）</p>
					<p>【确认申请人操作】：好的，谢谢。请问本次贷款申请是您亲自操作的吗？</p>
					<p>【确认申请手机】：好的，谢谢您！请问您尾号XXXX的申请手机是您本人使用的吗？</p>
					<p>【问题库查询】：好的，谢谢！下面需要与您核对一些信息。（按照问题库询问，按问题精度要求判断）</p>
				</a>
			</div>

			<form method="post" action="#">
				<div class="list-group">
					<a href="javascript:;" class="list-group-item active">
						<h4 class="list-group-item-heading">问题库</h4>
					</a>
					<a href="javascript:;" class="list-group-item">
						<p>请问您本科学历的学校地址在哪？（回答明细至城市即可）（正确答案：广东省深圳市）</p>

						<div class="row">
							<div class="col-lg-2">
								<div class="radio radio-success radio-inline">
									<input type="radio" id="inlineRadio1" value="option1" name="radioInline">
									<label for="inlineRadio1"> 对 </label>
								</div>
								<div class="radio radio-danger radio-inline">
									<input type="radio" id="inlineRadio2" value="option2" name="radioInline">
									<label for="inlineRadio2"> 错 </label>
								</div>
							</div>
							<div class="col-lg-10">
								<input type="text" class="form-control input-group-sm" placeholder="问题回答备注" />
							</div>
						</div>

					</a>
					<a href="javascript:;" class="list-group-item">
						<p>请问您本科学历的学校地址在哪？（回答明细至城市即可）（正确答案：广东省深圳市）</p>

						<div class="row">
							<div class="col-lg-2">
								<div class="radio radio-success radio-inline">
									<input type="radio" id="inlineRadio1" value="option1" name="radioInline">
									<label for="inlineRadio1"> 对 </label>
								</div>
								<div class="radio radio-danger radio-inline">
									<input type="radio" id="inlineRadio2" value="option2" name="radioInline">
									<label for="inlineRadio2"> 错 </label>
								</div>
							</div>
							<div class="col-lg-10">
								<input type="text" class="form-control input-group-sm" placeholder="问题回答备注" />
							</div>
						</div>
					</a>
					<a href="javascript:;" class="list-group-item">
						<p>请问您本科学历的学校地址在哪？（回答明细至城市即可）（正确答案：广东省深圳市）</p>

						<div class="row">
							<div class="col-lg-2">
								<div class="radio radio-success radio-inline">
									<input type="radio" id="inlineRadio1" value="option1" name="radioInline">
									<label for="inlineRadio1"> 对 </label>
								</div>
								<div class="radio radio-danger radio-inline">
									<input type="radio" id="inlineRadio2" value="option2" name="radioInline">
									<label for="inlineRadio2"> 错 </label>
								</div>
							</div>
							<div class="col-lg-10">
								<input type="text" class="form-control input-group-sm" placeholder="问题回答备注" />
							</div>
						</div>
					</a>
				</div>

				<div class="list-group">
					<a href="javascript:;" class="list-group-item active">
						<h4 class="list-group-item-heading">结束语</h4>
					</a>
					<a href="javascript:;" class="list-group-item">
						<p>【借款用途提醒】：温馨提醒您，按照借款合同规定，您申请的XXX借款将不能用于购买住房和股票证券投资，请您知晓。</p>
						<p>【借款用途异常话术】：我们有义务提醒您借款不能用于购买住房，股票证券投资等行为，具体以合同约定为准，如有违反，我司有权利要求您立即归还所有欠款。请您知晓</p>
					</a>
				</div>

				<div class="panel">
					<button type="button" class="btn btn-default">挂起</button>
					<div class="pull-right">
						<button type="button" class="btn btn-danger">拒绝</button> &nbsp;&nbsp;&nbsp;
						<button type="button" class="btn btn-success">通过</button>
					</div>
				</div>
			</form>

		</div>

	</body>

</html>