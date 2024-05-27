package java3;

public class Person {
    private String name;
    private String schoolName = "bingham University";
    private String password;
    private String matric;
    int staffNo = 08101668061;

    String getName(){
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    void setPassword(String password){
        this.password = password;
    }

    Person(String schoolName, String name, String password, String matric){
        this.name = name;
        this.matric = matric;
        this.schoolName = schoolName;
        this.password = password;
    }
    Person(String schoolName, String name, String password, int staffNo){
        this.name = name;
        this.staffNo = staffNo;
        this.schoolName = schoolName;
        this.password = password;
    }

}
