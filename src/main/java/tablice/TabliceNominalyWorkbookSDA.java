package tablice;

public class TabliceNominalyWorkbookSDA {

    public static void main(String[] args) {

        funciotns();

    }

    public static void funciotns () {

        int[] money = {1, 2, 5, 10, 20};
        //int idx = (int) (Math.random() * money.length + 1);

        System.out.println("funckcja będzie w pętli losowo pobierała wartość aż \"uzbiera\" wartość 100");
        System.out.println("każda pobrana wartość ma być wyświetlona");
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            int idx = (int) (Math.random() * money.length + 1);
            sum += idx;
            count++;
            System.out.print(idx + " ");
            System.out.println(sum + " ");
            if (sum >= 100){
                break;
            }
        }
        System.out.println("\nSuma: " + sum);
        System.out.println("Liczba pobrań: " + count);



    }


}


//    Dana jest tablica przechowująca nominały pieniędzy:
//        int[] money = {1, 2, 5, 10, 20};

//        oraz przykład kodu, który losuje jeden z indexów tej tablicy:
//        int idx = (int) (Math.random() * money.length + 1);

//        Napisz program, który:
//        ◦ będzie w pętli losowo pobierał wartość aż "uzbiera" wartość 100
//        ◦ każda pobrana wartość ma być wyświetlona
//        ◦ każda składowa suma ma być wyświetlona
//        ◦ na koniec ma być wyświetlona liczba pobrań pieniędzy koniecznych do uzbierania 100 oraz
//        uzbierana suma (bo może przekroczyć 100)
//        ◦ spróbuj zmodyfikować ten program, tak by pozwalał uzbierać dokładnie zadaną kwotę (nie
//        pozwalał na jej przekroczenie)

