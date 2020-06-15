import org.junit.Assert;

import javax.sound.sampled.Mixer;

import static org.junit.jupiter.api.Assertions.*;

class GateRegisterTest {

    @org.junit.jupiter.api.Test
    void getCardById() {
        GateRegister register = new GateRegister();
        Assert.assertTrue("Card not found", register.getCardById(1000) != null);
    }

    @org.junit.jupiter.api.Test
    void createCountCard() {
        GateRegister register = new GateRegister();

        CountCard card = register.createCountCard(5);

        Assert.assertEquals(5, card.getTripsCount());
    }

}