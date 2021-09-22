<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey Index</title>
</head>
<body>
	<div class="formwrap">
		<form method="POST" action="/process">
			<label for="name">Your Name:</label>
			<input type="text" id="name" name="name" >
			<label for="dojo">Dojo Location:</label>
				<select name="dojo">
					<option value="was">Bellevue, WA</option>
					<option value="ido">Boise, ID</option>
					<option value="ill">Chicago, IL</option>
					<option value="sca">Los Angeles, CA</option>
					<option value="nca">San Jose, CA</option>
				</select>
			<label for="language">Favourite Language:</label>
				<select name="lang">
					<option value="py">Python</option>
					<option value="ja">Java</option>
					<option value="re">Javascript React</option>
					<option value="js">Javascript</option>
					<option value="ht">HTML/CSS</option>
				</select>
			<label for="comments">Any comments?</label>
			<textarea name="comments"></textarea>
			<button>Submit</button>
		</form>
	</div>
</body>
</html>