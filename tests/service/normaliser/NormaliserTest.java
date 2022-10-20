package service.normaliser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static service.enums.NormalisedTitle.ACCOUNTANT;
import static service.enums.NormalisedTitle.SOFTWARE_ENGINEER;

class NormaliserTest {

    @Test
    public void normaliseTests() {
        String jt = "Java engineer";
        Normaliser n = new Normaliser();
        Assertions.assertEquals(SOFTWARE_ENGINEER.getTitle(), n.normalise(jt));
        jt = "C# engineer";
        Assertions.assertEquals(SOFTWARE_ENGINEER.getTitle(), n.normalise(jt));
        //output normalisedTitle
        jt = "Chief Accountant";
        Assertions.assertEquals(ACCOUNTANT.getTitle(), n.normalise(jt));
        //output normalisedTitle
    }
}