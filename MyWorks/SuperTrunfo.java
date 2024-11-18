package MyWorks;

import java.util.LinkedList;
import java.util.Queue;

import Modelos.Ghost;

public class SuperTrunfo {

    public static void main(String[] args) {
        Queue<Ghost> gamester1 = new LinkedList<Ghost>();
        Queue<Ghost> gamester2 = new LinkedList<Ghost>();

        Ghost litleGaspar = new Ghost();
        Ghost womenOfMidnight = new Ghost();
        Ghost matitaPere = new Ghost();
        Ghost theSnot = new Ghost();

        litleGaspar.ReadGhost("four foots", 306, "900");
        theSnot.ReadGhost("twenty foots", 91, "850");
        womenOfMidnight.ReadGhost("six foots", 118, "740");
        matitaPere.ReadGhost("five foots", 519, "1000");

        gamester1.add(litleGaspar);
        gamester1.add(theSnot);

        gamester2.add(womenOfMidnight);
        gamester2.add(matitaPere);

        fight(gamester1, gamester2);

    }

    private static void fight(Queue<Ghost> gamester1, Queue<Ghost> gamester2) {

        while (true) {

            if (gamester1.peek() == null) {
                System.out.println(" The gamester two is the best!! ");
            } else if (gamester2.peek() == null) {
                System.out.println(" The gamester one is the best!! ");
            }

            if (gamester1.peek() == null || gamester2.peek() == null) {
                break;
            }

            if (Integer.parseInt(gamester1.peek().ReturnStrength()) > Integer.parseInt(gamester2.peek().ReturnStrength())) {

                System.out.println("Player 1 win, " + gamester1.peek().ReturnStrength() + " > " + gamester2.peek().ReturnStrength());
                ghost1win(gamester1, gamester2);

            } else if (Integer.parseInt(gamester1.peek().ReturnStrength()) < Integer.parseInt(gamester2.peek().ReturnStrength())) {

                System.out.println("Player 2 win, " + gamester2.peek().ReturnStrength() + " > " + gamester1.peek().ReturnStrength());
                ghost2win(gamester1, gamester2);

            } else {

                System.out.println("Tied. The strength of ghosts is the same, " + gamester1.peek().ReturnStrength());
                return;

            }

        }

    }

    private static void ghost1win(Queue<Ghost> gamester1, Queue<Ghost> gamester2) {

        gamester1.add(gamester2.peek());
        gamester2.poll();
        return;

    }

    private static void ghost2win(Queue<Ghost> gamester1, Queue<Ghost> gamester2) {

        gamester2.add(gamester1.peek());
        gamester1.poll();
        return;
    }

}
