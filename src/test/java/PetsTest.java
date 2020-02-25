import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetsTest {

    Pets pet = new Pets("black");
    Pets pet1 = pet;
    Pets pet2 = new Pets("red");


    @Test
    public void getColor() { // object Equality test
        assertEquals(pet.getColor(), pet1.getColor());
    }

    @Test
    public void testGetAge() {//Object Identity test


        if( pet == pet){//true
        }
        if (pet == pet){//true
        }
        if (pet == pet2){//false
        }


    }

    @Test
    public void testFail() {//fail test

        assertEquals(pet.getColor(), pet2.getColor());

    }

    @Test(timeout = 124)
    public void timeOutTest(){


    }

    @Ignore("method not ready")
    @Test
    public void testMethod(){

        System.out.println("Method not breached");
    }

}