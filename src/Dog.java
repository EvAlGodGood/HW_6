import java.util.Random;

public class Dog extends Animal{
    private int maxDistRun;
    private int maxDistSwim;
    public static int countDog=0;
    Random rand =new Random();

    public Dog(String name){
        this.name=name;
        maxDistRun=rand.nextInt(500)+rand.nextInt(500);
        maxDistSwim=rand.nextInt(10)+rand.nextInt(10);
        countDog++;
    }

    @Override
    public void run(int dist){
        if (dist<=maxDistRun){
            System.out.println(name+ " бежит " + dist + " метров.");
        }else {
            System.out.println(name+ " бежит " + maxDistRun + " метров, и больше не может.");
        }

    }
    @Override
    public void swim(int dist){
        if (dist<=maxDistSwim){
            System.out.println(name+ " плывет " + dist + " метров.");
        }else {
            System.out.println(name+ " плывет " + maxDistSwim + " метров, и тонет ¯\\_(ツ)_/¯.");
        }

    }
}