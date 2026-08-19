package track.class_Practice;

import java.util.Scanner;

public class CreateBookDetails {
    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String title = sc.nextLine();
            String author = sc.nextLine();

            Book b = new Book(title, author);

            b.display();
        }
    }
}

