<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>블로그 포스트 작성 페이지</title>
</head>
<body>
<h1>블로그 글쓰기</h1>
<form action="save" method="post">
  title: <input type="text" name="title" placeholder="제목" />
  content: <input type="text" name="content" placeholder="내용" />
  <button type="submit">저장</button>
</form>

</body>
</html>
