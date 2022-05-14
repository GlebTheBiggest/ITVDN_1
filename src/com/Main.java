package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 2
        System.out.println("Task 2");
        System.out.print("Please, enter your sides of rectangle: ");
        Scanner scanner = new Scanner(System.in);
        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(sideA,sideB);
        System.out.println("This is area: " + rectangle.areaCalculator());
        System.out.println("This is perimeter: " + rectangle.perimeterCalculator());



        //Task 3
        System.out.println("Task 3");
        System.out.print("Please, enter a title of a book: ");
        String string = scanner.nextLine();
        Title title = new Title(string);
        System.out.print("Please, enter a name of the author of the book: ");
        string = scanner.nextLine();
        Author author = new Author(string);
        System.out.print("Please, enter a content of the book: ");
        string = scanner.nextLine();
        Content content = new Content(string);
        System.out.println("This is info of your book: ");
        System.out.println(title.showInfo());
        System.out.println(author.showInfo());
        System.out.println(content.showInfo());



        //Task 4
        System.out.println("Task 4");
        Computer[] computers = new Computer[5];
        for (int i = 0; i < 5; i++) {
            computers[i] = new Computer();
        }


        System.out.println("hefjhwbgj");
        //Task 5
        System.out.println("Task 5");
        System.out.print("Please, enter your index: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please, enter your country: ");
        String country = scanner.nextLine();
        System.out.print("Please, enter your city: ");
        String city = scanner.nextLine();
        System.out.print("Please, enter your street: ");
        String street = scanner.nextLine();
        System.out.print("Please, enter number of your house: ");
        int numberOfHouse = scanner.nextInt();
        System.out.print("Please, enter your number of your apartment: ");
        int apartment = scanner.nextInt();
        Address address = new Address(index,country,city,street,numberOfHouse,apartment);
        System.out.println(address.toString());
    }
}
