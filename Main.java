import java.util.Scanner;

class zadania {
            public static boolean palindrom(String s) {
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


                System.out.println("Podaj n trójkąta pascala:");
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






            }

}

