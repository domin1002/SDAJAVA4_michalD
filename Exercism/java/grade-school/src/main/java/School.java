import java.util.*;

public class School {

    private Map<Integer, List<String>> map;

    public School() {
        this.map = new HashMap<>();
    }

    public int numberOfStudents() {
        return map.size();
    }


    public void add(String student, Integer grade) {
        List<String> students;
        if (map.containsKey(grade))
            students = map.get(grade);
        else
            students = new ArrayList<>();
        students.add(student);
        map.put(grade, students);
    }

    public List<String> grade(int grade) {
        List<String> students = new ArrayList<>();
        if (map.containsKey(grade))
            students = map.get(grade);
        return students;
    }

    public Map<Integer, List<String>> studentsByGradeAlphabetical() {
        map.keySet().stream().forEach(key -> Collections.sort(map.get(key)));
        return map;
    }
}
