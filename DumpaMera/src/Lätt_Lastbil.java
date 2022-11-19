public class Lätt_Lastbil implements Lasbillar{
    int vege=9000;

    public int getVege() {
        this.vege=9000;
        return vege;
    }

    @Override
    public void NameOflasbil() {
        System.out.println("you have chosen LÄtt LASBIL");
    }

    @Override
    public void SizOfLastbil() {
        System.out.println("Allowed weight is less than 9 T");

    }
}
