import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet", value = "/translate")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chào");
        dictionary.put("how", "thế nào");
        dictionary.put("where", "ở đâu");
        dictionary.put("what", "cái gì");
        dictionary.put("who", "ai vậy");
        dictionary.put("happy", "hạnh phúc");
        dictionary.put("sad", "buồn");
        dictionary.put("mad", "tuyệt vọng");

        String search = request.getParameter("txtSearch");
        String result = dictionary.get(search);
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        if (result != null) {
            writer.println("word: " + search + "<br>");
            writer.println("Result: " + result);

        }
        else writer.println("Not Found");

        writer.println("<html>");
    }
}
