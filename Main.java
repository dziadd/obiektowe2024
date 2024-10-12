import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //1
        System.out.println("Krystian Dobrołęcki");

        //2
        String im = "Krystian Dobrołęcki";
        System.out.println(im.length());

        //3
        String a = "Ala ";
        String b = "ma ";
        String c = "kota";
        String d = a+b+c;

        System.out.println(d);

        //4

        System.out.println("                    *");
        System.out.println("                    * *");
        System.out.println("                    * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("                    * * *");
        System.out.println("                    * *");
        System.out.println("                    *");

        //5

        String txt = "Ala ma kota";
        String txt1 = txt.replace("a","e");
        System.out.println(txt1);

        //6

        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        //7

        int ascii = 'A';
        int ascii1 = '!';
        int ascii2 = '@';
        int ascii3 = '>';
        int ascii4 = '~';
        int ascii5 = '\n';
        int ascii6 = '\b';


        System.out.println(ascii);
        System.out.println(ascii1);
        System.out.println(ascii2);
        System.out.println(ascii3);
        System.out.println(ascii4);
        System.out.println(ascii5);
        System.out.println(ascii6);

        //8

        System.out.println("Duże litery w ASCII od 65-90, małe od 97-122, cyfry 48-57");

        //9

        String zdanie = "Grzesiek nie wiedział dlaczego jest tak drapieżnym %s mimo,że jego %s na to nie wskazuje.";
        String zzdanie = String.format(zdanie,"knurem", "waga");
        System.out.println(zzdanie);

        //10
        String ksiazka = "%s to najlepsza książka napisana przez %s";
        String ksiazkas = String.format(ksiazka,"Wiedźmin Ostatnie Życzenie", "Andrzeja Sapkowskiego.");
        System.out.println(ksiazkas);

        //11

        String w = "wodrze ";
        System.out.println(w.repeat(5));

        //12

        LocalDate data = LocalDate.now();
        LocalTime czas = LocalTime.now();



        System.out.println("Dzisiaj jest " + data + " godzina " + czas);

        //13

        char q = 54;
































    }
}