<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelos.Livro"%>
<%@page import="servlets.App"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Biblioteca</title>
	</head>
	<body>
		<table style="text-align: center; border-spacing: 5px; background-color: azure; border: 2px solid powderblue;">
			<!-- Cabeçalho -->
			<tr style="color:blue;">
				<td colspan=2><%="Título do Livro"%></td>
				<td colspan=2><%="Autor"%></td>
				<td colspan=2><%="Data de Publicação"%></td>
			</tr>
			
			<!-- Dados -->
			<%
			ArrayList<Livro> lista = (ArrayList<Livro>) request.getAttribute("lista");
			for (Livro livro : lista) {
			%>
			<tr>
				<td colspan=2><%=livro.getTitulo()%></td>
				<td colspan=2><%=livro.getAutor()%></td>
				<td colspan=2><%=livro.getAno()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</body>
</html>