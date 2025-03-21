package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class StudentUnderProjectPredicateTest {

    @Test
    public void equals() {
        List<String> firstPredicateKeywordList = Collections.singletonList("first");
        List<String> secondPredicateKeywordList = Arrays.asList("first", "second");

        StudentUnderProjectPredicate firstPredicate = new StudentUnderProjectPredicate(firstPredicateKeywordList);
        StudentUnderProjectPredicate secondPredicate = new StudentUnderProjectPredicate(secondPredicateKeywordList);

        // same object -> returns true
        assertTrue(firstPredicate.equals(firstPredicate));

        // same value -> returns true
        StudentUnderProjectPredicate firstPredicateCopy = new StudentUnderProjectPredicate(firstPredicateKeywordList);
        assertTrue(firstPredicate.equals(firstPredicateCopy));

        // different types -> returns false;
        assertFalse(firstPredicate.equals(1));

        // null -> returns false
        assertFalse(firstPredicate.equals(null));

        // different project -> returns false
        assertFalse(firstPredicate.equals(secondPredicate));
    }
}
