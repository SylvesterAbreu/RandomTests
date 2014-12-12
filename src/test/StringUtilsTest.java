import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringUtilsTest {

    @Test
    public void assertThatStringUtilsContainsEqualInNull_isFalse() throws Exception {
        assertThat(StringUtils.contains(null, "="), is(false));
    }
}
