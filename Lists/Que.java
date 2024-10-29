package Lists;

import java.util.PriorityQueue;
import java.util.Queue;

public class Que {
    public static void main(String[] args) {
            Queue<Integer> q = new PriorityQueue<>();   

            q.add(5);
            System.out.println(q.toString());
            q.add(4);
            System.out.println(q.toString());
            q.add(3);
            System.out.println(q.toString());
            q.add(2);
            System.out.println(q.toString());
            q.add(7);
            System.out.println(q.toString());
            q.add(1);
            System.out.println(q.toString());            
            q.add(9);
            System.out.println(q.toString());
            q.add(6);
            System.out.println(q.toString());
            q.poll(); 

    }

}
