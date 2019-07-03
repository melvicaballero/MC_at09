package org.gradle;

import org.apache.commons.collections.list.GrowthList;

/**
 * Person class, with name as atribute.
 */
public class Person {
    private final String name;

    /**
     * Method name constructor of the class.
     * @param name person name.
     */
    public Person(final String name) {
        this.name = name;
        new GrowthList();
    }

    /**
     * Method getName,  get the person name.
     * @return person name.
     */
    public String getName() {
        return name;
    }
}
