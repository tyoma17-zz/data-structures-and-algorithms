package com.tyoma17.data_structures.list.linked_list;

import com.tyoma17.data_structures.list.Person;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class LinkedListClient {

    public static void main(String[] args) {

        Person johnDoe = new Person(1, "John", "Doe");
        Person richardRoe = new Person(2, "Richard", "Roe");
        Person janeDoe = new Person(3, "Jane", "Roe");

        LinkedList<Person> persons = new LinkedList<>();
        persons.logList();
        persons.addToFront(johnDoe);
        persons.logList();
        persons.addToFront(richardRoe);
        persons.logList();
        persons.addToFront(janeDoe);

        log.info("Linked list is{}empty", persons.isEmpty() ? " " : " not ");
        log.info("Linked list contains of {} persons:", persons.getSize());
        persons.logList();

        log.info("Removing one person from the list...");
        persons.removeFromFont();
        log.info("Linked list contains of {} persons:", persons.getSize());
        persons.logList();
    }
}