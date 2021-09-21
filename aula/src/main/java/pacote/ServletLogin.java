package pacote;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class servletlogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static final String USUARIO = "usuario";
    public static final String SENHA = "senha";
    public static final String TELEFONE = "telefone";
    public static final String NASCIMENTO = "nascimento";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter resposta = response.getWriter();
				
		resposta.write("<HTML><body>");
		
		String nomeUsuario = request.getParameter("usuario");
		String senhaUsuario = request.getParameter("senha");
		String telefoneUsuario = request.getParameter("telefone");
		String nascimentoUsuario = request.getParameter("nascimento");
		
		if(autentica(nomeUsuario, senhaUsuario)) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute(USUARIO, nomeUsuario);
			sessao.getAttribute(USUARIO);
			sessao.setAttribute(SENHA, senhaUsuario);
			sessao.getAttribute(SENHA);
			sessao.setAttribute(TELEFONE, nomeUsuario);
			sessao.getAttribute(TELEFONE);
			sessao.setAttribute(NASCIMENTO, senhaUsuario);
			sessao.getAttribute(NASCIMENTO);
			resposta.write("Bem vindo "+ nomeUsuario );
			resposta.write(" ");
			resposta.write("TELEFONE: "+telefoneUsuario);
			resposta.write(" ");
			resposta.write("Nascimento: "+ nascimentoUsuario);
		}else {
			resposta.write("Senha inválida!");
	}
		resposta.write("</body></HTML>");
}

	private boolean autentica(String nome, String senha) {
		if(!nome.equals("") && nome != null && senha != null && senha.equals("1234")) {
			return true;
		}
		return false;
	
	}
}
