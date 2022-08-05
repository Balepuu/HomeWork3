public class Main {
    public static void main(String[] args) {

        boolean clientOs = 1;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else  if (clientOs == 0) {
            System.out.println("Установите версию приложения для Андроид по ссылке");
        } else {
            System.out.println("ОС не найдена");
        }
    }
}