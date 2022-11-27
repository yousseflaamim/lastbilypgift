public class Van implements Truck {
    @Override
    public void nameOftruck() {
        System.out.println("you have chosen Van");
    }

    @Override
    public void sizOftruck() {
        System.out.println("Allowed weight is less than 240 t");
    }
}
