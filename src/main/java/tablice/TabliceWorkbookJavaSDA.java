package tablice;

public class TabliceWorkbookJavaSDA {

    public static void main(String[] args) {

        allAndSixFirstAndLast();

    }

    public static void allAndSixFirstAndLast () {

        int[] integers = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};

        System.out.println("wszystkie cyfry");
        for (int all : integers) {
            System.out.print(all + " ");
        }

        System.out.println();

        System.out.println("6 pierwszych cyfr");
        for (int i = 0; i < 6 ; i++) {
            System.out.print(integers[i] + " ");
        }

        System.out.println();

        System.out.println("6 ostatnich cyfr");
        for (int i = 4; i <= integers.length-1 ; i++) {
            System.out.print(integers[i] + " ");
        }

        System.out.println();

        System.out.println("wszystkie parzyste cyfry");
        for (int even : integers) {
            if (even%2 == 0) {
                System.out.print(even + " ");
            }
        }

        System.out.println();

        System.out.println("wszystkie cyfry na nieparzystych indeksach");
        for (int i = 0; i <= integers.length-1 ; i++) {
            if (i%2 > 0) {
                System.out.print(integers[i] + " ");
            }
        }

        System.out.println();

        System.out.println("wszystkie cyfry od tyłu");
        for (int i = integers.length-1; i>=0 ; i--) {
            System.out.print(integers[i] + " ");

        }

        System.out.println();

        System.out.println("wszystkie cyfry oprócz cyfry 5");
        for (int i = 0; i < integers.length-1; i++) {
            if (integers[i] == 5) {
                continue;
            }
            System.out.print(integers [i] + " ");
        }

        System.out.println();

        System.out.println("wszystkie cyfry do cyfry 7 włącznie");
        for (int sevenInclude : integers) {
            if (sevenInclude > 7) {
                break;
            }
            System.out.print(sevenInclude + " ");
        }

        System.out.println();

        System.out.println("sumę wszystkich cyfr");
        int sum = 0;
        for (int sumaAll : integers) {
            sum += sumaAll;
        }
        System.out.println("Suma wszystkch cyfr w tablicy: " + sum);

    }


}

//
//    Dana jest tablica 10 elementowa typu int:
//        int[] integers = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};

//        Przy użyciu jednej z pętli, napisz fragment kodu, który wypisze:
//        ◦ wszystkie cyfry
//        ◦ 6 pierwszych cyfr
//        ◦ 6 ostatnich cyfr
//        ◦ wszystkie parzyste cyfry
//        ◦ wszystkie cyfry na nieparzystych indeksach
//        ◦ wszystkie cyfry od tyłu
//        ◦ wszystkie cyfry oprócz cyfry 5
//        ◦ wszystkie cyfry do cyfry 7 włącznie
//        ◦ wszystkie cyfry podzielne przez 3
//        ◦ sumę wszystkich cyfr
//        ◦ sumę cyfr większych lub równych 4
//        ◦ najmniejszą i największą cyfrę
