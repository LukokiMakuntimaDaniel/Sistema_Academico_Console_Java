package Model;

public class Trainers {
    private int id_trainer;
    private int id_user;
    private int trainer_number;
    private int institution_inserted;

    public int getId_trainer() {
        return id_trainer;
    }

    public void setId_trainer(int id_trainer) {
        this.id_trainer = id_trainer;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getTrainer_number() {
        return trainer_number;
    }

    public void setTrainer_number(int trainer_number) {
        this.trainer_number = trainer_number;
    }

    public int getInstitution_inserted() {
        return institution_inserted;
    }

    public void setInstitution_inserted(int institution_inserted) {
        this.institution_inserted = institution_inserted;
    }
}
