import java.io.IOException;
import java.util.Scanner;

public  class MenuOflasbil {

   public String nam = " ";
   //chose type of truck
    public String typOf_Truck() throws IOException {
        Van van=new Van();
        HeavyTruck heavyTruck=new HeavyTruck();
        SmallTruck smallTruck=new SmallTruck();
         this.nam=nam;
        System.out.println("which truck do you have");
        System.out.println("... 1  = Van ...");
        System.out.println("... 2  = Small truck... ");
        System.out.println("....3  = Heavy truck ...");
        System.out.println("....4 = back to menu....");

        // scanner of input customer

        Scanner scanner = new Scanner(System.in);
          int  nams = scanner.nextInt();
//registration of the customer choice of truck and information
if (nams==1||nams==2||nams==3||nams==4)
            switch (nams) {
                      case 1 :van. nameOftruck();
                                van.sizOftruck();
                             break;
                      case 2:smallTruck.nameOftruck();
                                    smallTruck.sizOftruck();
                                    break;
                      case 3:heavyTruck.nameOftruck();
                                          heavyTruck.sizOftruck();
                          break;
                      case 4:
                          ShowMenuOfParking.listaofmenuparkDumpa();
                             break;





            }


            return nam;
        }

    }






