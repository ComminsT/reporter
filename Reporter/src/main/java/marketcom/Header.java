package marketcom;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.DatatypeConverter;

import models.Database;
import models.Utilisateur;
import models.UtilisateurDAO;

/**
 * Servlet implementation class Header
 */
@WebServlet(name = "HeaderMC", urlPatterns = { "/MarketCom/Header" })
public class Header extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Header() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Boolean change=false;
		Boolean problem=false;
		Database.Connect();
		
		HttpSession session = request.getSession(true);
		Utilisateur utilisateur = (Utilisateur)session.getAttribute("currentuser");
		System.out.println(session.getAttribute("isConnected"));
		if (session.getAttribute("isConnected") == null) {
			session.setAttribute("isConnected", false);
		}
		if(request.getParameter("changemdp")!=null) {
			UtilisateurDAO utilisateurdao = new UtilisateurDAO();
			String cmdp = request.getParameter("mdp");
			String myHash="";
			MessageDigest md;
			try {
				md = MessageDigest.getInstance("MD5");
				md.update(cmdp.getBytes());
				byte[] digest = md.digest();
				myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			if(myHash.equals(utilisateur.getPassword())) {
				
				String newpw=request.getParameter("newmdp");
				try {
					md = MessageDigest.getInstance("MD5");
					md.update(newpw.getBytes());
					byte[] digest = md.digest();
					myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
				} catch (NoSuchAlgorithmException e) {
					e.printStackTrace();
				}
				utilisateur.setPassword(myHash);
				utilisateurdao.save(utilisateur);
			}else {
				problem=true;
				
				
			}
			
			
			
			
		}
			request.getRequestDispatcher("/MarketCom/Header.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
