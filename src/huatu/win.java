package huatu;

import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.Graphics;

import java.awt.event.*;

import java.awt.image.BufferedImage;

import java.io.File;

import javax.imageio.ImageIO;

import javax.swing.*;

import javax.swing.filechooser.FileFilter;

import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.Graphics;

import java.awt.event.*;

import java.awt.image.BufferedImage;

import java.io.File;

import javax.imageio.ImageIO;

import javax.swing.*;

import javax.swing.filechooser.FileFilter;

import java.util.Calendar.*;

import java.util.Date;

import java.text.SimpleDateFormat;

import java.util.Date;

import java.awt.*;

import javax.swing.*;

import javax.swing.event.DocumentEvent;

import javax.swing.event.DocumentListener;

import java.awt.event.*;

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.util.*;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class  win extends JFrame  implements ActionListener

{

    JMenuBar jmb = new JMenuBar();

    JMenu jm = new JMenu("文件(F)");

    JMenuItem jmi1 = new JMenuItem("打开");

    JMenuItem jmi2 = new JMenuItem("保存");

    JMenu menu1=new JMenu("形状(S)");

    JMenuItem item11=new JMenuItem("直线");

    JMenuItem item12=new JMenuItem("矩形");

    JMenuItem item13=new JMenuItem("圆形");

    JMenu menu2=new JMenu("颜色(C)");

    JMenuItem item21=new JMenuItem("红色");

    JMenuItem item22=new JMenuItem("绿色");

    JMenuItem item23=new JMenuItem("蓝色");

    JMenuItem item24=new JMenuItem("黄色");

    JMenuItem item25=new JMenuItem("黑色");

    JMenu menu3=new JMenu("实心形状(M)");

    JMenuItem item31=new JMenuItem("实心矩形");

    JMenuItem item32=new JMenuItem("实心圆");

    JMenu menu4=new JMenu("工具(T)");

    JMenuItem item41=new JMenuItem("橡皮檫");

    JButton button1=new JButton("长方形");

    JButton button2=new JButton("椭圆");

    my pane=new my();

//    JFileChooser fileDialog=new JFileChooser();

    JFileChooser fileDialog=new JFileChooser();

    BufferedReader in;

    FileReader fileReader;

    BufferedWriter out;

    FileWriter fileWriter;

    File dir;

    String name;

    win()

    {

        init();

        setTitle("画图");

        setBounds(100,100,500,300);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    void init(){

        add(pane,BorderLayout.CENTER);

        jm.add(jmi1);

        jm.add(jmi2);

        jmb.add(jm);

        menu1.add(item11);

        menu1.add(item12);

        menu1.add(item13);

        menu2.add(item21);

        menu2.add(item22);

        menu2.add(item23);

        menu2.add(item24);

        menu2.add(item25);

        menu3.add(item31);

        menu3.add(item32);

        menu4.add(item41);

        jmb.add(menu1);

        jmb.add(menu2);

        jmb.add(menu3);

        jmb.add(menu4);

        setJMenuBar(jmb);

        jmi1.addActionListener(this);

        jmi2.addActionListener(this);

        item11.addActionListener(this);

        item12.addActionListener(this);

        item13.addActionListener(this);

        item21.addActionListener(this);

        item22.addActionListener(this);

        item23.addActionListener(this);

        item24.addActionListener(this);

        item25.addActionListener(this);

        item31.addActionListener(this);

        item32.addActionListener(this);

        item41.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource()== item11){

            pane.f=0;

        }

        if (e.getSource()== item12){

            pane.f=1;

        }

        if (e.getSource()== item13){

            pane.f=2;

        }

        if (e.getSource()== item31){

            pane.f=3;

        }

        if (e.getSource()== item32){

            pane.f=4;

        }

        if (e.getSource()== item21){

            pane.Color=Color.red;

        }

        if (e.getSource()== item22){

            pane.Color = Color.green;

        }

        if (e.getSource()== item23){

            pane.Color = Color.blue;

        }

        if (e.getSource()== item24){

            pane.Color = Color.yellow;

        }

        if (e.getSource()== item25){

            pane.Color = Color.black;

        }

        if (e.getSource()== item41){

//   pane.Color = Color.black;

            pane.f=5;

        }

        if(e.getSource()==jmi1){}

        if(e.getSource()==jmi2){}

    }

}







