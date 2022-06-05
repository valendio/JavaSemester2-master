package library;
import java.io.*;
import java.util.Scanner;

public class main {
    static String fileName = null;
    static library lib = new library();
    static Scanner input = new Scanner(System.in);
    static boolean run = true;
    static String username;
    static String password;
    static data database = new data();

    public static void main(String[] args) {

        System.out.println("<=====Login=====>");
        System.out.print("username: ");
        username = input.next();

        System.out.print("password: ");
        password = input.next();
        if (username.equals("std") && password.equals("123")){
            System.out.println("You are logged in as student");
        database.stdinfo();}
        else if (username.equals("lib") && password.equals("123")) {
            System.out.println("You are logged in as librarian");
            database.libinfo();
        }
        while (run) {
            System.out.println("\n0. load data. "
                              +"\n1. Save and quit "
                              +"\n2. Show book list "
                              +"\n3. Add book to library");
            System.out.print("Pick Menu : ");
            int answer = input.nextInt();
            switch (answer) {
                case 0 -> {
                    System.out.print("Enter file name to load : ");
                    loadScript(input.next());
                }
                case 1 -> saveAndQuit();
                case 2 -> System.out.println(lib.toString());
                case 3 -> addBook();
            }
        }
        System.exit(0);
    }

    private static void addBook() {
         int isbn;
         String title, author;
         double price;

        System.out.print("\nEnter Title : " );
        title = input.next();
        System.out.print("\nEnter Author : " );
        author = input.next();
        System.out.print("\nEnter ISBN : " );
        isbn = input.nextInt();
        System.out.print("\nEnter Price : " );
        price = input.nextDouble();

        book b = new book(isbn, title, author, price);
        lib.addBook(b);
    }
    private static void saveAndQuit() {
        System.out.print("Enter filename : ");
        fileName = input.next() +".ser";
        run = false;
        FileOutputStream fos = null;
        ObjectOutput out = null;
        try {
            fos = new FileOutputStream(fileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(lib);
            fos.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void loadScript(String name) {
        FileInputStream fis = null;
        ObjectInputStream input = null;
        File file = new File(name +".ser");
        if (file.exists()) {
            try {
                fis = new FileInputStream(file);
                input = new ObjectInputStream(fis);
                lib = (library) input.readObject();
                fis.close();
                input.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace(); }
        }else{
            System.out.println("\nFile not found");
        }   }   }
