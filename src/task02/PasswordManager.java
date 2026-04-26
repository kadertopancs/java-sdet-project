package task02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, String>> passwordStore = new HashMap<>();

        while (true) {
            System.out.println("\n--- Sifre Yoneticisi Uygulamasi ---");
            System.out.println("1- Sifre Ekle");
            System.out.println("2- Sifre Goster");
            System.out.println("3- Cikis");
            System.out.print("Seciminizi yapin: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Hesap adi girin: ");
                    String accountName = scanner.nextLine().toLowerCase();

                    System.out.print("Kullanici adi girin: ");
                    String userName = scanner.nextLine().toLowerCase();

                    System.out.print("Sifre girin: ");
                    String password = scanner.nextLine().toLowerCase();

                    Map<String, String> userInfo = new HashMap<>();
                    userInfo.put("username", userName);
                    userInfo.put("password", password);

                    passwordStore.put(accountName, userInfo);

                    System.out.println("Kayit eklendi.");
                    break;

                case 2:
                    System.out.print("Hesap adi girin: ");
                    String search = scanner.nextLine().toLowerCase();

                    if (passwordStore.containsKey(search)) {
                        Map<String, String> data = passwordStore.get(search);
                        System.out.println("Username: " + data.get("username"));
                        System.out.println("Password: " + data.get("password"));
                    } else {
                        System.out.println("Kayit yok.");
                    }
                    break;

                case 3:
                    System.out.println("Cikis yapildi.");
                    return;

                default:
                    System.out.println("Gecersiz secim.");
            }
        }
    }
}
