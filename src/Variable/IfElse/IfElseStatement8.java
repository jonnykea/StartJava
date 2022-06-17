package Variable.IfElse;
//продавеу снимает помещение за 5000 руб в месяц
//в среднем он продает товара на 13000 руб
//при этом его себестоимость равна 9000 руб
//посчитайте годовую прибыль
//отобразите ее в консоли в следующем формате, например:
//   прибыль за год - 1000 руб
//   прибыль за год + 3000 руб
//если прибыль положительная, то рядом с чмслом необходимо отображать+

public class IfElseStatement8 {
    public static void main(String[] args) {
        int SpentLent = 5000;
        int proceed = 13000 - 9000; // выручка
        int year = 12;
        int LentForYear = SpentLent * year;
        int ProcedForYear = proceed * year;
        int profit = ProcedForYear - LentForYear;
        if (profit >= 0) {
            System.out.println("Прибыль за год составила  " + profit + " руб." + " +");
        } else if (profit < 0) {
            System.out.println("Прибыль за год составила " + profit+ " руб.");
        }
    }
}
