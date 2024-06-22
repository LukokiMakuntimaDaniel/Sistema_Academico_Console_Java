package Services;

import Controlers.CourseController;
import Model.Editions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EditionService {
    private ConnectionBD dataConection = new ConnectionBD();
    private String sqlStatement;
    private ResultSet resultSet;

    public List<Editions> index(){
        try {
            List<Editions> editions = new ArrayList<>();
            sqlStatement = "select * from Editions";
            resultSet = dataConection.sqlResult(sqlStatement);
            while(resultSet.next()){
                Editions edition = new Editions();
                edition.setIdEdition(resultSet.getInt("idEdition"));
                edition.setDescription(resultSet.getString("description"));
                edition.setName(resultSet.getString("name"));
                edition.setStartDate(resultSet.getDate("startDate"));
                edition.setEndDate(resultSet.getDate("endDate"));
                editions.add(edition);
            }
            return editions;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean store(Editions course){

        return true;
    }

    public boolean update(Editions course){


        return false;
    }

    public boolean remove(int id){


        return false;
    }

    public CourseController show(int id){


        return null;
    }
}
