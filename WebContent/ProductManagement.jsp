<%@ page import = "com.SampleLab" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<% 
	if(request.getParameter("pid") != null){
		
		SampleLab sample = new SampleLab();
		
		String msgst = sample.InsertItem(request.getParameter("pid"),
				          request.getParameter("pname"),
				          request.getParameter("pqty"),
				          request.getParameter("pprice"),
						  request.getParameter("pdesc"));
		
		session.setAttribute("statusmsg",msgst);
		
		
		
		
		
	}

%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Product Management</h1>
	<form method="post" action="ProductManagement.jsp">
		
		<label>Product ID</label>
		<input type="text" name="pid"></input><br>
		<label>Product Name</label>
		<input type="text" name="pname"></input><br>
		<label>Product Quantity</label>
		<input type="text" name="pqty"></input><br>
		<label>Price</label>
		<input type="text" name="pprice"></input><br>
		<label>Description</label>
		<input type="text" name="pdesc"></input><br>
		<input type="submit" name="btnsubmit" value="Save"></input>
	</form>
		<% 
			out.print(session.getAttribute("statusmsg"));
		
		%>




</body>
</html>