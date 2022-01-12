import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
public ContentPaneEx(){
    setTitle("컨텐트페인과 제이프레임");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cn=getContentPane();
    cn.setBackground(Color.black);
    cn.setLayout(new FlowLayout());

    cn.add(new JButton("OK"));
    cn.add(new JButton("Cancle"));
    cn.add(new JButton("ignore"));

    setSize(600,300);
    setVisible(true);
}

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}
