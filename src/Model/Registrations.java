package Model;

import java.util.Date;

public class Registrations {
    private int id_registration;
    private String course_you_graduated_from;
    private int id_course_to_register;
    private int id_user;
    private int id_university;
    private String type_of_candidate;
    private String state;
    private String reasons_for_applying;
    private String reason_for_choosing_university;
    private String activity_institution;
    private String workplace;
    private String job_function;
    private String payment_method;
    private Date date_of_birth;

    public int getId_registration() {
        return id_registration;
    }

    public void setId_registration(int id_registration) {
        this.id_registration = id_registration;
    }

    public String getCourse_you_graduated_from() {
        return course_you_graduated_from;
    }

    public void setCourse_you_graduated_from(String course_you_graduated_from) {
        this.course_you_graduated_from = course_you_graduated_from;
    }

    public int getId_course_to_register() {
        return id_course_to_register;
    }

    public void setId_course_to_register(int id_course_to_register) {
        this.id_course_to_register = id_course_to_register;
    }

    public int getId_university() {
        return id_university;
    }

    public void setId_university(int id_university) {
        this.id_university = id_university;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getType_of_candidate() {
        return type_of_candidate;
    }

    public void setType_of_candidate(String type_of_candidate) {
        this.type_of_candidate = type_of_candidate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getReasons_for_applying() {
        return reasons_for_applying;
    }

    public void setReasons_for_applying(String reasons_for_applying) {
        this.reasons_for_applying = reasons_for_applying;
    }

    public String getReason_for_choosing_university() {
        return reason_for_choosing_university;
    }

    public void setReason_for_choosing_university(String reason_for_choosing_university) {
        this.reason_for_choosing_university = reason_for_choosing_university;
    }

    public String getActivity_Institution() {
        return activity_institution;
    }

    public void setActivity_institution(String activity_Institution) {
        this.activity_institution = activity_Institution;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getJob_function() {
        return job_function;
    }

    public void setJob_function(String job_function) {
        this.job_function = job_function;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
}
