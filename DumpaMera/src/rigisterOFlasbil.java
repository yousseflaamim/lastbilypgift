import java.io.*;
import java.util.*;

public class rigisterOFlasbil {
    ArrayList<String> las=new ArrayList<>(1);
    public String name;
    private double vage;


    public Object registreraNyaLasbil() throws IOException {


            MenuOflasbil veckele = new MenuOflasbil();
             veckele.typoflasbil();


            System.out.println("hello make Registration  lastbil with weight");


            //scanner input iformation weight and nmberof lasbil

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter sign board(rignumer) of your lastbil");
            name = scanner.nextLine();
            System.out.println("Enter weight of  your lastbil");

            vage = scanner.nextDouble();
           if (vage>=2400){

                  las.add("rignummer " + name + " " + "vage  " + vage);
              }else {System.out.println("sorry you dont can register ");}

        Parking_C c =new Parking_C();
        Paking_B b =new Paking_B();
        Parking_A a=new Parking_A();
        Parking_D d =new Parking_D();
        Parking_E e=new Parking_E();
//check if for weight and where can parkera

        if (vage == 3499||vage>=2700) {
              a.NamePaking();

        } else if (vage>2000||vage ==2500 ) {
            b.NamePaking();


        } else if (vage>3500||vage == 4500) {
            c.NamePaking();

        } else if (vage == 8999||vage>=4500) {
            d.NamePaking();


        } else if (vage >= 9000) {
            e.NamePaking();


        }



        return null;
    }

    public void Showparkinglastbil() {
        if (las.isEmpty()){
            System.out.println("sorry list isEmpty ");
        }else
        for (String e:las
             ) {
            System.out.println(e);

        }


        //registar data in fil

      /*  File A = new File("a.txt");
        try {
            Scanner scanner = new Scanner(A);

            while (scanner.hasNext()) {
              String  text = scanner.nextLine();
                System.out.println(text);

                }

            }catch(Exception e){
            e.printStackTrace();
        }*/
    }


}