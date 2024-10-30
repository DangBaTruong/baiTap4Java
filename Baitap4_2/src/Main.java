import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Truong", "Hue", "Vku", 2006, 9500000);
        System.out.println(student);

        Staff staff = new Staff("Truong", "Hue", "VKU", 450.123);
        System.out.println(staff);
    }
}