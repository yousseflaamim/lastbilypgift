public class HeavyTruck implements Truck {
    @Override
    public void nameOftruck() {
        System.out.println("you have chosen Tung truck");
    }

    @Override
    public void sizOftruck() {
        System.out.println("Allowed weight is above than 9 T");
    }
}
