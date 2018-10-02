/**
 * Java. Level 1. Lesson 6. Homework_6
 * @author Plieva Maya
 * @version Sep 30, 2018
 */

class Homework_6 {

    public static void main(String[] args) {
        Animal[] animals = {new Dog(500, 0.5f, 10), new Cat(200, 2)};
        for (Animal animal : animals)
            System.out.println(
                animal.getClass().getName() +
                " Run result: " + animal.run(200) +
                " Jump result: " + animal.jump(1.5f) +
                " Swimming result: " + animal.swimming(5));
    }
}

class Dog extends Zoo {
    Dog(int run_max, float jump_max, int swimming_max) {
        super(run_max, jump_max, swimming_max);
    }
}

class Cat extends Zoo {
    Cat(int run_max, float jump_max, int swimming_max) {
        super(run_max, jump_max, swimming_max);
    }
    Cat(int run_max, float jump_max) {
        super(run_max, jump_max, -1);
    }

    @Override
    public boolean swimming(int distance) {
        return false;
    }
}

interface Animal {
    boolean run(int distance);
    boolean jump(float height);
    boolean swimming(int distance);
}

abstract class Zoo implements Animal {
    protected int run_max;
    protected float jump_max;
    protected int swimming_max;

    Zoo(int run_max, float jump_max, int swimming_max) {
        this.run_max = run_max;
        this.jump_max = jump_max;
        this.swimming_max = swimming_max;
    }
    public boolean run(int distance) {
        return distance <= run_max;
    }
    public boolean jump(float height)  {
        return height <= jump_max;
    }
    public boolean swimming(int distance) {
        return distance <= swimming_max;
    }
}