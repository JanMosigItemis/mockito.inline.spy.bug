package de.itemis.mosig.mockito.inline.spy.bug;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Method;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test_something() throws Exception {
        Method realMethod = getClass().getMethod("some_method");
        Method spyMethod = Mockito.spy(realMethod);
        spyMethod.invoke(this);
    }

    public void some_method() {

    }
}
