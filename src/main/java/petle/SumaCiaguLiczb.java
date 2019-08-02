package petle;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumaCiaguLiczb {

    public static void main(String[] args) {

        SumaCiaguLiczb sumaCiaguLiczb = new SumaCiaguLiczb();
        sumaCiaguLiczb.ciagLiczb();

    }


    public void ciagLiczb() {

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę całkowitą A.");
            int liczbaA = scanner.nextInt();
            System.out.println("Podaj liczbę całkowitą B.");
            int liczbaB = scanner.nextInt();
            System.out.println("Liczba A: " + liczbaA);
            System.out.println("Liczba B: " + liczbaB);

            if (liczbaA < liczbaB) {
                int sum = IntStream.rangeClosed(liczbaA, liczbaB).sum();
                System.out.println("Suma ciągu: " + sum);
            } else {
                System.out.println("Liczba A musi być większa od liczby B.");
                ciagLiczb();
            }

            int suma = 0;
            for (int i = liczbaA; i <= liczbaB; i++) {
                suma = suma+=i;
            }
            System.out.println("Suma ciągu z petlą -for-: " + suma);

            int newSuma = 0;
            do {

                newSuma = newSuma += liczbaA;
                liczbaA++;

            } while (liczbaA <= liczbaB);
            System.out.println("Suma ciągu z pętlą - do - while -: " + newSuma);



        } catch (Exception e) {
            System.out.println("Nie podałeś liczb.");
            ciagLiczb();
        }
    }
}



//    Napisac program pobierajacy od uzytkownika dwie liczby całkowite A oraz B,
//    A < B, a nastepnie wyznaczajacy sume ciagu liczb od A do B, czyli sume ciagu
//    A,A + 1, . . . ,B). Obliczenia nalezy wykonac trzykrotnie stosujac kolejno petle:
//    while, do-while, for.
//        Przykład:
//        Dla A = 4 i B = 11 program powinien wyswietlic:
//        60
//        60
//        60
