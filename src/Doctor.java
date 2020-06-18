public class Doctor {
    String name;
    int age;
    float weight;
    String sections;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setSections(String sections) {
        this.sections = sections;
    }

    public String getSections() {
        return this.sections;
    }

    public void working() {
        System.out.println("The doctor is working hard");
    }

    public void eating() {
        System.out.println("The doctor is taking the lunch break");
    }
}
