<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>

<h2 style="padding-left: 40%;">Welcome To Login Page</h2>
 <form method="post" action="/loginvalidate" style="align-content: center;" >
 
  <div >
    <label for="uname"><b>Username</b></label>
    <input class="form-control" type="text" placeholder="Enter Username" name="uname" required>
	<br>
    <label for="pwd"><b>Password</b></label>
    <input class="form-control" type="text" placeholder="Enter Password" name="pwd" required>
	<br>
    <button class="btn btn-success" type="submit">Login</button>
  
    
  </div>

 
</form> 

</body>
</html>