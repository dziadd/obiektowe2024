import java.util.Scanner;

class zadania {
    public static boolean palindrom(String s) { //funkcja do sprawdzania palindromu
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę, by sprawdzić czy jest palindromem?");
        String liczba = scan.nextLine();
        boolean b1 = palindrom(liczba);
        System.out.println(liczba + " " + b1);


        System.out.println("Podaj n trójkąta pascala:"); // trojkat pascala
        int n = scan.nextInt() + 1;

        for (int l = 0; l < n; l++) {
            for(int spc = 0; spc < n - l - 1; spc++){
                System.out.print(" ");
            }
            int one = 1;
            for (int i = 0; i<=l; i++) {
                System.out.print(one + " ");
                one = one * (l - i) / (i + 1);
            }
            System.out.println();
        }


        System.out.println("Krystian Dobrołęcki");
        String imie = "KrystianDobrołęcki";
        System.out.println(imie.length());


        String a = "Ala";
        String b = "ma";
        String c = "kota";

        System.out.println(a + " " + b + " " + c);

        String gwiazdki = "* * * * * * * * * * ";
        String spacja ="                    ";
        System.out.println(spacja + "*");
        System.out.println(spacja + "* * ");
        System.out.println(spacja + "* * *");
        System.out.println(gwiazdki + "* * * *");
        System.out.println(gwiazdki + "* * * * *");
        System.out.println(gwiazdki + "* * * *");
        System.out.println(spacja + "* * * ");
        System.out.println(spacja + "* *");
        System.out.println(spacja + "*");



        char litera = 'A';
        int kodAscii = (int) litera;
        char litera1 = '!';
        int kodAscii1= (int) litera1;
        char litera2 = '@';
        int kodAscii2 = (int) litera2;
        char litera3 = '>';
        int kodAscii3 = (int) litera3;

        System.out.println("Kody ASCII " + kodAscii + " " + kodAscii1 + " " + kodAscii2 + " " + kodAscii3);
        System.out.println("W kodzie ASCII duże litery: 65-90, małe litery: 97-122");

        String tekst = a + " " + b + " " + c;
        String tekstm = tekst.toLowerCase();
        String tekstd = tekst.toUpperCase();
        System.out.println(tekstd + " " + tekstm);

        String zdanie = "Grzesiek nie wiedział dlaczego %s jest tak drapieżnym %s, mimo, że jego %s na to nie wskazują.";
        String s1 = "gość";
        String s2 = "zwierzęciem";
        String s3 = "wątłe ramiona";
        String pz = String.format(zdanie,s1, s2, s3);
        System.out.println(pz);

        String ksiazka = "„%s to najlepsza książka napisana przez %s”";
        String k1 = "Poradnik java";
        String k2 = "Kochanowskiego";
        String ksiazkaf = String.format(ksiazka,k1,k2);
        System.out.println(ksiazkaf);


        String w = "wodrze";
        for (int i = 0; i < 5; i++) {
            System.out.println(w);
        }

        int indeks = 175008;
        char znaki = (char) indeks;
        System.out.println("Mój indeks w char: " + znaki);



//zestaw 2;

        //zad1.2 Dwa pierwsze typy danych beda double reszta int;


        double wynik = Math.sqrt(7) - 1.0 / 2 + Math.pow(3, 3) % 2;
        System.out.println("Wynik działania 1: " + wynik);

        double wynik2 = 2003/30 * 1;
        System.out.println("Wynik działania 2: " + wynik2);

        double licznik = 3 + Math.sqrt(3);
        double mianownik = Math.sqrt(5) / 2 / 3;
        double wynik3 = licznik / mianownik + 1;
        System.out.println("Wynik działania 3: " + wynik3);

        double wynik4 = 4 % 3 % 2;
        System.out.println("Wynik działania 4: " + wynik4);

        String imiec = "Adam";
        String nazwisko = "Nowak";


        int sumaImie = 0;
        for (int i = 0; i < imiec.length(); i++) {
            sumaImie += imiec.charAt(i);
        }

        int sumaNazwisko = 0;
        for (int i = 0; i < nazwisko.length(); i++) {
            sumaNazwisko += nazwisko.charAt(i);
        }
        int reszta = sumaNazwisko % sumaImie;
        int wynikKroku2 = reszta + 1;
        double pierwiastek = Math.pow(2, 0.25);  // 2^(1/4)
        double wynikc = wynikKroku2 / pierwiastek;

        System.out.printf("Wynik wyrażenia: %.2f\n", wynikc);

        Scanner skan = new Scanner(System.in);
        System.out.println("Podaj pierwszy wyraz: ");
        String slowo1 = skan.nextLine();
        System.out.println("Podaj drugi wyraz: ");
        String slowo2 = skan.nextLine();
        System.out.println("Razem :" + slowo1 + " " + slowo2);

        System.out.println("Podaj pierwszą liczbę: ");
        int cyfra1 = skan.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int cyfra2 = skan.nextInt();
        int sm = cyfra1 + cyfra2;
        int od = cyfra1 - cyfra2;
        int mn = cyfra1 * cyfra2;
        int dz = cyfra1 / cyfra2;
        System.out.println("Wyniki: Suma = " + sm + ", różnica: " + od + ", mnożenie: " + mn + ", dzielenie: " + dz);

        System.out.print("Podaj liczbę x: ");
        int x = skan.nextInt();

        int powiekszona = x + 140;
        System.out.println("Powiększona o 140: " + powiekszona);

        int pomniejszona = x - 31;
        System.out.println("Pomniejszona o 31: " + pomniejszona);

        int powiekszona7 = x * 7;
        System.out.println("Powiększona 7 razy: " + powiekszona7);

        int pomniejszona13 = x / 13;
        System.out.println("Pomniejszona 13 razy: " + pomniejszona13);

        int modulo7 = x % 7;
        System.out.println("Modulo 7: " + modulo7);

        int dzielenie4 = x / 4;
        System.out.println("Część całkowita z dzielenia przez 4: " + dzielenie4);

        double potega45 = Math.pow(x, 45);
        System.out.println("Podniesiona do potęgi 45: " + potega45);

        int ilorazBitowy = x & 67;
        System.out.println("Iloraz bitowy z 67: " + ilorazBitowy);

        int sumaBitowa = x | 59;
        System.out.println("Suma bitowa z 59: " + sumaBitowa);

        int xor23 = x ^ 23;
        System.out.println("XOR z 23: " + xor23);

        int przesuniecieLewo = x << 5;
        System.out.println("Przesunięta o 5 bitów w lewo: " + przesuniecieLewo);

        int przesunieciePrawo = x >> 6;
        System.out.println("Przesunięta o 6 bitów w prawo: " + przesunieciePrawo);





    }
}






