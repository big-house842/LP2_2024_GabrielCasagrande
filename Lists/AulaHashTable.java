package Lists;

import java.util.Hashtable;

public class AulaHashTable {
    
        public static void main(String[] args) {
            
            Hashtable<String, Integer> hashTable = new Hashtable<>();

            hashTable.put("Luma ", 1);
            hashTable.put("Marcos ", 2);
            hashTable.put("Filipa ", 3);

            System.out.println("--------------------------------");
            System.out.println("HashTable: " + hashTable);
            System.out.println("--------------------------------");

            hashTable.remove(3);

        }
}
