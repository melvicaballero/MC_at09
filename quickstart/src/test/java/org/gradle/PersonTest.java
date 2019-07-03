package org.gradle;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Class PersonTest test for the class person.
 */
public class PersonTest {
    /**
     * Test for getName method.
     */
    @Test
        public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
}
