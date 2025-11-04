<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>SignUp</h1>
<form action="signup" method="post">
<label for="email">Email</label>
<input type="email" name="email" placeholder="Enter your email"> <br><br>
<label for="password" >Password</label>
<input type="password" name="password" placeholder="Enter your password"> <br><br>
<label for="password">Confirm password</label>
<input type="password" name="confirm_password" placeholder="Confirm your password"> 
<input type="submit"  value="SignUp">
</form>

<p>Are you already existing user? <a href="index.html">Login</a> </p>

</body>
</html>