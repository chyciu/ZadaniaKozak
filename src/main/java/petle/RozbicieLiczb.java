package petle;

import java.util.Scanner;

public class RozbicieLiczb {

    public static void main(String[] args) {

        pobieraczLiczb();

    }

    public static void pobieraczLiczb() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz dowolną liczbę całkowitą.");
            long liczbaUzytkownika = scanner.nextLong();
            System.out.println("Twoja liczba to: " + liczbaUzytkownika);

            String nowaLiczba = String.valueOf(liczbaUzytkownika);
            char[] chars = nowaLiczba.toCharArray();

            int suma = 0;
            double sumaParzystych = 0;
            double sumaNieparzystych = 0;
            double iloscParzystych = 0;
            double iloscNieparzystych = 0;
            for (int i = 0; i < chars.length; i++) {
                int noweI = Character.getNumericValue(chars[i]);
                suma = suma += noweI;

                if (noweI % 2 == 0) {
                    sumaParzystych = sumaParzystych += noweI;
                    iloscParzystych++;
                } else {
                    sumaNieparzystych = sumaNieparzystych += noweI;
                    iloscNieparzystych++;
                }
            }


            System.out.println("\nSuma cyfr Twojej liczby to: " + suma);
            System.out.println("Suma cyfr parzystych Twojej liczny to: " + sumaParzystych +
                    "\n" + "Suma cyfr nieparzystych Twojej liczby to: " + sumaNieparzystych);
            System.out.println("Ilość cyfr parzystch to; " + iloscParzystych +
                    "\n" + "Ilość cyfr nieparzystych to: " + iloscNieparzystych);

            double sredniaParzystych = sumaParzystych / iloscParzystych;
            double sredniaNieparzystych = sumaNieparzystych / iloscNieparzystych;

            System.out.println("Srednia arytmetyczna cyfr parzystych w Twojej liczbie to: " + sredniaParzystych +
                    "\n" + "Srednia arytmetycza cyfr nieparzystych w Twojej liczbie to: " + sredniaNieparzystych);

            double stosunek = sredniaParzystych / sredniaNieparzystych;
            System.out.println("Stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej cyfr nieparzystaych to: " +
                    stosunek);

        } catch (Exception e) {
            System.out.println("Ups, chyba nie wpisałeś liczby całkowitej. Zacznijmy jeszcze raz.");
            pobieraczLiczb();
        }
    }
}


//    Napisac program, który pobiera od uzytkownika liczbe całkowita, a nastepnie:
//    • oblicza sume cyfr tej liczby,
//    • stosunek sredniej arytmetycznej cyfr parzystych do sredniej arytmetycznej cyfr nieparzystych.
