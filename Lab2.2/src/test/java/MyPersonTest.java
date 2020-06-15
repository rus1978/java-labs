import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyPersonTest {

    private MyPerson getInstance(){
        MyPerson person= new MyPerson();
        person.setFirstName("Ruslan");
        person.setLastName("Bondar");
        person.setId(111);
        return person;
    }

    @Test
    void testFields() {
        MyPerson person= getInstance();

        int expResultId = 111;
        String expResultFirsName = "Ruslan";
        String expResultLastName = "Bondar";

        Assertions.assertEquals(expResultId, person.getId());
        Assertions.assertEquals(expResultFirsName, person.getFirstName());
        Assertions.assertEquals(expResultLastName, person.getLastName());
    }

    @Test
    void testEquals() {
        MyPerson person= getInstance();

        Gson gson = new Gson();
        MyPerson expResult = gson.fromJson("{\"id\":111,\"firstName\":\"Ruslan\",\"lastName\":\"Bondar\"}"
                , MyPerson.class);

        boolean actResult= person.equals(expResult);
        Assertions.assertTrue( actResult );
    }

    @Test
    void toJson() {
        MyPerson person= getInstance();

        String expResult = "{\"id\":111,\"firstName\":\"Ruslan\",\"lastName\":\"Bondar\"}";
        String actResult = person.toJson(person);

        Assertions.assertEquals(expResult, actResult);
    }
}