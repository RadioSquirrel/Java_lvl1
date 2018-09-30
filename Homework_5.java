/**
 * Java. Level 1. Lesson 5. Homework_5
 * @author Plieva Maya
 * @version Sep 27, 2018
 */


class Homework_5 {

    public static void main(String[] args) {
        Worker[] staff = {
                new Worker("Harry Potter", "Auror",
                        "voldemort_die@hogwarts.com", "5553535", 80000, 41),
                new Worker("Hermione Granger", "General auror",
                        "loveronald@hogwarts.com", "5553636", 100000, 22),
                new Worker("Ronald Weasley", "Junior auror",
                        "rweasley@hogwarts.com", "5553737", 50000, 44),
                new Worker("Draco Malfoy", "Student",
                        "bestofthebest@hogwarts.com", "5553838", 20000, 19),
                new Worker("Luna Lovegood", "Programmer",
                        "immastrange@hogwarts.com", "5553939", 70000, 26)
        };

        for (Worker worker : staff)
            if (worker.getAge() > 40)
                System.out.println(worker);

    }
}

class Worker {
    private String name;
    private String post;
    private String mail;
    private String phnnum;
    private int pay;
    private int age;

    public Worker(String name, String post, String mail, String phnnum,
                  int pay, int age) {
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.phnnum = phnnum;
        this.pay = pay;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return ("Name: " + name + " Post: " + post +
                " Mail: " + mail + " Phone number: " + phnnum
                + " Paid: " + pay + " Age: " + age);
    }
}