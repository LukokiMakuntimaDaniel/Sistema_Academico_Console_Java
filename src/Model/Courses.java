package Model;

public class Courses {
    private int id_course;
    private String name_course;
    private int id_faculty;
    private int qtd_module;

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public String getName_course() {
        return name_course;
    }

    public void setName_course(String name_course) {
        this.name_course = name_course;
    }

    public int getId_faculty() {
        return id_faculty;
    }

    public void setId_faculty(int id_faculty) {
        this.id_faculty = id_faculty;
    }

    public int getQtd_module() {
        return qtd_module;
    }

    public void setQtd_module(int qtd_module) {
        this.qtd_module = qtd_module;
    }
}
