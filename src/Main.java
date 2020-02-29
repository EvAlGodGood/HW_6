public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Кузя");
        Dog dog1 = new Dog("Шарик");
        Cat cat2 = new Cat("Мурзя");

        cat1.run(180);
        dog1.run(550);
        cat1.swim(120);
        dog1.swim(20);
        cat2.run(300);
        cat2.swim(2);

        System.out.println("Котов было " + Cat.countCat + " Собак " + Dog.countDog);

    }
}