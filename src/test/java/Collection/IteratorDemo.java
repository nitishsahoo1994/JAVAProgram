package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> lst=new ArrayList<>();
        for (int i=0;i<10;i++){
            lst.add(i);
        }
        System.out.println(lst);

        Iterator<Integer> itr=lst.iterator();
        while (itr.hasNext()){
            Integer I=(Integer) itr.next();
            if (I%2==0){
                System.out.println(I);
            }
            else itr.remove();
        }
    }
}

