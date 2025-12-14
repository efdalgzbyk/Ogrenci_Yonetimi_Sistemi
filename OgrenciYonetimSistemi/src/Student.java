import NotHesaplama.NotHesaplama;

public class Student extends Person implements NotHesaplama {

    private String department;
    private int grade;

    public Student(int id, String name, String department, int grade) {
        super(id, name);
        this.department = department;
        this.grade = grade;
    }

    @Override
    public void bilgiYazdir() {
        super.bilgiYazdir();
        System.out.println("Bölüm: " + department);
        System.out.println("Not: " + grade);
        System.out.println("Durum: " + durumHesapla());
    }

    @Override
    public String durumHesapla() {
        if (grade >= 60) {
            return "Geçti";
        } else {
            return "Kaldı";
        }
    }
}
