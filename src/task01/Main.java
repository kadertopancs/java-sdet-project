package task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n--- KÜTÜPHANE SİSTEMİ ---");
            System.out.println("1. Kitapları Listele");
            System.out.println("2. Kitap Ekle");
            System.out.println("3. Kitap Sil");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");

            int choice = sc.nextInt();
            sc.nextLine(); // buffer temizleme

            switch (choice) {
                case 1:
                    library.listBooks();
                    break;

                case 2:
                    System.out.print("Kitap adı: ");
                    String name = sc.nextLine();
                    System.out.print("Yazar adı: ");
                    String author = sc.nextLine();
                    library.addBook(name, author);
                    break;

                case 3:
                    System.out.print("Silinecek kitap adı: ");
                    String removeName = sc.nextLine();
                    library.removeBook(removeName);
                    break;

                case 4:
                    System.out.println("Programdan çıkılıyor...");
                    return;

                default:
                    System.out.println("Geçersiz seçim.");
            }
        }
    }
}
