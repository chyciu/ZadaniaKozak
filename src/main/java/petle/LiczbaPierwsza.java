package petle;

import java.util.Scanner;

public class LiczbaPierwsza {

    public static void main(String[] args) {

        czyLiczbaPierwsza();

    }

    public static boolean czyLiczbaPierwsza() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę całkowitą. Sprawdzimy, czy Twoja liczba jest liczbą pierwszą.");
            long liczbaUzytkownika = scanner.nextLong();
            System.out.println("Twoja liczba to: " + liczbaUzytkownika + "\n");

            if (liczbaUzytkownika <= 1) {
                System.out.println("Lczba nie jest liczbą pierwszą. Liczba pierwsza musi być większa od zera.");
                return false;
            }
            if (liczbaUzytkownika == 2) {
                System.out.println("Lczba jest liczbą pierwszą");
                return true;
            }
            if (liczbaUzytkownika % 2 == 0) {
                System.out.println("Lczba nie jest liczbą pierwszą");
                return false;
            }
            if (liczbaUzytkownika > 3 && liczbaUzytkownika % 3 == 0) {
                System.out.println("Lczba nie jest liczbą pierwszą");
                return false;
            }
            for (int i = 3; i < Math.sqrt(liczbaUzytkownika); i += 2) {
                if (liczbaUzytkownika % i == 0) {
                    System.out.println("Lczba nie jest liczbą pierwszą");
                    return false;
                }
            }
            if (true) {
                System.out.println("Liczba jest liczbą pierwszą.");
            }

        } catch (Exception e) {
            System.out.println("Muisz wpisać liczbę całkowitą. Jeszcze raz.");
            czyLiczbaPierwsza();

        }
        return true;
    }
}


//    Napisac program, który sprawdza, czy podana liczba całkowita n, n > 1, jest liczba pierwsza.
