import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class CollectionUtilsTest {


    @Test
    public void assertThatCollectionContainsNullReference() throws Exception {

        List<String> nullReferencesCollection = new ArrayList<>();
        nullReferencesCollection.add(null);
        nullReferencesCollection.add(null);

        assertTrue(nullReferencesCollection.contains(null));
    }
}
