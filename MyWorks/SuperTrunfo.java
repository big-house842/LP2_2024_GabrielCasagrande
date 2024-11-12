package MyWorks;

import java.util.HashMap;

import Modelo.Ghost;

public class SuperTrunfo {

    public static void main(String[] args) {
        HashMap<Integer, Ghost> gamester1 = new HashMap<>();
        HashMap<Integer, Ghost> gamester2 = new HashMap<>();

        Ghost litleGaspar = new Ghost();
        Ghost womenOfMidnight = new Ghost();
        Ghost matitaPere = new Ghost();
        Ghost theSnot = new Ghost();

        litleGaspar.ReadGhost("four foots", 306, "900");
        theSnot.ReadGhost("twenty foots", 91, "850");
        womenOfMidnight.ReadGhost("six foots", 118, "740");
        matitaPere.ReadGhost("five foots", 519, "1000");

        gamester1.put(1, litleGaspar);
        gamester1.put(2, theSnot);

        gamester2.put(1, womenOfMidnight);
        gamester2.put(2, matitaPere);

        fight(gamester1, gamester2);

    }

    private static void fight(HashMap<Integer, Ghost> gamester1, HashMap<Integer, Ghost> gamester2) {
        
        Ghost ghost1 = gamester1.get(1);// Acessando os fantasmas de cada jogador
        Ghost ghost2 = gamester2.get(1);
    
        if (Integer.parseInt(ghost1.ReturnStrength()) > Integer.parseInt(ghost2.ReturnStrength())) {
            System.out.println("Jogador 1 vence, " + ghost1.ReturnStrength() + " > " + ghost2.ReturnStrength());


            
        } else if (Integer.parseInt(ghost1.ReturnStrength()) < Integer.parseInt(ghost2.ReturnStrength())) {
            System.out.println("Jogador 2 vence, " + ghost2.ReturnStrength() + " > " + ghost1.ReturnStrength());



        } else {
            System.out.println("Empate, ambos têm " + ghost1.ReturnStrength());

        }

    }

}
