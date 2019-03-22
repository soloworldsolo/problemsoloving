import com.solo.multiplication.Matrixmultiplication;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

public class MatrixmultiplicationTest {
    Matrixmultiplication matrixmultiplication= new Matrixmultiplication ();

//    @Test
//    public void twoByTwoCheckingnonsquare() {
//        int[][] input1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int[][] input2 = {{7, 8}, {9, 10}, {11, 12}};
//        int[][] expected = {{58, 64},
//                {139, 154}};
//        var result = matrixmultiplication.multiply (input1, input2);
//
//        Assertions.assertArrayEquals (expected, result);
//    }

    @Test
    public void twoByTwoCheckingsquare() {
        int[][] input1 = {{1,2,3},
                {3,2,1},{2,1,3}};
        int[][] input2 = {{1,4,6},{6,4,1},{4,6,1}};
        int[][] expected = {{25,30,11},
                {19,26,21},{20,30,16}};
        var result = matrixmultiplication.multiply (input1,input2);

        Assertions.assertArrayEquals (expected,result);

    }


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

}
