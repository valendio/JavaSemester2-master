package librarySys;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class main extends Library {
    static Scanner input = new Scanner(System.in);
    public static void main (String[] args) {

        librarySys.student stddata = new student();
        librarySys.librarian libdata = new librarian();
        bookdata bookinfodata = new bookdata("book");

        bookinfodata.addbook("1. Math");
        bookinfodata.addbook("2. Science");
        bookinfodata.addbook("3. History");

        System.out.print("Login sebagai : ");
        String logas = input.next();

        String username;
        String password;
        if (logas.equals("std")) {
            System.out.print("Enter Username : ");
            username = input.next();
            System.out.print("Enter Password : ");
            password = input.next();

            if (username.equals(stddata.getStdname()) && password.equals(stddata.getStdpass())) {
                System.out.println("Access Granted! Welcome Student! Happy Reading!");
                stddata.stdinfo();
                stddata.stdmainmenu();
                System.out.print("\n===PICK MENU===\n");
                String pickmenu = input.next();
                if (pickmenu.equals("1")){
                    bookinfodata.showbook();
                }else if (pickmenu.equals("2")){

                }else if (pickmenu.equals("3")){

                }


            } else if (username.equals(stddata.getStdname())) {
                System.out.println("Invalid Password!");
            } else if (password.equals(stddata.getStdpass())) {
                System.out.println("Invalid Username!");
            } else {System.out.println("Invalid Username & Password!");}

        } else if (logas.equals("lib")) {
            System.out.print("Enter Username : ");
            username = input.next();
            System.out.print("Enter Password : ");
            password = input.next();

            if (username.equals(libdata.getLibname()) && password.equals(libdata.getLibpass())) {
                System.out.print("Access Granted! Welcome Librarian!");
                libdata.getlibdisplayinfo();
                libdata.getlibdisplaymainmenu();
            } else if (username.equals(libdata.getLibname())) {
                System.out.println("Invalid Password!");
            } else if (password.equals(libdata.getLibpass())) {
                System.out.println("Invalid Username!");
            } else {
                System.out.println("Invalid Username & Password!");
            }
        }
        else {
            System.out.println("INVALID INPUT ID! TRY AGAIN");
        }
    }
}



