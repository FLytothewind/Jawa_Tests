package mypackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Test_4 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(9);

        int a = list.get(2);

        System.out.println(list.get(1));
        System.out.println(a);

        list.set(2, 100);

        System.out.println(list.get(2));

//        list.clear();
        System.out.println(list.size());


        List<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(35);

        System.out.println();
        System.out.println(list.size());
        list.addAll(list2);
        System.out.println(list.size());

        System.out.println(list.isEmpty());
//            list.clear();
        System.out.println(list.isEmpty());

        System.out.println();
        System.out.println(list.contains(100));



    }
}



