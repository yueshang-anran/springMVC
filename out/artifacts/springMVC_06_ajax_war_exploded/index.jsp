<%--
  Created by IntelliJ IDEA.
  User: 书
  Date: 2021/4/14
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>首页</title>
  <script src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>

  <%--js 是一个随便的语言 --%>
  <script>
    function a() {
      $.post({
        url:"${pageContext.request.contextPath}/a1",
        data:{"name":$("#username").val()},
        success: function (data) {
          console.log(data);
        },
        error:function (err) {

        }
      })
    }
  </script>
</head>
<body>
<%--失去焦点的时候，发起一个请求(携带信息)到后台--%>
用户名：<input type="text" id="username" onblur="a()">
</body>
</html>

