public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work 3!");
        int age = 15;
        System.out.print(" Возрот человека равен "+age+" то,");
        if ( age >= 18) {
            System.out.println(" Вы  свершеннолетний !! ");
        }
        if (age<18) {
            System.out.println(" Вам еще нет совершеннолетия, нужно немног подождать !!");
        }
        int temperatura = -13;
        System.out.print("На улице "+ temperatura+ " градусов,");
        if (temperatura <=5){
            System.out.println(" нужно одеть шапку ");
        } else {
            System.out.println(" можно идти без шапки. ");
        }
        int speedOfTheCar = 100 ;
        System.out.print(" Скорость машины "+ speedOfTheCar+ " км/ч");
        if (speedOfTheCar > 60) {
            System.out.println(" прийдется оплатить штраф !!!!!");

        } else {
            System.out.println(" можно ездить спокойно. ");
        }

        int ageOfTheperson= 14;
        System.out.print("Если возрост человека равен  "+ageOfTheperson);
        if (ageOfTheperson>2 && ageOfTheperson<6 ){
            System.out.println(" то ему нужно ходить в садик .");
        }
        if (ageOfTheperson>7 && ageOfTheperson<17 ){
            System.out.println(" то ему нужно ходить в школу.");
        }
        if(ageOfTheperson>=18 && ageOfTheperson<=24){
            System.out.println(" то ему место  в университете.");
        }
        if(ageOfTheperson>24){
            System.out.println(" то ему пора ходить на работу.");
        }
        int ageOfTheCild = 7;
        System.out.print("Если возраст ребенка равен "+ageOfTheCild);
        if ( ageOfTheCild <5){
            System.out.println("  он не может кататься на аттракционе!!! ");
            }
        if (ageOfTheCild>5 && ageOfTheCild<14){
            System.out.println(" он может кататься на аттракционе в сопровождении взрослого. ");
        }
        if(ageOfTheCild>14)
            System.out.println(" он может кататься на оттракционе без сопроваждения .");




        }
    }