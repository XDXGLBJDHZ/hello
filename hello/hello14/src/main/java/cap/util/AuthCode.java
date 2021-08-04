package cap.util;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * @author ME08I
 * @date 2021/6/30
 */

public class AuthCode {
    public static final int AUTHCODE_LENGTH = 5;//验证码的长度
    public static final int SINGLECODE_WIDTH = 15;//验证码的宽度
    public static final int SINGLECODE_HEIGHT = 30;//验证码的高度
    public static final int SINGLECODE_GAP = 4;//每个验证码之间的间隔
    public static final int IMG_WIDTH = AUTHCODE_LENGTH * (SINGLECODE_WIDTH + SINGLECODE_GAP);//图片的宽度
    public static final int IMG_HEIGHT = SINGLECODE_HEIGHT;//图片高度等于单个验证码的高度

    //生成验证码中的数字
    public static String getAuthCode() {
        String authCode="";
        for(int i=0;i<AUTHCODE_LENGTH;i++){
            //返回一个0至10的伪随机数
            authCode=authCode+(new Random()).nextInt(10);
        }
        return authCode;
    }

    //生成验证码
    public static BufferedImage getAuthImg(String authCode) {
        BufferedImage img=new BufferedImage(IMG_WIDTH,IMG_HEIGHT,BufferedImage.TYPE_INT_BGR);
        //得到图片上的一个画笔
        Graphics g = img.getGraphics();
        //设置画笔的颜色
        g.setColor(Color.YELLOW);
        //用画笔来填充一个矩形，矩形左上角坐标，宽高
        g.fillRect(0, 0, IMG_WIDTH, IMG_HEIGHT);
        //将画笔的颜色设置为黑色
        g.setColor(Color.BLACK);
        //设置字体宋体，不带格式的，字号
        g.setFont(new Font("宋体", Font.PLAIN, SINGLECODE_HEIGHT+ 5));

        char c;
        for(int i = 0; i < authCode.toCharArray().length; i++){
            //取到对应位置的字符
            c = authCode.charAt(i);
            //画出一个字符串：要画的内容，开始的位置，高度
            g.drawString(c + "", i * (SINGLECODE_WIDTH+ SINGLECODE_GAP)+ SINGLECODE_GAP/ 2, IMG_HEIGHT);
        }
        Random random=new Random();
        //干扰因素
        for(int i = 0; i < 20; i++) {
            int x = random.nextInt(IMG_WIDTH);
            int y = random.nextInt(IMG_HEIGHT);
            int x2 = random.nextInt(IMG_WIDTH);
            int y2 = random.nextInt(IMG_HEIGHT);
            g.drawLine(x, y, x + x2, y + y2);
        }
        return img;
    }

}
