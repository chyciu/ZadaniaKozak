package lekarstwa;

public class Lekarstwa {

    String[] nazwaLeku;
    double[] cenaLekarstw;
    double[] refundacja;
    double cenaKoncowa;


    public Lekarstwa(String nazwaLeku, double cenaLekarstw, double refundacja) {
        nazwaLeku.toString().substring(0,1).toUpperCase();
    }

    public double cena (String lek, boolean ubezpieczony) {

        for (int i = 0; i < nazwaLeku.length; i++) {
            if (lek != nazwaLeku[i]) {
                lek = nazwaLeku[i];
                System.out.println(i);
                for (int j = 0; j < cenaLekarstw.length; j++) {
                    if(i == j) {
                        cenaKoncowa = j;
                    } else if (ubezpieczony == true){
                        for (int k = 0; k < refundacja.length; k++) {
                            cenaKoncowa = j-k;
                        }
                    }
                }
            } else
                System.out.println("Lek jest już zapisany.");

        }

        return cenaKoncowa;
    }


}
