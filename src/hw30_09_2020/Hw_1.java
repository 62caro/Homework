package hw30_09_2020;

/*Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
Напишите программу, определяющую какой суммарный путь пробежит спортсмен за 7 дней? */

public class Hw_1 {

    public static void main(String[] args) {
        double day_7 = 10;
        double percent = day_7;

        for (int i = 0; i < 6; i++){
            percent *=  1.1;
            day_7 += percent;
        }

        System.out.println("Суммарный путь спортсмена за 7 дней: " + day_7);
    }
}
