package threadDemo;

import java.util.HashMap;

/**
 * @author liqiqi_tql
 * @date 2020/6/9 -8:57
 */
public class MyMap {

    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<>();
        dictionary.put("adc", "物理英雄");
        dictionary.put("apc", "魔法英雄");
        dictionary.put("t", "坦克");

        System.out.println(dictionary.get("t"));
    }
}
