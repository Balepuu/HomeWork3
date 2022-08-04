public class Main {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18 && age < 21) {
            System.out.println("Ты достаточно взрослый для того, чтобы ходить,но не достаточно, чтобы пить алкоголь");
        }
        if (age < 7 || age > 18) {
            System.out.println("Я думаю ты не ходишь в школу");
        }
    }
}