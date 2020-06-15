//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.jupiter.api.Test;
//import org.junit.rules.ExpectedException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class TransportTest {

    @Test
    void addPoliceMan() throws Exception {
        PoliceMan user= new PoliceMan();
        PoliceCar car= new PoliceCar();

        car.addUser(user);
        car.addUser(new PoliceMan());
        car.addUser(new PoliceMan());

        Assertions.assertThrows(
            IllegalStateException.class, (Executable) car.addUser(user)
        );
    }

    @Test
    void delPoliceMan() throws Exception {

        PoliceMan user= new PoliceMan();
        PoliceCar car= new PoliceCar();

        car.addUser(user);
        car.addUser(new PoliceMan());
        car.addUser(new PoliceMan());
        car.addUser(new PoliceMan());
        car.addUser(new PoliceMan());
        car.addUser(new PoliceMan());

        Assertions.assertThrows(
            IllegalStateException.class, (Executable) car.delUser(user)
        );
    }
}