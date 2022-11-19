import java.io.IOException;
import java.util.Scanner;


public class showmenuofparking {
    static int nm = -0;
    String nm1;


    public static void listaofmenuparkDumpa() throws IOException {
        rigisterOFlasbil ap = new rigisterOFlasbil();

        do {
            System.out.println(" 1= lista parkerade lastbilar");
            System.out.println(" 2= register lasbil");
            System.out.println(" 3= exit");

            Scanner sc = new Scanner(System.in);
            if(nm==1||nm==2||nm==3) {
                nm = sc.nextInt();
                switch (nm) {
                    case 1:
                        ap.Showparkinglastbil();
                        break;
                    case 2:
                        if (ap.las.size() > 1) {
                            System.out.println("sorry is full you can choose other parking");
                        } else {
                            ap.registreraNyaLasbil();
                        }
                        break;
                    case 3:
                        System.out.println("good bay see you soon");
                        break;
                }
            }else System.out.println("sorry your choose isn't correct try aging" );




        } while (nm != 3) ;
    }
}