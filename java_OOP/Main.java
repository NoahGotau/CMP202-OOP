public class Main {
    public static void main(String[] args) {
        Person student = new Person("bingham", "Winner", "123456789", "bhu/22/01/01/0001");
        Person staff = new Person("bingham", "Mrs Toyin", "123456789", 0);
        Physics calc = new Physics();
        System.out.println(calc.calcVel(100, 60));
        System.out.println(calc.calcVel(88, 45, 50));
    }
}