package Lists;

import java.util.HashSet;

public class AulaHashSet {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Afeganistão");
        hashSet.add("Brasil");
        hashSet.add("Namíbia");
        hashSet.add("Estados Unidos");
        System.out.println(hashSet);

        System.out.println("List contains Brasil or not: "+ hashSet.contains("Brasil"));       

        hashSet.remove("Namíbia");
        System.out.println("List after remove Namíbia "+ hashSet);

        
    }
}
