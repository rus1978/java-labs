import org.hamcrest.Matcher;

public class Bus extends Transport {
    public void Bus() throws Exception {
        this.setMaxPlaces(40);
        this.setType( TransportType.Common );
    }

    @Override
    public Matcher<?> addUser(PoliceMan user) {
        return null;
    }

    @Override
    public Matcher<?> delUser(PoliceMan user) {
        return null;
    }
}
