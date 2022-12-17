import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class TestCalculator {


    Calculator c = null;

    //Making fake object of service class using mockito
    CalculatorService service = Mockito.mock(CalculatorService.class);

    //@Before annotation is used when different test cases share the same logic. The method with the
    // @Before annotation always runs before the execution of each test case
    @Before
    public void setUp() {
        c = new Calculator(service);
    }
    //here we are checking when we give 2,3 to method add of service class then it should return 5 by using
    //when and then return of mockito and verify it we are using fake object of service class or not using
    //verify method of mockito

    @Test
    public void testPerform() {
        when(service.add(2, 3)).thenReturn(5);
        Assert.assertEquals(10, c.perform(2, 3));
        verify(service).add(2, 3);
    }
}
