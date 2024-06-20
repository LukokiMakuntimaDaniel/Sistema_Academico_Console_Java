package Model;

import java.sql.Timestamp;

public class Enrollments {
   private int id_enrollment;
    private int id_class;
    private int  id_university;
    private int  id_registration;
    private int  id_course;
    private String academic_degree;
    private Timestamp date_enrollment;

    public int getId_enrollment() {
        return id_enrollment;
    }

    public void setId_enrollment(int id_enrollment) {
        this.id_enrollment = id_enrollment;
    }

    public int getId_class() {
        return id_class;
    }

    public void setId_class(int id_class) {
        this.id_class = id_class;
    }

    public int getId_university() {
        return id_university;
    }

    public void setId_university(int id_university) {
        this.id_university = id_university;
    }

    public int getId_registration() {
        return id_registration;
    }

    public void setId_registration(int id_registration) {
        this.id_registration = id_registration;
    }

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public String getAcademic_degree() {
        return academic_degree;
    }

    public void setAcademic_degree(String academic_degree) {
        this.academic_degree = academic_degree;
    }

    public Timestamp getDate_enrollment() {
        return date_enrollment;
    }

    public void setDate_enrollment(Timestamp date_enrollment) {
        this.date_enrollment = date_enrollment;
    }
}
