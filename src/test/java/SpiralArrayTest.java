import com.solo.projectsoloving.spiralarray.com.solo.projectsoloving.matrixrotate.Matrixroration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;


public class SpiralArrayTest {

    private Matrixroration matrixobj = new Matrixroration();


    @Test
    public void nullcheck() {
        Assertions.assertThrows(NullPointerException.class,() -> {matrixobj.rotate(null);});
    }


    @Test
    public void twobytwolArraycheck() {
        int[][] twotwo = {{1,2},{3,4}};

        int[][] expected = {{3,1},{4,2}};

        Assertions.assertArrayEquals(matrixobj.rotate(twotwo),expected);
    }


    @Test
    public void threebythreelArraycheck() {
        int[][] twotwo = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] expected = {{4,1,2},{7,5,3},{8,9,4}};

        Assertions.assertArrayEquals(matrixobj.rotate(twotwo),expected);
    }

}
