import org.junit.Test;


public class StringTest {

    @Test(expected = NullPointerException.class)
    public void whenCallingContainsMethodOnNullStringReferenceThrowsNpe() throws Exception {
        final String string = null;

        string.contains("=");
    }

}