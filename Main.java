import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задание №1");
        System.out.println("Введите год");
        int y = scan.nextInt();
        System.out.println("Выберите:");
        System.out.println("1. До нашей эры");
        System.out.println("2. Нашей эры");
        int y1 = scan.nextInt();
        if ((y1 == 2) && (y % 4 == 0)) {
            System.out.println("Високосный");
        } else {
            if ((y % 4 == 0) && (y1 == 1) && (y < 46)) {
                System.out.println("Високосный");
            } else {
                System.out.println("Не високосный");
            }
        }
        System.out.println("Задание №2");
        System.out.println("Введите число от 1 до 99");
        int k = scan.nextInt();
        if ((k >= 5) && (k <= 20)) {
            System.out.println(k + " копеeк");
        } else {
            if ((k == 1) || (k % 10 == 1)) {
                System.out.println(k + " копейка");
            } else {
                if ((k % 10 >= 2) && (k % 10 <= 4)) {
                    System.out.println(k + " копейки");
                } else {
                    System.out.println(k + " копеeк");
                }
            }
        }


        System.out.println("Задание №3");
        System.out.println("Введите число от 1 до 365");
        int day = scan.nextInt();
        int day1 = day % 7;
        if (day1 == 1) {
            System.out.println("Пн");
        } else {
            if (day1 == 2) {
                System.out.println("Вт");
            } else {
                if (day1 == 3) {
                    System.out.println("Ср");
                } else {
                    if (day1 == 4) {
                        System.out.println("Чт");
                    } else {
                        if (day1 == 5) {
                            System.out.println("Пт");
                        } else {
                            if (day1 == 6) {
                                System.out.println("Сб");
                            } else {
                                System.out.println("Вс");
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Задание №4");
        System.out.println("Введите день своего рождения");
        int d = scan.nextInt();
        System.out.println("Введите месяц своего рождения");
        int n = scan.nextInt();
        if (((n == 3) && (d >= 21)) || ((n == 4) && (d <= 20))) {
            System.out.println("Вы Овен");
        } else {
            if (((n == 4) && (d >= 21)) || ((n == 5) && (d <= 20))) {
                System.out.println("Вы Телец");
            } else {
                if (((n == 5) && (d >= 21)) || ((n == 6) && (d <= 21))) {
                    System.out.println("Вы Близнецы");
                } else {
                    if (((n == 6) && (d >= 22)) || ((n == 7) && (d <= 22))) {
                        System.out.println("Вы Рак");
                    } else {
                        if (((n == 7) && (d >= 23)) || ((n == 8) && (d <= 23))) {
                            System.out.println("Вы Лев");
                        } else {
                            if (((n == 8) && (d >= 24)) || ((n == 9) && (d <= 23))) {
                                System.out.println("Вы Дева");
                            } else {
                                if (((n == 9) && (d >= 24)) || ((n == 10) && (d <= 23))) {
                                    System.out.println("Вы Весы");
                                } else {
                                    if (((n == 10) && (d >= 24)) || ((n == 11) && (d <= 22))) {
                                        System.out.println("Вы Скорпион");
                                    } else {
                                        if (((n == 11) && (d >= 23)) || ((n == 12) && (d <= 21))) {
                                            System.out.println("Вы Стрелец");
                                        } else {
                                            if (((n == 12) && (d >= 22)) || ((n == 1) && (d <= 20))) {
                                                System.out.println("Вы Козерог");
                                            } else {
                                                if (((n == 1) && (d >= 21)) || ((n == 2) && (d <= 18))) {
                                                    System.out.println("Вы Водолей");

                                                } else {
                                                    if (((n == 2) && (d >= 19)) || ((n == 3) && (d <= 20))) {
                                                        System.out.println("Вы Рыбы");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}














