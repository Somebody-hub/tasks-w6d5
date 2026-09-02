package model;

public class Developer extends Employee{
    private String programLang;

    public Developer(int id, String name, double salary, String programLang) {
        super(id, name, salary);
        this.programLang = programLang;
    }

    public String getProgramLang() {
        return programLang;
    }

    public void setProgramLang(String programLang) {
        this.programLang = programLang;
    }
}
