package se.liu.ida.sebgr273.tddd78.lab2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sebastian on 2016-01-21.
 */
public class Stack {
    private List<Person> elements = new ArrayList<Person>();

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public boolean contains(Object o) {
        return elements.contains(o);
    }

    public void clear() {
        elements.clear();
    }

    public void push(Person person) {
        elements.add(0, person);
    }

    public Person pop(){
        Person person = elements.get(0);
        elements.remove(0);
        return person;
    }
}
