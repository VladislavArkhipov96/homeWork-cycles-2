//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Task 1
        System.out.println("Task 1");

        int moneyTotal = 2_459_000;
        int moneyPerMonth = 15_000;
        int currentMoney = 0;
        int month = 0;

        while (currentMoney <= moneyTotal) {
            currentMoney += moneyPerMonth;
            ++month;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + currentMoney + ", рублей");
        }

        //Task 2
        System.out.println("Task 2");

        int currentNumber = 1;
        while (currentNumber <= 10) {
            System.out.print(currentNumber + " ");
            ++currentNumber;
        }
        System.out.println();

        for (int i = 10; i >= 1 ; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Task 3
        System.out.println("Task 3");

        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;

        for (int i = 1; i <= 10 ; i++) {
            population += population / 1000 * (fertility - mortality);
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        //Task 4
        System.out.println("Task 4");

        moneyTotal = 12_000_000;
        currentMoney = 15_000;
        month = 0;
        int percentPerMonth = 7;

        while (currentMoney < moneyTotal) {
            currentMoney *= 1.07;
            ++month;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + currentMoney);
            }
        }

        //Task 5
        System.out.println("Task 5");

        moneyTotal = 12_000_000;
        currentMoney = 15_000;
        month = 0;

        while (currentMoney < moneyTotal) {
            currentMoney *= 1.07;
            ++month;
            System.out.println("Месяц " + month + ", сумма накоплений " + currentMoney);
        }

        //Task 6
        System.out.println("Task 6");

        currentMoney = 15_000;
        for (int i = 1; i <= 9 * 12 ; i++) {
            currentMoney *= 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений " + currentMoney);
            }
        }

        //Task 7
        System.out.println("Task 7");

        int currentDay = 7;

        while (currentDay <= 31) {
            System.out.println("Сегодня пятница, " + currentDay + ", -е число. Необходимо подготовить отчет");
            currentDay += 7;
        }

        //Task 8
        System.out.println("Task 8");

        int currentYear = 2024;
        int startYear = currentYear - 200;
        int finishYear = currentYear + 100;

        for (int i = startYear; i <= finishYear ; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }




    }
}

