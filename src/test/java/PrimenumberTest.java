import com.solo.Primenumber;
import java.util.PriorityQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class PrimenumberTest {

  Primenumber pnumber;

  @BeforeEach
  public void init() {
    pnumber = new Primenumber();
  }

  @Test
  public void initCheck() {
    boolean expectedresult = pnumber.isPrime(29);
    Assertions.assertTrue(expectedresult);
  }

  @Test
  @DisplayName("really it will work")
  public void initCheckfifteen() {
    boolean expectedresult = pnumber.isPrime(15);
    Assertions.assertFalse(expectedresult);
  }


  @Test
  @DisplayName("really it will throws")
  public void initNull() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> pnumber.isPrime(-1));
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    priorityQueue.add(5);
    priorityQueue.add(6);
    priorityQueue.poll();
  }


}
