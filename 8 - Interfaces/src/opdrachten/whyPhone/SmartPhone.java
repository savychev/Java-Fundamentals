package opdrachten.whyPhone;

public class SmartPhone implements ICamera, IGPS, IRadio, ISimCard, IWifi {
    private final double PRICE;
    private final String BRAND;
    private int numberOfPhotos;

    public SmartPhone(double PRICE, String BRAND) {
        this.PRICE = PRICE;
        this.BRAND = BRAND;
    }

    @Override
    public void shootAPhoto(double amountOfPhotos) {

    }

    @Override
    public String[] viewPhoto() {
        return new String[0];
    }

    @Override
    public String locatie(double latitude, double longtitude) {
        return "";
    }

    @Override
    public void navigate() {

    }

    @Override
    public void playChannel(double fm) {

    }

    @Override
    public void changeChannel(double fm) {

    }

    @Override
    public void connect(String internetConnection) {

    }

    @Override
    public void disconnect(String internetConnection) {

    }
}
