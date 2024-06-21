package Model;

public class Studants extends Users {
    private int id_studant;
    private int id_user;
    private int student_number;

    public int getId_studant() {
        return id_studant;
    }

    public void setId_studant(int id_studant) {
        this.id_studant = id_studant;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getStudent_number() {
        return student_number;
    }

    public void setStudent_number(int student_number) {
        this.student_number = student_number;
    }
}
