import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class KindergartenGarden {

    private String garden;
    private String[] students = {"Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"};

    KindergartenGarden(String garden, String[] students) {
        this.garden = garden;
        this.students = students;
    }

    KindergartenGarden(String garden) {
        this.garden = garden;
    }

    List<Plant> getPlantsOfStudent(String student) {
        List<String> names = new ArrayList<>(Arrays.asList(students));
        Collections.sort(names);
        List<Plant> plantList = new ArrayList<>();
        String[] row = garden.split("\n");
        int index = names.indexOf(student);

        for (String r : row) {
            plantList.add(Plant.getPlant(r.charAt(index * 2)));
            plantList.add(Plant.getPlant(r.charAt(index * 2 + 1)));
        }
        return plantList;
    }

}
