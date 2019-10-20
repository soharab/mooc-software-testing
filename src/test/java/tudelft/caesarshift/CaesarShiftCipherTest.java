package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "input={0},shift={1},result={2}")
    @CsvSource({"abc,3,def","xyz,3,abc","abc,-3,xyz","abc,0,abc"})
    public void positiveshift(String message,int shift,String expectedres)
    {
        CaesarShiftCipher testObj= new CaesarShiftCipher();
        String result=testObj.CaesarShiftCipher(message,shift);
        Assertions.assertEquals(expectedres,result);
    }

}
