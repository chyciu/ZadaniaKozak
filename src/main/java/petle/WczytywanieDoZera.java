package petle;

import java.util.Scanner;

public class WczytywanieDoZera {


    public static void main(String[] args) {

        WczytywanieDoZera wczytywanieDoZera = new WczytywanieDoZera();
        wczytywanieDoZera.wczytywanie();

    }

    public void wczytywanie () {

        int suma = 0;
        int liczba;

        try {
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj dowolną liczbę.");
                liczba = scanner.nextInt();
                suma = suma += liczba;

            }
            while (liczba != 0);
            System.out.println("Koniec programu. Suma wczytanych liczb dopóki nie wpisałeś zera to: " + suma);

        } catch (Exception e) {
            System.out.println("Musisz wpisać liczbę. Zaczynamy od nowa.");
            wczytywanie();
        }
    }
}


//    Napisac program, który wczytuje liczby podawane przez uzytkownika dotad, dopóki nie podana zostanie liczba 0.
//    Nastepnie wyswietlic sume wszystkich podanych liczb.
