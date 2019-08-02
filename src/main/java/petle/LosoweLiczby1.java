package petle;

import java.util.Scanner;

public class LosoweLiczby1 {

    public static void main(String[] args) {

        LosoweLiczby1 losoweLiczby1 = new LosoweLiczby1();
        losoweLiczby1.liczba();
    }

    public void liczba () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowita dodatnią.");
        int podanaLiczba = scanner.nextInt();
        System.out.println("Podana przez Ciebie liczba to: " + podanaLiczba);

        if (podanaLiczba > 0) {
                for (int i = 1; i <= podanaLiczba ; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + ", ");
                    }
                }
         } else
            System.out.println("Podałeś nieprawidłową liczbę. Uruchom program ponownie.");
    }
}

//    Napisac program, który pobiera od uzytkownika liczbe całkowita dodatnia, a nastepnie wyswietla
//    na ekranie kolejno wszystkie liczby niepatrzyste nie wieksze od
//    podanej liczby. Przykład, dla 15 program powinien wyswietlic 1, 3, 5, 7, 9, 11, 13, 15.
