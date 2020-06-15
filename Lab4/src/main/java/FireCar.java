import org.hamcrest.Matcher;

public class FireCar extends Transport {
    public void FireCar() throws Exception {
        this.setMaxPlaces(18);
        this.setType(TransportType.Fire);
    }
}
