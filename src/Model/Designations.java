package Model;

public class Designations {
    public int id_designation;
    public String name_designation;
    public String abbreviation;
    public int id_module;

    public int getId_designation() {
        return id_designation;
    }

    public void setId_designation(int id_designation) {
        this.id_designation = id_designation;
    }

    public String getName_designation() {
        return name_designation;
    }

    public void setName_designation(String name_designation) {
        this.name_designation = name_designation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public int getId_module() {
        return id_module;
    }

    public void setId_module(int id_module) {
        this.id_module = id_module;
    }
}
