import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentTest {

    @Test
    public void generateOrderID_Test() {
        String expected = "00000";
        Integer.toString(Order.orderID);
        assertEquals(Order.orderID, expected);
    }
}