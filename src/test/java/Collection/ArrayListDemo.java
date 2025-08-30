package Collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> lst=new ArrayList<>();
        lst.add(34);
        lst.add(24);
        lst.add(98);
        lst.add(12);
        lst.add(412);
        lst.add(34);
        System.out.println(lst);

        lst.set(1,9);
        System.out.println(lst.remove(2));
        System.out.println(lst);
        System.out.println("Index of 34 is "+lst.indexOf(34));
        System.out.println("last index of 34 is"+lst.indexOf(34));


    }
}
