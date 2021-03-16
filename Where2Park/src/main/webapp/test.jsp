<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <form action="test.do" method="post" >
	 <input type="text" name="parking_location" value="${parkingVO.parking_location}" />
	  <input id="search-button" type="submit" value="검색하기">
	 </form>
</body>
</html>