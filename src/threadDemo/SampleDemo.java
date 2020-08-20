package threadDemo;

import jdk.nashorn.internal.ir.CaseNode;
import sun.security.jca.GetInstance;
import sun.security.util.Length;

import javax.net.ssl.SSLServerSocket;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author liqiqi_tql
 * @date 2020/5/8 -19:46
 */
public class SampleDemo {
    public static void main(String[] args) throws Exception {
        String str1 = "JAVA语言";

        int i = str1.length();
        String c = "123a";
        System.out.println(i);
        Object o = "sss";
        int[] a = {1, 2, 3};
        for(int s=0;s<a.length;s++){
            a[s]+=100;
        }
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("ss",18);
        for(int s=0;s<5;s++){
            hashMap.put("i"+s,s+1);
        }

        System.out.println(hashMap.get("ss"));
        System.out.println(Arrays.toString(a));

    }
    }