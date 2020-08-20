package huatu;

import java.awt.*;

import java.awt.Color;

import java.awt.Graphics;

import java.awt.event.*;

import java.awt.image.BufferedImage;

import java.util.*;

public class my extends Canvas implements  MouseListener,MouseMotionListener{

    ArrayList<Shape> list=new ArrayList<Shape>();

    int leftx,lefty,rightx,righty;

    Color Color= java.awt.Color.black;

    int f=0;

    int ff=0;

    my(){

        addMouseListener(this);

        addMouseMotionListener(this);

    }

    @Override
    public void paint(Graphics g){

        int newX = Math.min(leftx,rightx);

        int newY = Math.min(lefty,righty);

        int newWidth = Math.abs(leftx-rightx);

        int newHeight = Math.abs(lefty-righty);

        if(ff==1){

            Iterator<Shape> iterator=list.iterator();

            while(iterator.hasNext()){

                Shape p=(Shape)iterator.next();

                int newX1 = Math.min(p.leftx,p.rightx);

                int newY1 = Math.min(p.lefty,p.righty);

                int newWidth1 = Math.abs(p.leftx-p.rightx);

                int newHeight1 = Math.abs(p.lefty-p.righty);

                if((p.Color).equals(java.awt.Color.red)){

                    g.setColor(java.awt.Color.red);

                }

                if((p.Color).equals(java.awt.Color.green)){

                    g.setColor(java.awt.Color.green);

                }

                if((p.Color).equals(java.awt.Color.blue)){

                    g.setColor(java.awt.Color.blue);

                }

                if((p.Color).equals(java.awt.Color.yellow)){

                    g.setColor(java.awt.Color.yellow);

                }

                if((p.Color).equals(java.awt.Color.black)){

                    g.setColor(java.awt.Color.black);

                }

                if(p.flag==0){

                    g.drawLine(p.leftx, p.lefty, p.rightx, p.righty);

                }

                if(p.flag==1){

                    g.drawRect(newX1, newY1, newWidth1, newHeight1);

                }

                if(p.flag==2){

                    g.drawOval(newX1, newY1, newWidth1, newHeight1);

                }

                if(p.flag==3){

                    g.fillRect(newX1, newY1, newWidth1, newHeight1);

                }

                if(p.flag==4){

                    g.fillOval(newX1, newY1, newWidth1, newHeight1);

                }

                if(p.flag==5){

                    g.clearRect(newX1, newY1, newWidth1, newHeight1);

                }

            }

        }

        if((Color).equals(java.awt.Color.red)){

            g.setColor(java.awt.Color.red);

        }

        if((Color).equals(java.awt.Color.green)){

            g.setColor(java.awt.Color.green);

        }

        if((Color).equals(java.awt.Color.blue)){

            g.setColor(java.awt.Color.blue);

        }

        if((Color).equals(java.awt.Color.yellow)){

            g.setColor(java.awt.Color.yellow);

        }

        if((Color).equals(java.awt.Color.black)){

            g.setColor(java.awt.Color.black);

        }

        if(f==0){

            g.drawLine(leftx, lefty,rightx,righty);

        }

        if(f==1){

            g.drawRect(newX, newY, newWidth, newHeight);

        }

        if(f==2){

            g.drawOval(newX, newY, newWidth, newHeight);

        }

        if(f==3){

            g.fillRect(newX, newY, newWidth, newHeight);

        }

        if(f==4){

            g.fillOval(newX, newY, newWidth, newHeight);

        }

        if(f==5){

            g.clearRect(newX, newY, newWidth, newHeight);

        }

    }

    @Override
    public void mousePressed(MouseEvent e){

        leftx=e.getX();

        lefty=e.getY();

// repaint();

        ff=1;

    }

    @Override
    public void mouseReleased(MouseEvent e) {//写

        list.add(new Shape(leftx,lefty,rightx,righty,f,Color));

        ff=0;

    }

    @Override
    public void mouseEntered(MouseEvent e){}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e){

        rightx=e.getX();

        righty=e.getY();

        repaint();

    }  //负责处理拖动鼠标触发的鼠标事件。

    @Override
    public void mouseMoved(MouseEvent e)  {}

}