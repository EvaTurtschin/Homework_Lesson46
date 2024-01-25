package homework;

import java.util.Arrays;
import java.util.List;

public class Homework {
    /* Задача 1
    Написать метод, принимающий лист имен, в котором некоторые имена повторяются и печатающий имена
    из листа без печати повторений. При решении использовать Stream API

    Задача 2
    Есть класс Address с полями String street и int houseNumber и класс Person с полями String name,
    int age, Address address. Используя Stream API написать метод, принимающий лист Person
    и печатающий адреса тех, кто старше 17 лет
     */

    public static void main(String[] args) {
        //Task 1
        List<String> names = Arrays.asList("John", "Ann", "Kate", "Tomas", "Tomas", "John");
        printList(names);

        //Task 2
        Person person1 = new Person("John", 35, new Address("Street", 5));
        Person person2 = new Person("Kate", 17, new Address("Street", 9));
        Person person3 = new Person("Bill", 23, new Address("Street", 2));

        List <Person> persons = Arrays.asList(person1, person2, person3);
        printAddressOf_PersonsOver17(persons);

    }
    public static void printList (List <String> names){
        names.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public static void printAddressOf_PersonsOver17 (List <Person> persons){
        persons.stream()
                .filter(person -> person.getAge() > 17)
                .forEach(person -> System.out.println(person.getAddress().toString()));
    }
}
