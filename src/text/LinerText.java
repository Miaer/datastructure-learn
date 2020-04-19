package text;

import java.util.*;

/**
 * 线性表测试类
 * @author mrliz
 */
public abstract class LinerText {

    public static void main(String[] args) {
//        int[] nums = {1,1,2};
//        Set set = new HashSet();
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }
//        System.out.println(nums);
//        System.out.println(set);
        List list = new ArrayList();
        list.add(new Person("zhangsan",18));
        list.add(new Person("xiaohua",16));
        list.add(new Person("wangwu",99));
        System.out.println(list);
    }
}