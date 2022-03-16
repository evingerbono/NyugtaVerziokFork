package nyugtaprojektek;

public class Nyugta1 {

    public static void main(String[] args) {
        csillagosiras();
        System.out.println("     Nyugta 1");
        csillagosiras();
        System.out.println("Tétel 1:    350 Ft");
        System.out.println("Tétel 2:     90 Ft");
        System.out.println("Tétel 3:    650 Ft");
        egyenlöira();
        System.out.println("Összesen:  1090 Ft");
        simavonalira();
        System.out.println("Kedvezmény: 109 Ft");
        System.out.println("(10%)");
        egyenlöira();
        System.out.println("Fizetendő:  981 Ft");
        simavonalira();
        ures();
        alsovonalira();
        ures2();
        alsovonalira();
        ures();
        System.out.print(" Dátum");
        ures2();
        System.out.println("   Név");
        csillagosiras();
        System.out.println("        CÉG");
        csillagosiras();
        
        
    }

    private static void csillagosiras() {
        System.out.println("******************");
    }

    private static void egyenlöira() {
        System.out.println("==================");
    }

    private static void alsovonalira() {
        System.out.print("_______");
    }

    private static void ures() {
        System.out.println("");
    }

    private static void simavonalira() {
        System.out.println("------------------");
    }

    private static void ures2() {
        System.out.print("   ");
    }
    
}
