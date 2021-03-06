import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


public class CollectionUtilsTest {


    @Test
    public void assertThatCollectionContainsNullReference() throws Exception {

        List<String> nullReferencesCollection = new ArrayList<>();
        nullReferencesCollection.add(null);
        nullReferencesCollection.add(null);

        assertTrue(nullReferencesCollection.contains(null));
    }

    @Test
    public void assertThatNewReferenceRefersToNullValueFromCollection() throws Exception {

        List<String> nullReferencesCollection = new ArrayList<>();
        nullReferencesCollection.add(null);
        final String nullReference = nullReferencesCollection.get(0);

        assertNull(nullReference);
    }
}
