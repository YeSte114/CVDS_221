package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResultDEAD() {

        Person person = new Person("Laura", 123456, 20, Gender.FEMALE, false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validateRegistryResultVALID() {

        Person person = new Person("Steven", 23326783, 23, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateRegistryResultUNDERAGE() {

        Person person = new Person("Camilo", 789456, 5, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void validateRegistryResultINVALIDAGE() {

        Person person = new Person("Nancy", 2160804, -45, Gender.FEMALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validateRegistryResultDUPLICATE() {

        Person personOne = new Person("Santiago", 456123, 26, Gender.MALE, true);
        Person personTwo = new Person("Santiago", 456123, 26, Gender.MALE, true);

        RegisterResult resultOne = registry.registerVoter(personOne);
        RegisterResult resultTwo = registry.registerVoter(personTwo);

        Assert.assertEquals(RegisterResult.DUPLICATED, resultTwo);
    }


}
