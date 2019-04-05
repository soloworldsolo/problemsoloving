import com.solo.Primenumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PrimenumberTest {
    Primenumber pnumber ;

    @BeforeEach
    public void init() {
        pnumber = new Primenumber ();
    }
    @Test
    public void initCheck() {
        boolean expectedresult = pnumber.isPrime (29);
        Assertions.assertEquals (expectedresult,true);
    }

    @Test
    public void initCheckfifteen() {
        boolean expectedresult = pnumber.isPrime (15);
        Assertions.assertEquals (expectedresult,false);
    }


}
