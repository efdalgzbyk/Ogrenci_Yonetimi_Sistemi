import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Öğrenci listesi
        ArrayList<Student> students = new ArrayList<>();

        // Öğrenciler
        Student s1 = new Student(1, "Ali", "Bilgisayar", 75);
        Student s2 = new Student(2, "Ayşe", "Yazılım", 45);
        Student s3 = new Student(3, "Mehmet", "Elektrik", 60);

        // Listeye ekleme
        students.add(s1);
        students.add(s2);
        students.add(s3);

        // Öğrencileri yazdırma
        for (Student s : students) {
            s.bilgiYazdir();
            System.out.println("--------------------");
        }
    }
}
