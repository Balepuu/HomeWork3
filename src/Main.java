public class Main {
    public static void main(String[] args) {

        int clientOs = 0;
        if (clientOs == 1){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 0){
            System.out.println("Установите версию приложения для Андроид по ссылке");
        } else {
            System.out.println("ОС не найдено");
        }

        int clientDeviceYear = 2016;
        if (clientOs == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Андроид по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегчённую версию для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегчённую версию для Андроид по ссылке");
        } else {
            System.out.println("ОС не найдено");
        }

        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосный");
        } else  {
            System.out.println("Год не является високосный");
        }

        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Доставка за 1 день");
        } else  if (deliveryDistance < 60) {
            System.out.println("Доставка за два дня");
        } else  if (deliveryDistance < 100) {
            System.out.println("Доставка за 3 дня");
        }

        int monthNumber = 18;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case  3:
            case  4:
            case  5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
            }

        }
    }