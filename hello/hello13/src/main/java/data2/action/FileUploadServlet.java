package data2.action;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTMLDocument;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

/**
 * @author ME08I
 * @date 2021/6/13
 */

@WebServlet("/upload")
public class FileUploadServlet extends HttpServlet {
    private String filePath = "e:\\upload";
    private String filePathTemp = "e:\\upload\\temp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");
        try {
            DiskFileItemFactory factory = new DiskFileItemFactory();
            factory.setSizeThreshold(4 * 1024);
            factory.setRepository(new File(filePathTemp));
            ServletFileUpload fileupload = new ServletFileUpload(factory);
            fileupload.setFileSizeMax(4 * 1024 * 1024);
            List item = fileupload.parseRequest(req);
            Iterator iterator = item.iterator();
            while (iterator.hasNext()) {
                FileItem fileItem = (FileItem) iterator.next();
                if (!fileItem.isFormField()) {
                    String filename = fileItem.getName();
                    int index = filename.lastIndexOf("\\");
                    filename = filename.substring(index + 1);
                    long fileSize = item.size();
                    if (filename.equals("") || fileSize == 0)
                        return;
                    File uploadfile = new File(filePath + "/" + filename);
                    fileItem.write(uploadfile);
                    out.println(filename + "已经保存");
                    out.println("文件" + filename + " 的大小：" + fileSize + "\r\n");

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
