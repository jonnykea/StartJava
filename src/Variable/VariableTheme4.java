package Variable;

// Отображение min и max значений числовых типов данных
//создайте переменные всех целых числовых типов
//присвойте им самые большие числа, которые они могут хранить
//инкрементируйте, а затем декрементируйте все значения на единицу
//выводите данные на консоль для каждой переменной в следующей последовательности:
//первоначальное значение
//значение после инкремента
//значение после декремента
public class VariableTheme4 {
    public static void main(String[] args) {
        byte a = 127; // исходный
        byte a1, a2;
        a1 = (byte) (a + 1); // инкрементированный
        a2 = (byte) (a - 1); // декрементированный
        short b = 32_767;
        short b1, b2;
        b1 = (short) (b + 1); // инкрементированный
        b2 = (short) (b - 1); // декрементированный
        int c = 2_147_483_647;
        int c1, c2;
        c1 = c + 1; // инкрементированный
        c2 = c - 1; // декрементированный
        long d = 9_223_372_036_854_775_807L;
        long d1, d2;
        d1 = d + 1; // инкрементированный
        d2 = d - 1; // декрементированный
        System.out.println("переменная a - тип byte " + "исходная = " + a + " инкрементированная = " + a1 + " декрементированная = " + a2);
        System.out.println("переменная b - тип short " + "исходная = " + b + " инкрементированная = " + b1 + " декрементированная = " + b2);
        System.out.println("переменная c - тип int " + "исходная = " + c + " инкрементированная = " + c1 + " декрементированная = " + c2);
        System.out.println("переменная d - тип int " + "исходная = " + d + " инкрементированная = " + d1 + " декрементированная = " + d2);

    }
}
