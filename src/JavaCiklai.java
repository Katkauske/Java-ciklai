import java.sql.SQLOutput;

public class JavaCiklai {
    public static void main(String[] args) {
        int pradzia = 10;
        int pabaiga = 20;
        isvedimas(pradzia,pabaiga);
        int n = 55;
        System.out.println(bruksneliai(n));

    }
    public static void isvedimas(int pradzia,int pabaiga){
        for (int i = pradzia; i <= pabaiga; i++){
            System.out.println("Isvedimas nuo iki: " + i);
        }
    }

    //3. Sukurkite funkciją, kuri gauna int parametrą n ir išvestų į tą pačią eilutę n brūkšniukų.
    // Norint išvesti į tą pačią eilutę galima naudoti print() komanda arba prieš išvedant brūkšniukus
    // cikle sudėti į vieną String kintamąjį ir jį išvesti į println() po ciklo
    public static String bruksneliai(int n){
        String bruksniai = "";
        for( int i = 0; i < n; i++){
            bruksniai += "-";
        }
        return bruksniai;
    }
}


