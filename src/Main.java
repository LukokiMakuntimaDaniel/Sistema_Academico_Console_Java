import Services.EditionService;

public class Main {
    public static void main(String[] args) {
        EditionService editionService = new EditionService();
        System.out.println(editionService.index().get(0).getName());

    }
}