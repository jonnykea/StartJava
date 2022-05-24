package Variable;
// Расчет стоимости товара со скидкой
public class VariableTheme2 {
    public static void main(String[] args) {

        int x = 100; //стоимость первого товара
        int y = 200;//стоимость второго товара
        int z = ((x + y) / 100) * 11; //скидка на товары 11 %
        int t = (x + y) - z; //общая стоимость товара с учетом скидки

        System.out.println("сумма скидки - " + z + "\n" + "общая стоимость товара c учетом скидки - " + t);
    }
}

