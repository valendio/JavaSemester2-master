package librarySys;

import java.util.List;

class librarian {
    String libname, libpass;

    public String getLibname() {return "sss";}
    public String getLibpass() {return "123";}

    public void getlibdisplayinfo(){
        Iterable<String> libdisplayinfox = List.of("===Personal info===", "Name : mike wazowski",
                "Addres : Pluto", "Phone : 08888888888");
        for (var showlibdisplayinfo : libdisplayinfox) {
            System.out.println(showlibdisplayinfo);
        }
    }
    public void getlibdisplaymainmenu(){
        Iterable<String> libdisplaymainmenu = List.of("\n===MAIN MENU===\n","1. Check Status",
                "2. Check Stock", "3. Check Student data", "\n===Choose menu===\n"  );
        for (var showlibdisplayinfo : libdisplaymainmenu) {
            System.out.println(showlibdisplayinfo);
        }
    }
}
