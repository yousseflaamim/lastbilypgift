import java.io.IOException;
import java.util.Scanner;

public  class MenuOflasbil {

   public String nam = " ";
   //chose type of lasbil
    public String typoflasbil() throws IOException {
        Skåpbil skåpbil=new Skåpbil();
        Tung_Lasbil tung_lasbil=new Tung_Lasbil();
        Lätt_Lastbil lätt_lastbil=new Lätt_Lastbil();
         this.nam=nam;
        System.out.println("which lastbil do you have");
        System.out.println("... 1  = skapbil ...");
        System.out.println("... 2  = latt lasbil... ");
        System.out.println("....3  =tung lasbil....");
        System.out.println("....4 = back to menu....");

        // scanner of input custumer choic

        Scanner scannerbil = new Scanner(System.in);
          int  nams = scannerbil.nextInt();
//registeration of the customer choice of truk and information
if (nams==1||nams==2||nams==3||nams==4)
            switch (nams) {
                      case 1 :skåpbil.NameOflasbil();
                                skåpbil.SizOfLastbil();
                             break;
                      case 2:lätt_lastbil.NameOflasbil();
                                    lätt_lastbil.SizOfLastbil();
                                    break;
                      case 3:tung_lasbil.NameOflasbil();
                                          tung_lasbil.SizOfLastbil();
                          break;
                      case 4:showmenuofparking.listaofmenuparkDumpa();
                             break;





            }


            return nam;
        }

    }






