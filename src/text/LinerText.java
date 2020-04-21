package text;

import com.linertable.ArrayList;
import com.linertable.List;

/**
 * 线性表测试类
 * @author mrliz
 */
public abstract class LinerText {

    public static void main(String[] args) {

        List myList = new ArrayList();
        java.util.List javaList = new java.util.ArrayList();

        for (int i = 0; i < 100; i++) {
            myList.add(i);
        }

        for (int i = 0; i < 100; i++) {
            javaList.add(i);
        }

        myList.remove(5);
        javaList.remove(5);

        System.out.println(myList.get(5));
        System.out.println(myList.size());
        System.out.println(javaList.get(5));
        System.out.println(myList.size());

    }
}