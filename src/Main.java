public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work 3!");
        int age = 15;
        System.out.print(" Возрот человека равен " + age + " то,");
        if (age >= 18) {
            System.out.println(" Вы  свершеннолетний !! ");
        } else {
            System.out.println(" Вам еще нет совершеннолетия, нужно немног подождать !!");
        }
        int temperatura = 90;
        System.out.print("На улице " + temperatura + " градусов,");
        if (temperatura > 5) {
            System.out.println("можно идти без шапки.");
        } else {
            System.out.println("нужно надеть шапку.");
        }
        int speedOfTheCar = 50;
        System.out.print(" Скорость машины " + speedOfTheCar + " км/ч");
        if (speedOfTheCar <= 60) {
            System.out.println(" можно ездить спокойно. ");
        } else {
            System.out.println(" прийдется оплатить штраф !!!!!");
        }

        int ageOfThePerson = 7;
        System.out.print("Если возрост человека равен  " + ageOfThePerson);
        if (ageOfThePerson >= 2 || ageOfThePerson <= 6) {
            System.out.println(" то ему нужно ходить в садик .");
        } else if (ageOfThePerson >= 7 || ageOfThePerson <= 17) System.out.println(" то ему нужно ходить в школу.");
        else if (ageOfThePerson >= 18 || ageOfThePerson <= 24) {
            System.out.println(" то ему место  в университете.");
        } else if (ageOfThePerson > 24) {
            System.out.println(" то ему пора ходить на работу.");
        }
        int ageOfTheCild = 15;
        System.out.print("Если возраст ребенка равен " + ageOfTheCild);
        if (ageOfTheCild <= 5) {
            System.out.println("  он не может кататься на аттракционе!!! ");
        } else if (ageOfTheCild >= 5 && ageOfTheCild <= 14) {
            System.out.println(" он может кататься на аттракционе в сопровождении взрослого. ");
        } else if (ageOfTheCild > 14) {
            System.out.println(" он может кататься на оттракционе без сопроваждения .");
        }
        int totalCapacity = 102;
        int seatingCapacity = 62;
        int occupiedSeats = 65;
        if (occupiedSeats < totalCapacity && occupiedSeats > seatingCapacity) {
            System.out.println("В вагоне только стоячии места . ");
        } else if (occupiedSeats < seatingCapacity) {
            System.out.println("В вагоне есть только сидячии и стоячии места .");
        } else {
            System.out.println("Вагон полн !!!");
        }
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > three && one > two) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else if (three > one && three > two) {
            System.out.println(three);
        }
        System.out.println("Выполнил дз ");


    }


}