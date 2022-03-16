package nyugtaprojektek;
/* Probléma:
a 3. tétel árát 650-ről átírtuk 1320-ra.
Így szinte minden változott, mindenhez hozzá kell nyúlni
Refaktorizálás:
anmit egynél többször használunk, 
azt kiszervezzük változóba és erre hivatkozunk
*/
public class Nyugta2 {

    public static void main(String[] args) {
        csillagos();
        System.out.println("     Nyugta 2");
        csillagos();
        
        String huf = "Ft";
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        System.out.printf("Tétel 1:     %d %s\n", tetel1, huf);
        System.out.printf("Tétel 1:      %d %s\n", tetel2, huf);
        System.out.printf("Tétel 3:    %d %s\n", tetel3, huf);

        duplavonalas();
        int osszesen = tetel1 + tetel2 + tetel3;
        System.out.printf("Összesen:   %d %s\n", osszesen, huf);
        szaggatottira();
        
        int kedvMertek = 10;
        int kedvezmeny = osszesen / kedvMertek;
        System.out.printf("Kedvezmény:  %d %s\n", kedvezmeny, huf);
        System.out.printf("(%d%%)\n", kedvMertek);
        duplavonalas();
        int fizetendo = osszesen - kedvezmeny;
        System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);
        double euro = fizetendo / 350.0;
        huf = "\u20ac";//EZ NEM JÓ!!!!
        System.out.printf("            %f %s\n", euro, huf);
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
