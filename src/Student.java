import java.util.Comparator;

public class Student {
    private static final Comparator<Student> BY_NAME = new ByName();
    private static final Comparator<Student> BY_SECTION = new BySection();

    private String name;
    private int section;
    public static class ByName implements Comparator<Student>{
        public int compare(Student v, Student w){
            return v.name.compareTo(w.name);
        }
    }

    public static class BySection implements Comparator<Student>{
        public int compare(Student v, Student w){
            return v.section - w.section;
        }
    }
}
