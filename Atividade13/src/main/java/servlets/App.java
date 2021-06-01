package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Livro;


@WebServlet("/app")
public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Instanciação de Feijões
		Livro livro1 = new Livro();
		livro1.setAno(2010);
		livro1.setAutor("Matheus Viana");
		livro1.setTitulo("O Andarilho");
		Livro livro2 = new Livro();
		livro2.setAno(2021);
		livro2.setAutor("Stephanie Ho");
		livro2.setTitulo("Cerebrum Cibum");
		Livro livro3 = new Livro();
		livro3.setAno(2003);
		livro3.setAutor("Matheus Viana");
		livro3.setTitulo("Born");
		Livro livro4 = new Livro();
		livro4.setAno(2013);
		livro4.setAutor("Stephanie");
		livro4.setTitulo("Meus 10 Anos");
		Livro livro5 = new Livro();
		livro5.setAno(2020);
		livro5.setAutor("Matheus Viana");
		livro5.setTitulo("Guia de Sobrevivência");
		
		//Inserção em um Array
		List<Livro> array = new ArrayList<Livro>();
		array.add(livro1);
		array.add(livro2);
		array.add(livro3);
		array.add(livro4);
		array.add(livro5);

		//Enviando atributo...
		request.setAttribute("lista", array);
		
		//Resposta
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		
	}

}
