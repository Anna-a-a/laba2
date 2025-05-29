import java.util.Scanner;

//Fixme: Нет разделения по пакетам (package model, package app, package util)
//Fixme: Нет тестов или валидации данных в Main
//Fixme: Нет использования Enum, List, Optional — всё вручную и на массивах
// Методы часто используют System.out.println() напрямую — в реальных проектах используют логгеры

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Fixme: стоит вынести создание точек, линий и студентов в отдельные методы

        System.out.println("Введите координаты для первой точки (X Y):");
        double x1 = inputCoordinate(scanner, "X");
        double y1 = inputCoordinate(scanner, "Y");

        System.out.println("Введите координаты для второй точки (X Y):");
        double x2 = inputCoordinate(scanner, "X");
        double y2 = inputCoordinate(scanner, "Y");

        System.out.println("Введите координаты для третьей точки (X Y):");
        double x3 = inputCoordinate(scanner, "X");
        double y3 = inputCoordinate(scanner, "Y");

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        Point point3 = new Point(x3, y3);

        System.out.println("Точка 1: " + point1.toString());
        System.out.println("Точка 2: " + point2.toString());
        System.out.println("Точка 3: " + point3.toString());

        scanner.close();
        //2 задача
        Point point1Start = new Point(1, 3);
        Point point1End = new Point(23, 8);

        Point point2Start = new Point(5, 10);
        Point point2End = new Point(25, 10);


        Line line1 = new Line(point1Start, point1End);
        Line line2 = new Line(point2Start, point2End);
        Line line3 = new Line(point1Start, line2.getEnd());

        System.out.println("Линия 1: " + line1.toString());
        System.out.println("Линия 2: " + line2.toString());
        System.out.println("Линия 3: " + line3.toString());

        point2End.setX(111);
        point2End.setY(111);

        System.out.println("Линия 1 до изменения: " + line1.toString());
        System.out.println("Линия 2 до изменения: " + line2.toString());
        System.out.println("Линия 3 до изменения: " + line3.toString());


        Point newPoint1Start = new Point(100, 200);
        Point newPoint1End = new Point(300, 400);
        Point newPoint2Start = new Point(10, 20);
        Point newPoint2End = new Point(30, 40);
        line1.setStart(newPoint1Start);
        line1.setEnd(newPoint1End);
        line2.setStart(newPoint2Start);
        line2.setEnd(newPoint2End);


        System.out.println("Линия 1 после изменения без изменения третьей линии: " + line1.toString());
        System.out.println("Линия 1 после изменения без изменения третьей линии: " + line2.toString());
        System.out.println("Линия 3 после изменения без изменения третьей линии: " + line3.toString());
        //3 задача

        int[] vasyaGrades = {3, 4, 5};
        // Fixme: Имена переменных должны начинаться с маленькой буквы: vasya, petya
        Student Vasya = new Student("Вася", vasyaGrades);
        Student Petya = new Student("Петя", vasyaGrades);

        Petya.getGrades()[0] = 5;

        System.out.println(Vasya.toString());
        System.out.println(Petya.toString());

        Student Andrey = new Student("Андрей", new int[vasyaGrades.length]);
        Andrey.copyGrades(Vasya);
        Vasya.getGrades()[0] = 2;

        System.out.println(Vasya.toString());
        System.out.println(Andrey.toString());
        Point point1_4 = new Point(3, 5);
        Point point2_4 = new Point(25, 6);
        Point point3_4 = new Point(7, 8);

        System.out.println("Точка 1: " + point1_4.toString());
        System.out.println("Точка 2: " + point2_4.toString());
        System.out.println("Точка 3: " + point3_4.toString());

        // Создаем и выводим линии
        Point start1_4 = new Point(1, 3);
        Line line1_4 = new Line(start1_4, new Point(23, 8));
        Line line2_4 = new Line(5, 10, 25, 10);
        Line line3_4 = new Line(new Point(start1_4), line2_4.getEnd());

        System.out.println("Линия 1: " + line1_4.toString());
        System.out.println("Линия 2: " + line2_4.toString());
        System.out.println("Линия 3: " + line3_4.toString());

        start1_4.setX(3);
        line2_4.getEnd().setX(5);


        System.out.println("Линия 1: " + line1_4.toString());
        System.out.println("Линия 2: " + line2_4.toString());
        System.out.println("Линия 3: " + line3_4.toString());

        Line line = new Line(new Point(1, 1), new Point(10, 15));

        System.out.println(line);
        System.out.println("Длина линии: " + line.getDistance());

    }

    public static double inputCoordinate(Scanner scanner, String coordinateName) {
        while (true) {
            System.out.print("Введите " + coordinateName + ": ");
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                scanner.next();
            }
        }
    }
    public static String inputStr(Scanner scanner) {
        while (true) {
            System.out.print("Введите имя : ");
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите имя.");
                scanner.next();
            }
        }
    }
    public static Integer inputInt(Scanner scanner) {
        while (true) {
            System.out.print("Введите имя : ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите имя.");
                scanner.next();
            }
        }
    }
}
