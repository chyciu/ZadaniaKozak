package petle;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class DataCzas {

    public static void main(String[] args) {

        petlaCzasu();

    }

    public static void petlaCzasu () {

        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();

        System.out.println("Aktualna godzina: " + LocalTime.now());
        System.out.println(hour + " " + minute + " " + second);

        System.out.println("Godzina: ");
        for (int i = 0; i < 1 ; i++) {
            for (int j = 1; j < hour ; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nMinuty:");
        for (int i = 0; i < 1 ; i++) {
            for (int j = 1; j <= minute ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nSekundy:");
        for (int i = 0; i < 1 ; i++) {
            for (int j = 1; j <= second ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//    Korzystając z klasy oferującej operacje na dacie i czasie pobierz aktualny czas (godzinę, minutę
//    i sekundę) oraz wypisz te wartości używając znaków *, których liczba równa się danej wartości.
//    Dla utrudnienia, w jednym wierszu może być maksymalnie 10 znaków *.
//    Przykład dla wartości 15:03:28.
//
//        Aktualny czas: 15:03:28
//        Godzina:
//        **********
//        *****
//        Minuta:
//        ***
//        Sekunda:
//        **********
//        **********
//        ********
