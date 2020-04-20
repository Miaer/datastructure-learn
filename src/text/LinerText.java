package text;

import com.linertable.ArrayList;
import com.linertable.List;

/**
 * 线性表测试类
 * @author mrliz
 */
public abstract class LinerText {

    public static void main(String[] args) {

        List list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.add(12,10);

        System.out.println(list.isEmpty());
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

    }
}