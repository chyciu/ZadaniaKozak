package petle;

import java.util.Scanner;

public class Choinka {

    public static void main(String[] args) {

        rysowanieChoinki();

    }


    public static void rysowanieChoinki() {

        char znak = '*';

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Cześć. Rysujemy choinkę ze znaków gwiazdzki '*'.\n" +
                    "Wprowadź liczbę całkowitą, która będzie określała wysokość Twojej choinki.");
            int poziomy = scanner.nextInt();
            System.out.println("Oto Twoja choinka!!!\n");

            for (int i = 0; i < poziomy; i++) {
                for (int j = 0; j <= poziomy * 2; j++) {
                    if (j < (poziomy - i) || j > (poziomy + i)) {
                        System.out.print(" ");
                    } else {
                        System.out.print(znak);
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Nie, no tak to nie zbudujemy choinki i nie będzie Mikołaja!\n" +
                    "Jeszcze raz!");
            rysowanieChoinki();
        }
    }
}


//    Napisac program rysujacy w konsoli „choinke” złozona ze znaków gwiazdki (*).
//    Uzytkownik programu powinien podac liczbe całkowita n, n > 0, okreslajaca
//    wysokosc choinki (liczbe wierszy).
//    Przykład: dla n = 5 wynik powinien wygladac nastepujaco:
//            *
//           ***
//          *****
//         *******
//        *********