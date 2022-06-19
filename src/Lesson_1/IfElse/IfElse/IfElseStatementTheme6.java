package Lesson_1.IfElse.IfElse;
//Определение суммы вклада и начисленных банком %
//сумма вклада равна 300_000 руб.
//если она:
//меньше 100 000, то банк начисляет 5% годовых
//от 100 000 до 300 000, то — 7%
//больше 300 000, то — 10%
//отобразите в консоли:
//сумму вклада
//начисленный %
//итоговую сумму с %
public class IfElseStatementTheme6 {
    public static void main(String[] args) {
        int sum = 300_000;

        if (sum < 100_000) {
            double interest = sum * 0.05;
            System.out.println("Сумма вклада " + sum + "\n" + "Начисленный процент " + (int) interest +
                    "\n" + "Итоговая сумма " + ((int) interest + sum));
        } else if (sum < 300_000 && sum > 100_000) {
            double interest = sum * 0.07;
            System.out.println("Сумма вклада " + sum + "\n" + "Начисленный процент " + (int) interest +
                    "\n" + "Итоговая сумма " + ((int) interest + sum));
        } else if (sum >= 300_000) {
            double interest = sum * 0.1;
            System.out.println("Сумма вклада " + sum + "\n" + "Начисленный процент " + (int) interest +
                    "\n" + "Итоговая сумма " + ((int) interest + sum));
        }

    }
}

