public class Cat {
    private String name;
    private int age;
    private String breed;
    private boolean isMale;

    public Cat() {
    }


    public Cat(String name, int age, String breed, boolean isMale) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.isMale = isMale;
    }

    public Cat(String murzik) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
