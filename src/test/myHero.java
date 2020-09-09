package test;

import threadDemo.Hero;

import java.util.Random;

/**
 * @author liqiqi_tql
 * @date 2020/7/5 -22:36
 */
public class myHero {
    public static void main(String[] args) {
        String randomString = myHero.getRandomString(10);
        System.out.println(randomString);
    }
//    生成随机字符串的函数,数字代表字符串长度
    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

}
