import Model.Editions;
import Services.EditionService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
/*
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse("2024-06-21",dateTimeFormatter);
        LocalDate endDate = LocalDate.parse("2024-07-21",dateTimeFormatter);
*/
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = null;
        Date endDate = null;
        try {
            startDate = simpleDateFormat.parse("2024-06-21");
            endDate = simpleDateFormat.parse("2024-07-21");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println(startDate);


        EditionService editionService = new EditionService();
        Editions editions = new Editions();
        editions.setName("kova");
        editions.setDescription("muita coisa");
        editions.setStartDate(startDate);
        editions.setEndDate(endDate);
        editionService.update(2,editions);
        System.out.println(editionService.index().get(1).getName());

    }
}