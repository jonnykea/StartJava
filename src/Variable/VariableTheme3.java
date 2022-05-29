package Variable;

// Вывод на консоль слова JAVA
//Отобразите в консоли слово JAVA, как в примере ниже:
//   J    a  v     v  a
//   J   a a  v   v  a a
//J  J  aaaaa  V V  aaaaa
// JJ  a     a  V  a     a
public class VariableTheme3 {
    public static void main(String[] args) {
        String a = "a";
        String b = "v";
        String c = "V";
        String d = "J";
        System.out.println("    " + d + "    " + a + "  " + b + "       " + b + "  " + a +
                "\n" + "    " + d + "   " + a + " " + a + "  " + b + "     " + b + "  " + a + " " + a +
                "\n" + " " + d + "  " + d + "  " + a + a + a + a + a + a + "  " + c + "  " + c + "  " + a + a + a + a + a +
                "\n" + "  " + d + d + "   " + a + "      " + a + "  " + c + "  " + a + "       " + a);
    }
}
