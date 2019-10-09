<html>
<head><title>First JSP</title></head>
<body>
<h3>Hello DB</>

 <%
   double num = Math.random();
   if (num > 0.95) {
 %>
     <h2>You'll have a luck day!</h2><p>(<%= num %>)</p>
 <%
   } else {
 %>
     <h2>Well, life goes on ... </h2><p>(<%= num %>)</p>
 <%
   }
 %>
 <a href="<%= request.getRequestURI() %>"><h3>Try Again</h3></a>
 
<a href="https://www.deutschebank.co.in/"><h3>hello db</h3></a>
 
</body>
</html>