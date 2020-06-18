public class Human {

    String sex;
    int age;
    int weightl;
    int height;
    String name;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return this.sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setWeightl(int weightl) {
        this.weightl = weightl;
    }

    public int getWeightl() {
        return this.weightl;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void working() {
        System.out.println(name + " is working hard ");
    }

    public void joging() {
        System.out.println(name + "is running ");
    }
}
