package collection.BDD_maps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import java.util.List;
import java.util.Map;

public class MapTest {
    @Given("^Se folosesc liste de map$")
    public void seFolosescListeDeMap(DataTable table) {
        List<Map<String, String>> detaliiPersoane = table.asMaps(String.class, String.class);
        System.out.println("\nListe de map\n");
        System.out.println(detaliiPersoane);
        for (int i = 0; i < detaliiPersoane.size(); i++) {
            for (Map.Entry<String, String> entry : detaliiPersoane.get(i).entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
            System.out.println();
        }
    }

    @And("^Se foloseste map$")
    public void seFolosesteMap(DataTable table) {
        System.out.println();
        System.out.println("\nMap simplu\n");
        Map<String, String> prenumePersoane = table.asMap(String.class, String.class);
        for (Map.Entry<String, String> entry : prenumePersoane.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
