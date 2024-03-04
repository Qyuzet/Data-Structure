public class Xcercise {
    public static void main(String[] args) {

        Animal myLion = new Lion("Simba", 5);
        System.out.println("Name: " + myLion.getName());
        System.out.println("Age: " + myLion.getAge());
        myLion.makeSound();  // This will call the overridden method in Lion class

    }

}


class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}