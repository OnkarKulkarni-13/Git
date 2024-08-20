public class Sum {

    int age;
    String name;

    public Sum() {
        this.age = 20;
        this.name = "onkar";
    }

    public static void main(String[] args) {

        Sum sum = new Sum();

        System.out.println("printing age of SUM :-> " + sum.age);

        int a1 = 10, b = 20;

        int addition = a1 + b;

        System.out.println("Sum is :-> " + addition);

        if (a1 > b) {
            System.out.println("A is greater than B");
        } else {
            System.out.println("B is greater than A");
        }

        System.out.println("Added new line");

    }

}
