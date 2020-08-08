import java.util.Scanner;
import java.util.Random;

public class kitalalos_jatek {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int tippekSzama = 0;
        int veletlenSzam = new Random().nextInt(10) + 1;

        System.out.println("írj be egy számot 1 és 10 között");

        int bekertSzam = sc.nextInt();
        tippekSzama++;

        do{
            System.out.println("Próbálkozz újra");
            bekertSzam = sc.nextInt();
            tippekSzama++;
        }while(bekertSzam != veletlenSzam);

        System.out.println("Nyertél");
        System.out.println("A szám:" + veletlenSzam);
        System.out.println("Próbálkozások:" + tippekSzama);
    }
}