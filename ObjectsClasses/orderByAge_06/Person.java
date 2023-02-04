package orderByAge_06;

public class Person {
    // name, id, age
    private String name;
    private String id;
    private int age;

    public Person(String name, String id, int age) {

        this.name = name;
        this.id = id;
        this.age = age;

    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }

}
