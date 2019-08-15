package petle;

import java.util.Random;
import java.util.Scanner;

public class LosowaLiczba {

    public static void main(String[] args) {

        losowanie();

    }

    public static void losowanie () {


        try {
            long startTime = System.currentTimeMillis();
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int szukanaLiczba = random.nextInt(100) + 1;
            // System.out.println(szukanaLiczba);

            System.out.println("Podaj liczbę całkowitą z zakresu od 1 do 100.");
            int liczbauzytkownika = scanner.nextInt();

            while (liczbauzytkownika != szukanaLiczba) {
                if (liczbauzytkownika > szukanaLiczba) {
                    System.out.println("Podałeś za dużą liczbę.");
                    System.out.println("Podaj liczbę całkowitą z zakresu od 1 do 100.");
                    liczbauzytkownika = scanner.nextInt();
                } else if (liczbauzytkownika < szukanaLiczba) {
                    System.out.println("Podałeś za małą liczbę.");
                    System.out.println("Podaj liczbę całkowitą z zakresu od 1 do 100.");
                    liczbauzytkownika = scanner.nextInt();
                }
            }
            System.out.println("Brawo, to jest szukana liczba!");
            long endTime = System.currentTimeMillis();
            System.out.println("Całkowity czas działania programu: " + (endTime - startTime));

        } catch (Exception e) {
            System.out.println("Ups!!! Coś poszło nie tak. Musisz podać liczbę całkowitą. Działamy jeszcze raz.");
            losowanie();
        }
    }
}

//    Gra w ”Za duzo, za mało”. Komputer losuje liczbe z zakresu 1 . . . 100, a gracz
//    (uzytkownik) ma za zadanie odgadnac, co to za liczba poprzez podawanie kolejnych wartosci.
//    Jezeli podana wartosc jest:
//        • wieksza – wyswietlany jest komunikat „Podałes za duza wartosc”,
//        • mniejsza – wyswietlany jest komunikat „Podałes za mała wartosc”,
//        • identyczna z wylosowana – wyswietlany jest komunikat „Gratulacje” i gra
//        sie konczy.

