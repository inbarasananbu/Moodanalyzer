package Project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value="/abcd")
public class fristser extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  String name1=req.getParameter("a");
		  String name2=req.getParameter("b");
		  String name3=req.getParameter("c");
		  String name4=req.getParameter("d");
		  String name5=req.getParameter("e");
		  String name6=req.getParameter("f");
		  String name7=req.getParameter("g");
		  String name8=req.getParameter("h");
		  String name9=req.getParameter("i");
		 
		  String[] arr= {
					"you will get good news today",
					"you will get corons today",
					"you future will be very awessome",
					"you will get beautiful wife/handsome husband",
					"you will die single"
				      };
			
			
		  Random d=new Random();
			int x=d.nextInt(arr.length);
			PrintWriter ab=resp.getWriter();
			ab.println("<h1>hi good morning your fortune is..<br>"+arr[x]);
		}
				
										
									
}

