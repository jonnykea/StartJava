package Variable;

// Перестановка значений переменных
public class VariableTheme5 {
    public static void main(String[] args) {
        float a = 5f;
        float b = 10f;
        System.out.println("изначальные значения переменных a и b " + a + " " + b);
        // перестановка с помощью третей переменной
        float c;
        c = a;
        a = b;
        b = c;
        System.out.println("перестановленные значения переменных a и b с помощью переменной  " + a + " " + b);

        //с помощью арифметических операций
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("перестановленные значения переменных a и b с помощью арифметических операций " + a + " " + b);

        //с помощью побитовой операции
        a = (float) ((int) a ^ (int) b);
        b = (float) ((int) b ^ (int) a);
        a = (float) ((int) a ^ (int) b);
        System.out.println("перестановленные значения переменных a и b с помощью побитовой операций " + a + " " + b);

        float d = 5.1f;
        int k = (int) d;
        System.out.println("\n" + k);


    }
}
