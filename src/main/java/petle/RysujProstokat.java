package petle;

import java.util.Scanner;

public class RysujProstokat {

    public static void main(String[] args) {

        rysowanie();

    }


    public static void rysowanie () {

        try {
            long startTime = System.currentTimeMillis();
            System.out.println("Wprowadź współrzędne x i y, od których zaczniemy rysować na konsoli prostokąt.\n" +
                    "To muszą być liczny całkowite.");
            Scanner scannerX = new Scanner(System.in);
            int x = scannerX.nextInt();
            Scanner scannerY = new Scanner(System.in);
            int y = scannerY.nextInt();
            System.out.println("Współrzędne to: x= " + x + " oraz y= " + y);
            System.out.println();
            System.out.println("Teraz wprowadź długość boków prostokąta a oraz b");
            Scanner scannerA = new Scanner(System.in);
            int a = scannerA.nextInt();
            Scanner scannerB = new Scanner(System.in);
            int b = scannerB.nextInt();
            System.out.println("Długości boków Twojego prostkąta to: a=" + a + " oraz b=" + b);
            System.out.println();
            System.out.println("A teraz wprowadź jakiś znak np. x, który wypełni Twój prostokąt.");
            Scanner scannerZnak = new Scanner(System.in);
            String znak = scannerZnak.next();
            System.out.println("Oto Twój prostokąt :)");

            for (int j = 1; j < y; j++) {
                System.out.println();
            }

            for (int i = 0; i < a; i++) {

                for (int j = 1; j < x; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < b; k++) {
                    System.out.print(znak);
                }
                System.out.println();
            }
            long endTime = System.currentTimeMillis();
            System.out.println("\nCzas działania programu to: " + (endTime - startTime)+ " ms.");

        } catch (Exception e) {
            System.out.println("Chyba wpisałeś coś, o co nie byłeś proszony. Zaczynamy jeszcze raz!!!\n");
            rysowanie();
        }
    }
}


//    Napisac program działajacy w trybie konsolowym (tekstowym) i rysujacy na ekranie prostokat.
//    Uzytkownik podaje znak wypełnienia prostokata, pozycje lewego górnego rogu prostokata (x, y)
//    oraz długosci boków prostokata (ab).
//    Przyjmujemy, ze lewy górny naroznik konsoli ma współrzedne (x, y) = (1, 1).
//        Przykład: x=6, y=3, a=4, b=6, zn=’x’
//        >
//        >
//        > _____xxxxxx
//        > _____xxxxxx
//        > _____xxxxxx
//        > _____xxxxxx
//        ozn.
//        > - nowa linia,
//        _ - znak spacji.
