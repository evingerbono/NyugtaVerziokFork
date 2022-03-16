package nyugtaprojektek;

public class Nyugta3 {

    public static void main(String[] args) {
        csillagos();
        System.out.printf("%14s\n", "Nyugta 3");
        csillagos();
        
        final String HUF = "Ft";
        int[] tetelek={350,90,1320};
        System.out.printf("%10s: %5d %s\n", "Tétel 1", tetelek[0], HUF);
        System.out.printf("%10s: %5d %s\n", "Tétel 2", tetelek[1], HUF);
        System.out.printf("%10s: %5d %s\n", "Tétel 3", tetelek[2], HUF);

        duplavonalas();
        
        int osszesen = tetelek[0] + tetelek[1] + tetelek[2];
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
        
        szaggatottira();
        
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        duplavonalas();
        

        int fizetendo = osszesen + szervizDij;
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        final String eur = "\u20ac";
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        
        szaggatottira();
        
        ujsor();
        alsoira();
        rovidvalszira();
        alsoira();
        ujsor();
        System.out.print(" Dátum");
         rovidvalszira();
        System.out.println("   Név");
        
        csillagos();    
        System.out.println("        CÉG");
        csillagos();
        
        
    }
    private static void csillagos() {
        String csillagok = "*******************";
        System.out.println(csillagok);
    }

    private static void duplavonalas() {
       String duplaVonal = "===================";
       System.out.println(duplaVonal);
    }

    private static void szaggatottira() {
        String szaggatottVonal = "-------------------";
        System.out.println(szaggatottVonal);
    }

    private static void alsoira() {
        String rovidVonal = "_______";
        System.out.print(rovidVonal);
    }

    private static void rovidvalszira() {
        String rovidVonalValaszto = "     ";
        System.out.print(rovidVonalValaszto);
    }

    private static void ujsor() {
        System.out.println("");
    }

}
