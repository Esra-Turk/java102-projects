public class Phone extends Product{

    private double batteryPower;
    private int camera;
    private String color;

    public Phone(String productName,int amountOfStock, int ram, int storage, double unitPrice, double discountRate, double screenSize,  Trademark tradeMark, double batteryPower, int camera, String color) {
        super(productName,amountOfStock, ram, storage, unitPrice, discountRate, screenSize, tradeMark);
        this.batteryPower = batteryPower;
        this.camera = camera;
        this.color = color;
    }

    public double getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
