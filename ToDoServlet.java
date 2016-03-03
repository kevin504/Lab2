
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ToDoServlet
 */
@WebServlet(name= "/ToDoServlet",
description = "This is my first annotated servlet",
urlPatterns = {"/HelloWorldServlet","/Lab2"})
public class ToDoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private String message;
    public ToDoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() throws ServletException
    {
    	System.out.println("in init");
        // Do required initialization
        message = "This is Lab2";
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" Enter 1-5 for your selection");
		System.out.println("1=POST [id], 2=GET[id],3=GET,4=DELETE[id],5=PUT[id]");
		
		
		ConcurrentHashMap<String,String> m=new ConcurrentHashMap<String,String>(); 
		//response.getWriter().append("This is my Servlet!!: ").append(request.getContextPath());
		Scanner input = new Scanner(System.in);
		int select = input.nextInt();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
