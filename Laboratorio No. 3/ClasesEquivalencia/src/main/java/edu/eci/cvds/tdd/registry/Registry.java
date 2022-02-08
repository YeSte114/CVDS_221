package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {

    ArrayList<Integer> registrados = new ArrayList<Integer>();

    public RegisterResult registerVoter(Person p) {

        if (!p.isAlive()){
            return RegisterResult.DEAD;
        } else if (p.getAge() > 0 && p.getAge() < 18){
            return RegisterResult.UNDERAGE;
        } else if (p.getAge() < 0 || p.getAge() > 125){
            return RegisterResult.INVALID_AGE;
        } else if (registrados.contains(p.getId())){
            return RegisterResult.DUPLICATED;
        } else {
            registrados.add(p.getId());
            return RegisterResult.VALID;
        }

    }

}
