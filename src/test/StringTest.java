package test;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class StringTest {

    @Test(expected = NullPointerException.class)
    public void whenCallingContainsMethodOnNullStringReferenceThrowsNpe() throws Exception {
        final String string = null;

        string.contains("=");
    }
}
