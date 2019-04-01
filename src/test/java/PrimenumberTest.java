import com.solo.Primenumber;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PrimenumberTest {
    Primenumber pnumber = new Primenumber ();
    @Test
    public void initCheck() {
        boolean expectedresult = pnumber.isPrime (7);
        Assertions.assertEquals (expectedresult,true);
    }

    @Test
    public void initCheckfifteen() {
        boolean expectedresult = pnumber.isPrime (15);
        Assertions.assertEquals (expectedresult,false);
    }
}
