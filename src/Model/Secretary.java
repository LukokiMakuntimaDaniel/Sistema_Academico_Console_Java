package Model;

public class Secretary extends Users {
    private int id_secretary;
    private int id_user;
    private int number_secretary;
    private String course_taken;

    public int getId_secretary() {
        return id_secretary;
    }

    public void setId_secretary(int id_secretary) {
        this.id_secretary = id_secretary;
    }

    public String getCourse_taken() {
        return course_taken;
    }

    public void setCourse_taken(String course_taken) {
        this.course_taken = course_taken;
    }

    public int getNumber_secretary() {
        return number_secretary;
    }

    public void setNumber_secretary(int number_secretary) {
        this.number_secretary = number_secretary;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

}
