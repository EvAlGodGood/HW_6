import java.util.Random;

public class Cat extends Animal{
    private int maxDistRun;
    public static int countCat=0;
    Random rand =new Random();

    public Cat(String name){
        this.name=name;
        countCat++;
        maxDistRun=rand.nextInt(200)+rand.nextInt(200);
    }
    @Override
    public void run(int dist){
        if (dist<=maxDistRun){
            System.out.println(name+ " бежит " + dist + " метров.");
        }else{
            System.out.println(name+ " бежит " + maxDistRun + " метров, и больше не может.");
        }
    }
    @Override
    public void swim(int dist){
        System.out.println(name+ " не может плавать ¯\\_(ツ)_/¯.");
    }
}