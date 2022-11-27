import java.io.IOException;
import java.util.Scanner;


public class ShowMenuOfParking {

    String nm1;


    public static void listaofmenuparkDumpa() throws IOException {
        RigisterOFlasbil ap = new RigisterOFlasbil();
         int nm = -0;
        do {
            System.out.println(" 1= list parker truck");
            System.out.println(" 2= register truck");
            System.out.println(" 3= exit");

            Scanner sc = new Scanner(System.in);

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





        } while (nm !=3) ;
    }
}