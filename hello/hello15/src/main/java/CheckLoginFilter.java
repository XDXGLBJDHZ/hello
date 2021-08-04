import com.sun.deploy.net.HttpRequest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebFilter("/*")
public class CheckLoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        String strUri=request.getRequestURI();
        boolean flag=true;
        if(strUri.indexOf("login")==-1&&request.getSession().getAttribute("u")==null){
            flag=false;
        }
        if (flag){
            chain.doFilter(request,response);
        }else{
            response.sendRedirect("login.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}
