public abstract class Person {

    private int id;
    private String name;

    protected Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bilgiYazdir() {
        System.out.println("ID: " + id);
        System.out.println("İsim: " + name);
    }
}
