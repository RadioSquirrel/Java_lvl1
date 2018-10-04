/**
 * Java. Level 1. Lesson 7. Homework 7.
 * @author Maya Plieva
 * @version Oct 04, 2018
 */

class Homework_7 {
    public static void main(String[] args) {
        System.out.println("List of cats:");
        Cat[] cats = {new Cat("White Cat", 7), new Cat("Black Cat", 5),
                new Cat("Ginger Cat", 15)};
        Plate plate = new Plate(100);
        for (Cat kitty : cats) {
            System.out.println(kitty);
        }
        System.out.println("\n" + plate);
        System.out.println("+100 food");
        plate.increaseFood(100);
        System.out.println("\n" + plate);
        System.out.println("\n" + "Cats take a food:");
        for (Cat kitty : cats) {
            kitty.eat(plate);
            System.out.println(kitty);
            System.out.println(plate);
        }
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean full;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    @Override
    public String toString() {
        return "Cat: " + name + ", Appetite: " + appetite + ", Full: "
                + full;}

    void eat(Plate plate) {
        if (plate.getAmountOfFood() > appetite) {
            plate.decreaseFood(appetite);
            full = true;
        }
    }
}

class Plate {
    private int amountOfFood;

    Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    @Override
    public String toString() {
        return "Plate: " + amountOfFood;
    }

    void decreaseFood(int appetite) {
        if (amountOfFood >= appetite) {
            amountOfFood -= appetite;
        }
    }

    int getAmountOfFood() {
        return amountOfFood;
    }

    void increaseFood(int amount) {
        amountOfFood += amount;
    }
}