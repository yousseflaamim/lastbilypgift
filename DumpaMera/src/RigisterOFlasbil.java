import java.io.*;
import java.util.*;

public class RigisterOFlasbil {
    ArrayList<String> las=new ArrayList<>(1);
    public String name;
    private double weight;


    public Object registreraNyaLasbil() throws IOException {


            MenuOflasbil veckele = new MenuOflasbil();
             veckele.typOf_Truck();


            System.out.println("hello make Registration  truck with weight");


            //scanner input information weight and number truck

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter sign board(truck number) of your truck");
            name = scanner.nextLine();
            System.out.println("Enter weight of  your truck");

        weight = scanner.nextDouble();
           if (weight>=2400){

                  las.add("truck number" + name + " " + "weight of the truck  " + weight);
              }else {System.out.println("sorry you dont can register ");}

        Parking_C c =new Parking_C();
        Parking_B b =new Parking_B();
        Parking_A a=new Parking_A();
        Parking_D d =new Parking_D();
        Parking_E e=new Parking_E();
//check if for weight and where can parker

        if (weight == 3499||weight>=2700) {
              a.NameParking();

        } else if (weight>2000||weight ==2500 ) {
            b.NameParking();


        } else if (weight>=3500||weight == 4500) {
            c.NameParking();

        } else if (weight == 8999||weight>=4500) {
            d.NameParking();


        } else if (weight >= 9000) {
            e.NameParking();


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