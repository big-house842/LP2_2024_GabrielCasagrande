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

        while (true) {

            Ghost ghost1 = gamester1.get(1);// Acessando os fantasmas de cada jogador
            Ghost ghost2 = gamester2.get(1);

            if (ghost1 == null) {
                System.out.println(" The gamester two is the best!! ");
            } else if (ghost2 == null) {
                System.out.println(" The gamester one is the best!! ");
            }

            if (ghost1 == null || ghost2 == null) {
                break;
            }

            if (Integer.parseInt(ghost1.ReturnStrength()) > Integer.parseInt(ghost2.ReturnStrength())) {

                System.out.println("Player 1 win, " + ghost1.ReturnStrength() + " > " + ghost2.ReturnStrength());
                ghost1win(gamester1, gamester2, ghost1, ghost2);

            } else if (Integer.parseInt(ghost1.ReturnStrength()) < Integer.parseInt(ghost2.ReturnStrength())) {

                System.out.println("Player 2 win, " + ghost2.ReturnStrength() + " > " + ghost1.ReturnStrength());
                ghost2win(gamester1, gamester2, ghost1, ghost2);

            } else {

                System.out.println("Tied. The strength of ghosts is the same, " + ghost1.ReturnStrength());
                return;

            }

        }

    }

    private static void ghost2win(HashMap<Integer, Ghost> gamester1, HashMap<Integer, Ghost> gamester2, Ghost ghost1,
            Ghost ghost2) {

        gamester1.put(gamester2.size() + 1, ghost1);

        gamester2.put(gamester1.size(), null);
        gamester2.put(1, gamester1.get(2));

        return;
    }

    private static void ghost1win(HashMap<Integer, Ghost> gamester1, HashMap<Integer, Ghost> gamester2, Ghost ghost1,
            Ghost ghost2) {

        gamester1.put(gamester1.size() + 1, ghost2);

        gamester2.put(gamester2.size(), null);
        gamester2.put(1, gamester2.get(2));

        return;
    }

}
