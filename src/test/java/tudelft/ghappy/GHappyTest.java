package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    void happyTest()
    {
        GHappy testObj=new GHappy();
        boolean result=testObj.gHappy("xxggxx");

        Assertions.assertEquals(true,result);
    }

    @Test
    void unhappyTest()
    {
        GHappy testObj=new GHappy();
        boolean result=testObj.gHappy("xxgxx");

        Assertions.assertEquals(false,result);
    }

    @Test
    void unhappyTwo()
    {
        GHappy testObj=new GHappy();
        boolean result=testObj.gHappy("xxggyygxx");

        Assertions.assertEquals(false,result);

    }

    @Test
    void allgorilla()
    {
        GHappy testObj=new GHappy();
        boolean result=testObj.gHappy("gggggg");

        Assertions.assertEquals(true,result);
    }

    @Test
    void capitalg()
    {
        GHappy testObj=new GHappy();
        boolean result=testObj.gHappy("xxGGxx");

        Assertions.assertEquals(false,result);

    }


}

