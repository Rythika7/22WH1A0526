package cseb;

import java.awt.*;    
import javax.swing.*;
public class BorderGap 
{     
JFrame jframe;      
BorderGap()  
{     
    jframe = new JFrame();      
    JButton btn1 = new JButton("India");    
    JButton btn2 = new JButton("Pakistan");    
    JButton btn3 = new JButton("Japan");   
    JButton btn4 = new JButton("China");    
    JButton btn5 = new JButton("Countries");    
    jframe.setLayout(new BorderLayout(20, 15));  
    jframe.add(btn1, BorderLayout.NORTH);    
    jframe.add(btn2, BorderLayout.SOUTH);
    jframe.add(btn3, BorderLayout.EAST);    
    jframe.add(btn4, BorderLayout.WEST);    
    jframe.add(btn5, BorderLayout.CENTER);    
    jframe.setSize(600,600);    
    jframe.setVisible(true);    
}     
public static void main(String argvs[])   
{    
    new BorderGap();    
}    
}    
