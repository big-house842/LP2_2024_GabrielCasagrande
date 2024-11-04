package Lists;

import Modelo.*;
import Biblioteca.*;
import java.util.PriorityQueue;

public class AulaPQ_Obj {

    public static void menuPriorityQueue() {

        PriorityQueue<Cachorro> filaPQCachorros = new PriorityQueue<Cachorro>();

        while (true) {

            int opcaoMenu = Receba.LerNumero();

            if (opcaoMenu == 0) {
                System.out.println("Saindo do programa... ");
                System.out.println();
                break;
            }

            switch (opcaoMenu) {
                case 1:// Adiciona o obj na PQ

                    Cachorro viraLata = new Cachorro();
                    viraLata.ReceberCachorro();

                    filaPQCachorros.add(viraLata);

                    break;

                case 2:// Mostra o obj retirado da PQ

                    Cachorro cachorroAux = new Cachorro();

                    if (filaPQCachorros.isEmpty()) {
                        System.out.println("A PQ está vazia.");
                        break;
                    }

                    cachorroAux = filaPQCachorros.poll();
                    cachorroAux.imprimirCachorro();

                    break;

                case 3:// Mostra a PQ

                    for (Cachorro dog : filaPQCachorros) {
                        dog.imprimirCachorro();
                    }

                    break;

                default:
                    break;
            }
        }
    }

}
