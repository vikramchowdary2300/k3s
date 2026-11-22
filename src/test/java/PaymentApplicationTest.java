import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentApplicationTest {

    @Test
    void testPayment() {
        PaymentApplication app = new PaymentApplication();

        assertEquals(500, app.addPayment(500));
    }
}