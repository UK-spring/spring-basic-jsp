<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>글 목록 조회</title>
</head>
<body>
<a href="/index.html">홈 화면으로 돌아가기</a>
<table>
    <thead>
    <th>id</th>
    <th>title</th>
    <th>content</th>
    </thead>
    <tbody>
    <%
        for (Post post : posts) {
            out.write("<tr>");
            out.write("  <td>" + post.getId() + "</td>");
            out.write("  <td>" + post.getTitle() + "</td>");
            out.write("  <td>" + post.getContent() + "</td>");
            out.write("</tr>");
        }
    %>
    </tbody>
</table>
</body>
</html>