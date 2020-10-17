package huatu;

import java.util.UUID;

/**
 * @author liqiqi_tql
 * @date 2020/10/17 -22:17
 */
public class uuidDemo {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String string = uuid.toString();
        System.out.println(uuid);
        System.out.println(string);
    }
}
