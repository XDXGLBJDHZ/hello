package cap.util;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/code")
public class AuthCodeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AuthCodeServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String scode = AuthCode.getAuthCode();
        req.getSession().setAttribute("scode", scode);
        //将验证码保存至session中，便于以后验证
        try {
            //发送图片
            ImageIO.write(AuthCode.getAuthImg(scode), "JPEG", resp.getOutputStream());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
