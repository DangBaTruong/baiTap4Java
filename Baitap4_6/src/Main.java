public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Thai Thinh");
        System.out.println(animal);

        Mammal mammal = new Mammal("Van Thoi");
        System.out.println(mammal);

        Cat cat = new Cat("Van Thoi");
        System.out.println(cat);

        Dog dog = new Dog("Thai Thinh");
        System.out.println(dog);

        cat.greets();
        dog.greets();
        dog.greets();
    }
}