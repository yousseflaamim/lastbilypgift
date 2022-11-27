public class SmallTruck implements Truck {
    int wieght =9000;

    public int getWieght() {
        this.wieght =9000;
        return wieght;
    }

    @Override
    public void nameOftruck() {
        System.out.println("you have chosen Small-truck");
    }

    @Override
    public void sizOftruck() {
        System.out.println("Allowed weight is less than 9 T");

    }
}
