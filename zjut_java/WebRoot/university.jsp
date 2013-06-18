<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'university.jsp' starting page</title>
    
	

  </head>
  
  <body>
   <label>university</label>
   <hr>
   <form action="university">
   	ID:<input type="text" name="tbuniversity.univId" /><br/>
   	name:<input type="text" name="tbuniversity.univName" /><br/>
   	city:<input type="text" name="tbuniversity.city" /><br/>
   	province:<input type="text" name="tbuniversity.province" /><br/>
   	address:<input type="text" name="tbuniversity.address" /><br/>
   	postcode<input type="text" name="tbuniversity.postCode" /><br/>
   	telephone<input type="text" name="tbuniversity.telephone" /><br/>
   	url:<input type="text" name="tbuniversity.url" /><br/>
   	211:<input type="checkbox" name="tbuniversity.u211" value="y"/>Y
   	<input type="checkbox" name="tbuniversity.u211" value="n"/>N <br>
   	985:<input type="checkbox" name="tbuniversity.u985" value="y"/>Y
   	<input type="checkbox" name="tbuniversity.u985" value="n"/>N <br>
   	<input type="submit" value="submit"/>
   </form>
  </body>
</html>
