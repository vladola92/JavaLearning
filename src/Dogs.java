public class Dogs {

    // Astea sunt atribute

    private String collor;
    private int age;
    private float weight;
    private String rasa;
    private String name;

    // Comportament , Metode


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public String getCollor() {
        return this.collor;
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

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getRasa() {
        return this.rasa;
    }
    public void running() {
        System.out.println("the dog is running");
    }

    public void eating() {
        System.out.println("The Dog is eating pedigree");
    }
}
