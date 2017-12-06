import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {


    Card card1;
    Card card2;


    @Before
    public void before(){
        card1 = new Card(SuitType.HEARTS, ValueType.SEVEN);
        card2 = new Card(SuitType.DIAMONDS, ValueType.TWO);
    }


    @Test
    public void canGetSuit{
        assertEquals(SuitType.HEARTS, card1.SuitType());
    }


}
