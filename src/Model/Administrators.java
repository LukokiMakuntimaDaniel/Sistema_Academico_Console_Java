package Model;

public class Administrators extends Users {
    private int id_admin;
    private int id_user;
    private int number_admin;

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getNumber_admin() {
        return number_admin;
    }

    public void setNumber_admin(int number_admin) {
        this.number_admin = number_admin;
    }
}
