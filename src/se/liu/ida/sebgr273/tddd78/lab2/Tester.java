package se.liu.ida.sebgr273.tddd78.lab2;

import java.time.LocalDate;

/**
 * Created by Sebastian on 2016-01-21.
 */
public class Tester {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new Queue();

        Person one = new Person("one", LocalDate.of(2015, 06, 30));
        Person two = new Person("two", LocalDate.of(2013, 04, 06));
        Person three = new Person("three", LocalDate.of(1996, 12, 13));
        Person four = new Person("four", LocalDate.of(2005, 07, 25));
        Person five = new Person("five", LocalDate.of(725, 12, 13));

        stack.push(one);
        stack.push(two);
        stack.push(three);
        stack.push(four);
        stack.push(five);

        while(!stack.isEmpty()){
            System.out.println("From the stack: " + stack.pop() + "\n");
        }
        queue.enqueue(one);
        queue.enqueue(two);
        queue.enqueue(three);
        queue.enqueue(four);
        queue.enqueue(five);

        while (!queue.isEmpty()){
            System.out.println("From the queue: " + queue.dequeue()
            + "\n");
        }
    }
}
