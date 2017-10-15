<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ include file="/WEB-INF/view/common/tagPage.jsp" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <title>显示结果</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <script type="text/javascript" src="${webRoot}/js/jQuery-core/jquery-1.6.1.min.js?cdntime=${cdntime}"></script>
    <script type="text/javascript">
        $(function () {
            alert("测试静态资源加载");
        });
    </script>
</head>
<body>

登录名：${user.sysUserLoginName}

<br>

真实姓名：${user.sysUserRealName}

<br>

部门总数：${categoryTotal}
部门名称：${category.name}

<br>
<select>
    <c:forEach var="categoryName" items="${categoryList}">
        <option>${categoryName.id}</option>
    </c:forEach>
</select>

<br>
使用List集合显示部门名称:
<c:forEach var="categoryName" items="${categoryList}">

    ${categoryName.name}
    <br>
   分割

</c:forEach>


</body>
</html>

