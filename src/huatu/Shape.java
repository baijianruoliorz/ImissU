package huatu;

/**
 * @author liqiqi_tql
 * @date 2020/6/16 -18:24
 */


import java.awt.Color;

    public class Shape {

        int leftx,lefty,rightx,righty,flag;

        Color Color;

        Shape(int leftx, int lefty, int rightx, int righty, int flag, Color Color){

            this.leftx=leftx;

            this.lefty=lefty;

            this.rightx=rightx;

            this.righty=righty;

            this.flag=flag;

            this.Color=Color;

        }

        void setColor(Color Color){

            this.Color=Color;

        }

        Color getColor(){

            return Color;

        }

        int getLeftx(){

            return leftx;

        }

        void  setLeftx(int leftx){

            this.leftx=leftx;

        }

        int getLefty(){

            return lefty;

        }

        void  setLefty(int lefty){

            this.lefty=lefty;

        }

        int getRightx(){

            return rightx;

        }

        void  setRightx(int rightx){

            this.rightx=rightx;

        }

        int getRighty(){

            return righty;

        }

        void  setRighty(int righty){

            this.righty=righty;

        }

        int getFlag(){

            return flag;

        }

        void setFlag(int flag){

            this.flag=flag;

        }

    }

