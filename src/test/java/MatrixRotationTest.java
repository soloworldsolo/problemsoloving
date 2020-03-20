import com.solo.projectsoloving.matrixrotate.Matrixroration;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class MatrixRotationTest {

  private Matrixroration matrixobj;

  @BeforeEach
  public void init() {
    matrixobj = new Matrixroration();
  }


  @Test
  public void twobytwolArraycheck() {
    int[][] twotwo = {{1, 2}, {3, 4}};

    int[][] expected = {{3, 1}, {4, 2}};

    Assertions.assertArrayEquals(matrixobj.rotate(twotwo), expected);
    System.out.println("completed");
    Map<String, String> hi = new HashMap<>();
  }


  @Test
  @Tag("soloworld")
  public void threebythreelArraycheck() {
    int[][] twotwo = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    int[][] expected = {{4, 1, 2}, {7, 5, 3}, {8, 9, 6}};

    Assertions.assertArrayEquals(matrixobj.rotate(twotwo), expected);
  }

  @Test
  @Tag("soloworld")
  public void fourbyfourlArraycheck() {
    int[][] twotwo = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    int[][] expected = {{5, 1, 2, 3}, {9, 10, 6, 4}, {13, 11, 7, 8}, {14, 15, 16, 12}};

    Assertions.assertArrayEquals(matrixobj.rotate(twotwo), expected);
  }

}
