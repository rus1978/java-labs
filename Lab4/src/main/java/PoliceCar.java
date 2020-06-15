import org.hamcrest.Matcher;

public class PoliceCar extends Transport {
    public void PoliceCar() throws Exception {
        this.setMaxPlaces(4);
        this.setType(TransportType.Police);
    }
}
