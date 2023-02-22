<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@page import="com.project.tiendacliente.objects.Product"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Página de inicio</title>
  </head>

  <body>
    <h1>Productos extraidos de la API "http://localhost:8085/api/productos"</h1>
    <%
    ArrayList<Product> products = (ArrayList<Product>) request.getAttribute("products");
    for (Product product : products) {
    %>
    <p><%=product.toString()%></p>
    <%
    }
    %>


  </body>

</html>
