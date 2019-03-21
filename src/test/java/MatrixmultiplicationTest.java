import com.solo.multiplication.Matrixmultiplication;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MatrixmultiplicationTest {
    @Mock
    Matrixmultiplication matrixmultiplication;

    @Test
    public void twoByTwoCheckingnonsquare() {
      int[][] input1 = {{1,2,3},
              {4,5,6}};
      int[][] input2 = {{7,8},{9,10},{11,12}};
      int[][] expected = {{58,64},
                           {139,154}};
      var result = matrixmultiplication.multiply (input1,input2);

        Assertions.assertArrayEquals(expected,result);

    }
    @Test
    public void twoByTwoCheckingsquare() {
        int[][] input1 = {{1,2,3},
                {4,5,6}};
        int[][] input2 = {{7,8},{9,10},{11,12}};
        int[][] expected = {{58,64},
                {139,154}};
        var result = matrixmultiplication.multiply (input1,input2);

        Assertions.assertArrayEquals (expected,result);

    }

}
