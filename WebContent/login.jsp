<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>welcome please login according to  note below :</h1>

     <form action="login" method="get"> 
     
     <table border="1" cellpadding="5"> 
     
<tr><td>UserName:</td><td><input type="text" name="userName"/></td></tr> <br/>  
<tr><td>Password:</td><td><input type="password" name="userPass"/></td></tr> <br/>  
<tr><td><input type="submit" value="Login"/> </td></tr> <br/> </table>
<h3>Note parth: uname and pass is fixed to "hr" and has</br>
 db  connection according to loginDao both works perfectly fine</h3> 
<h4> hr admin panel should not have a registration option so relevant operation is inside the CRUD</h4>
</form>



</body>
</html>