import java.util.Objects;
import java.util.Scanner;


public class Meadow {
    public static void main(String[] args) {
        Insect[] insects = new Insect[3];
        insects[0]= new Insect("mucha",6);
        insects[1]= new Insect("pszczoła",8);
        insects[2]= new Insect("chrabąszcz",6);
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj nazwy owadów, zakończ enterem: ");
        for (int i = 0; i < 4; i++) {
          String name = input.next();
            if ( name.equals(names)) {
                System.out.println("duplicat, ponów próbę dodawania" +
                        " owadów");
                continue;
            }
        }
    }
}

