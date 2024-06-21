package Model;

public class Modules {
    private int id_module;
    private int id_course;
    private String name_module;
    private String abreviation;
    private int duration;

    public int getId_module() {
        return id_module;
    }

    public void setId_module(int id_module) {
        this.id_module = id_module;
    }

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public String getName_module() {
        return name_module;
    }

    public void setName_module(String name_module) {
        this.name_module = name_module;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
