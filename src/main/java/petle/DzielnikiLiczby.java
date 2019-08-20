package petle;

import java.util.Scanner;

public class DzielnikiLiczby {

    public static void main(String[] args) {

        dzialniki();

    }

    public static void dzialniki() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz dowolną liczbę całkowitą.");
            long liczbaUzytkownika = scanner.nextLong();

            System.out.println("Twoja liczba to: " + liczbaUzytkownika);
            System.out.print("Dzielniki Twojej liczby całkowitej to: ");

            for (int i = 1; i <= liczbaUzytkownika; i++) {
                if (liczbaUzytkownika % i == 0) {
                    System.out.print(i + ", ");
                }
            }
        } catch (Exception e) {
            System.out.println("Musisz wpisać liczbę całkowitą. Damy Tobie szansę jesczze raz.");
            dzialniki();
        }
    }
}


//    Napisac program, dla podanej liczby całkowitej wyswietla jej dzielniki.
//    Przykładowo, dla liczby 21 dzielniki to: 1, 3, 7, 21.
