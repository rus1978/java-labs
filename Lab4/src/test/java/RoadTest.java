import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {
    @Test
    void getCountOfHumans() throws Exception {
        FireMan user= new FireMan();
        FireCar car= new FireCar();
        
        Road road= new Road();
        road.addCarToRoad( car.addUser(user) );

        assertEquals(2, road.getCountOfHumans());
    }
}