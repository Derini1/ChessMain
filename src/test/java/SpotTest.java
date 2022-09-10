import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpotTest {
    @Test
    public void validSpotTest(){
        Spot neSpot = new Spot("a", 1);
        Assertions.assertNotNull(neSpot);
        Assertions.assertEquals("a", neSpot.getX());
        Assertions.assertEquals(2, neSpot.getY());

    }

}
