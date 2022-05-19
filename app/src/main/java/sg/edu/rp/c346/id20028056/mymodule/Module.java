package sg.edu.rp.c346.id20028056.mymodule;

public class Module {
    String code;
    String name;
    int year;
    int sem;
    int credit;
    String venue;

    Module(String code,String name, int year, int sem, int credit, String venue){
        this.code=code;
        this.name=name;
        this.year=year;
        this.sem=sem;
        this.credit=credit;
        this.venue=venue;
    }
    String display(){
        String description=String.format("Module Code: %s \n\nModule Name: \n%s\n\nAcademic Year: %d" +
                "\n\nSemester: %d \n\nModule Credit: %d\n\nVenue: %s",code,name,year,sem,credit,venue);
        return description;
    }
}

