<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

    <!-- Fixed navbar javaScript -->
    <script>
        $(function(){
            $.ajax({
                url:"showUserName",
                type:"get",
                contentType:"application/json",
                data:{},
                dataType:'json',
                success:function(data){
                    console.log(data);
                    $("#workerCode").text(data.workerCode);
                },
                error:function(e){
                    console.log("error:"+e);
                }
            });
        });
    </script>

    <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <a class="navbar-brand" href="views/home.jsp">核身系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">核身作业 <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="views/telWork/telWork.jsp">我的工单</a></li>
                <li><a href="views/telWork/queryTelWork.jsp">工单查询</a></li>
                <li><a href="#">工单分配</a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">人员管理 <span class="caret"></span></a>
              <ul class="dropdown-menu">
              	<li><a href="javascript:;">人员信息维护</a></li>
                <li><a href="javascript:;">人员架构维护</a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">运营管理 <span class="caret"></span></a>
              <ul class="dropdown-menu">
              	<li><a href="javascript:;">运营时间设置</a></li>
              	<li><a href="javascript:;">客服状态设置</a></li>
              </ul>
            </li>
            <li><a href="javascript:;">系统参数</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li class="dropdown">
              <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">v_wbtfshen <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="views/login.jsp">退出</a></li>
              </ul>
            </li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
