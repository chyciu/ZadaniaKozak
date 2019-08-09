package petle;

import java.util.ArrayList;
import java.util.Scanner;


public class WczytywanieCiaguLiczb {

    public static void main(String[] args) {

        wczytywacz();
    }


    public static void wczytywacz() {

        int liczba;
        double srednia;
        int min;
        int max;
        int sumMinMax;
        int sumaLiczbWCiagu = 0;
        ArrayList<Integer> ciagLiczb = new ArrayList<>();

        try {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz ciąg liczb całkowitych. Kiedy wpiszesz 0 (zero) ciąg się zakończy.");
            liczba = scanner.nextInt();
            ciagLiczb.add(liczba);

            do {
                System.out.println("Wprowadź kolejną liczbę.");
                liczba = scanner.nextInt();
                ciagLiczb.add(liczba);
            } while (liczba != 0);

            for (Integer liczbyWCiagu : ciagLiczb) {
                sumaLiczbWCiagu += liczbyWCiagu;
            }

            System.out.println("Ciag wprowadzonych liczb to: " + ciagLiczb);

            srednia = (double) sumaLiczbWCiagu / (double) ciagLiczb.size();
            System.out.println("Suma wszystkich liczb w ciagu to: " + sumaLiczbWCiagu);
            System.out.println("Ilość liczb w ciągu to: " + ciagLiczb.size());
            System.out.println("Srednia wszystkich liczb w ciągu to: " + srednia);
            long endTime = System.currentTimeMillis();
            System.out.println("Czas działania programu: " + (endTime - startTime));

        } catch (Exception e) {
            System.out.println("Musisz wpisywać liczby całkowite. Zaczynamy jeszcze raz.");
            wczytywacz();
        }
    }
}


//    Napisac program, który pobiera od uzytkownika ciag liczb całkowitych.
//    Pobieranie danych konczone jest podaniem wartosci 0 (nie wliczana do danych).
//    W nastepnej kolejnosci program powinien wyswietlic sume najwiekszej oraz najmniejszej z
//    podanych liczb oraz ich srednia arytmetyczna.
//        Przykład:
//        Uzytkownik podał ciag: 1, -4, 2, 17, 0.
//        Wynik programu:
//        13 // suma min. i maks.
//        6.5 // srednia