import com.solo.alimetrik.SumOfNaturalNumbers;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SumofdivisorsTest {

    SumOfNaturalNumbers sum = new SumOfNaturalNumbers ();



    @Test
    public void initTest2() {
        int result = sum.ComputeSum (10);
        Assertions.assertEquals (result,8);
    }


    @Test
    public void initTest3() {
        int result = sum.ComputeSum (36);
        Assertions.assertEquals (result,55);
    }

    @Test
    public void primenumber() {
        int result = sum.ComputeSum (11);
        Assertions.assertEquals (result,1);
    }

}



