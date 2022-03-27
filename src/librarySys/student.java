package librarySys;

import java.util.List;

class student {
    String stdname, stdpass;

    public String getStdname() {return "aaa";}
    public String getStdpass() {return "123";}

    public void stdinfo(){
        Iterable<String> stddisplayinfo = List.of("\n===Personal info===\n", "Name : Oryza Valendio",
                "Addres : kediri", "Phone : 082131891268");
        for (var stddisplay : stddisplayinfo) {
            System.out.println(stddisplay);
        }
    }
    public void stdmainmenu(){
        Iterable<String> stddispalymainmenu = List.of("\n===MAIN MENU===\n", "1. Borrow book",
                "2. Status", "3. Return book\n");
        for (var stddisplay : stddispalymainmenu) {
            System.out.println(stddisplay);
        }
    }
}



