package Model;

import java.sql.Timestamp;

public class Mini_Staves {
    private int id_mini_stave;
    private int id_studant;
    private int id_trainer;
    private int id_module;
    private int id_designation;
    private String note;
    private String descrition;
    private String signature;
    private Timestamp date_stave;

    public int getId_mini_stave() {
        return id_mini_stave;
    }

    public void setId_mini_stave(int id_mini_stave) {
        this.id_mini_stave = id_mini_stave;
    }

    public int getId_studant() {
        return id_studant;
    }

    public void setId_studant(int id_studant) {
        this.id_studant = id_studant;
    }

    public int getId_module() {
        return id_module;
    }

    public void setId_module(int id_module) {
        this.id_module = id_module;
    }

    public int getId_trainer() {
        return id_trainer;
    }

    public void setId_trainer(int id_trainer) {
        this.id_trainer = id_trainer;
    }

    public int getId_designation() {
        return id_designation;
    }

    public void setId_designation(int id_designation) {
        this.id_designation = id_designation;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Timestamp getDate_stave() {
        return date_stave;
    }

    public void setDate_stave(Timestamp date_stave) {
        this.date_stave = date_stave;
    }
}
