import org.hamcrest.Matcher;

public class TaxiCar extends Transport {
    public void TaxiCar() throws Exception {
        this.setMaxPlaces(4);
        this.setType(TransportType.Taxi);
    }
}
