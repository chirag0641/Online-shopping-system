
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;

 
public class TestServlet extends HttpServlet {

	public TestServlet(){

		System.out.println("in constructor");


	}
	public void init(ServletConfig sc){

		System.out.println("in init");

	}

}
