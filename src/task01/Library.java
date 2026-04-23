package task01;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Kütüphane boş.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public void addBook(String name, String author) {
        books.add(new Book(name, author));
        System.out.println("Kitap eklendi.");
    }

    public void removeBook(String name) {
        for (Book b : books) {
            if (b.getName().equalsIgnoreCase(name)) {
                books.remove(b);
                System.out.println("Kitap silindi.");
                return;
            }
        }
        System.out.println("Kitap bulunamadı.");
    }
}
