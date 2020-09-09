package huatu;

import threadDemo.Hero;

/**
 * @author liqiqi_tql
 * @date 2020/9/7 -11:17
 */
public abstract class Hero2 {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public abstract void attack();

    public static void main(String[] args) {
     class SomeHero extends Hero2{
         @Override
         public void attack() {
             System.out.println("sad");
           
         }
     }
        SomeHero h=new SomeHero();
     int a=2,b=3;


    }
    public int sum(int a,int b){
        return a+b;
    }
    public int add(int a,int b){
        sum(a,b);
        return sum(a,b);
    }

}
