package petle;

import java.util.Scanner;

public class PotegiLiczbyDwa {

    public static void main(String[] args) {

        PotegiLiczbyDwa potegiLiczbyDwa = new PotegiLiczbyDwa();
        potegiLiczbyDwa.potegowanie();

    }

        public void potegowanie () {

            try {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj liczbę całkowitą większą od zera.");
                int liczbaCalkowita = scanner.nextInt();
                System.out.println("Liczba to: " + liczbaCalkowita);

                if (liczbaCalkowita <=0) {
                    System.out.println("Musisz podać liczbę całkowitą dodatnią.");
                    potegowanie();
                }

                for (int i = -2; i < liczbaCalkowita; i++) {
                    int potegaLicznyDwa = (int) Math.pow(2, i + 2);
                    if (potegaLicznyDwa <= liczbaCalkowita) {
                        System.out.print(potegaLicznyDwa + " ");
                    }
                }
            } catch (Exception e) {
                System.out.println("Nie podałeś liczby.");
                potegowanie();
            }
        }
    }



//    Napisac program, który wczytuje od uzytkownika liczbe całkowita dodatnia n, a
//    nastepnie wyswietla na ekranie wszystkie potegi liczby 2 nie wieksze, niz podana liczba.
//    Przykładowo, dla liczby 71 program powinien wyswietlic:
//        1
//        2
//        4
//        8
//        16
//        32
//        64
