//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Task1
    System.out.println("    Task_1:");
    int clientOS = 1;
    if (clientOS != 1) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else {
        System.out.println("Установите версию приложения для Android по ссылке");
    }
    // Task2
    System.out.println("    Task_2:");
    int newClientOS = 0;
    int clientDeviceYear = 2014;
    if (newClientOS != 1 && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (newClientOS != 1 && clientDeviceYear < 2015) {
        System.out.println("Установите ОБЛЕГЧЁННУЮ версию приложения для iOS по ссылке");
    } else if (newClientOS == 1 && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для Android по ссылке");
    } else {
        System.out.println("Установите ОБЛЕГЧЁННУЮ версию приложения для Android по ссылке");
    }
    // Task3
    System.out.println("    Task_3");
    int year = 2021;
    boolean leapYear = ((year > 1584 && year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    if (leapYear) {
        System.out.println(year + " год является високосным");
    } else {
        System.out.println(year + " год не является високосным");
    }
    // Task4
    System.out.println("    Task_4");
    int deliveryDistance = 95;
    int delivDay;
    if (deliveryDistance <= 20) {
        delivDay = 1;
        System.out.println("На доставку потребуется дней: " + delivDay);
    } else if (deliveryDistance <= 60) {
        delivDay = 2;
        System.out.println("На доставку потребуется дней: " + delivDay);
    } else if (deliveryDistance <= 100) {
        delivDay = 3;
        System.out.println("На доставку потребуется дней: " + delivDay);
    } else {
        System.out.println("Свыше 100 км доставки нет.");
    }
    // Task5
    System.out.println("    Task_5");
    int monthNumber = 12;
    if (monthNumber > 12) {
        System.out.println("В году только 12 месяцев!");}
//    можно ещё так:
//    boolean realMonthNumber = (monthNumber<=12);
//    if (!realMonthNumber){
//        System.out.println("В году только 12 месяцев!");}
    switch (monthNumber) {
        case 12:
        case 1:
        case 2:
            System.out.println("Этот месяц принадлежит к сезону: зима.");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Этот месяц принадлежит к сезону: весна.");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Этот месяц принадлежит к сезону: лето.");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Этот месяц принадлежит к сезону: осень.");
            break;
        default:
    }
}
