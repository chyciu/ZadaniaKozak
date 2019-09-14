package petle;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

public class Kalendarz {

    public static void main(String[] args) {

            kalendarz();
            kalendarz2();


    }

    public static void kalendarz() {

        System.out.println("Pn Wt Sr Cz Pt So Nd");
        System.out.println("---------------------");

        int day = 1;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 6; j++) {
                if (i == 0 && j < 3) {
                    System.out.print("   ");
                } else {
                    System.out.print(" " + day++);
                    if (day < 11) {
                        System.out.print(" ");
                    }
                    if (day == 32) {
                        break;
                    }
                }
            }
            System.out.println();
        }
    }


    public static void kalendarz2() {

        System.out.println("Pn Wt Sr Cz Pt So Nd");
        System.out.println("---------------------");

        int day = 1;
        Random random = new Random();
        int randomDay = random.nextInt(7);
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 6; j++) {
                if (i == 0 && j <= randomDay) {
                    System.out.print("   ");
                } else {
                    System.out.print(" " + day++);
                    if (day < 11) {
                        System.out.print(" ");
                    }
                    if (day > 31 && i == 5) {
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}



//    Strona z kalendarza dla miesiąca stycznia, gdzie 1 stycznia wypada w środę,
//    dla aktualnej daty 16 stycznia może wyglądać jak poniżej:

//        Pn Wt Śr Cz Pt Sb Nd
//        --------------------
//                  1 2 3 4 5
//        6 7 8 9 10 11 12
//        13 14 15[16]17 18 19
//        20 21 22 23 24 25 26
//        27 28 29 30 31
//
//        ◦ wyświetl powyższą stronę używając pętli oraz dodatkowych instrukcji
//        ◦ dostosuj kod, by 1 stycznia mógł wypadać dowolnego dnia tygodnia
//        ◦ pobierz dane (korzystając z klasy oferującej operacje na dacie i czasie) o aktualnej dacie i
//        wyświetl dla niej stronę z kalendarza
//
