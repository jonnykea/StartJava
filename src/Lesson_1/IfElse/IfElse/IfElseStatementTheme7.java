package Lesson_1.IfElse.IfElse;

//Определение оценки по предметам
//студент получил итоговые % по предметам:
//история 59%
//программирование 91%
//определите оценки по каждому предмету:
//<= 60% — 2
//> 60% - 3
//> 73% - 4
//> 91% - 5
//выведите в консоль:
//оценку и напротив предмет
//средний балл оценок по предметам
//средний % по предметам
public class IfElseStatementTheme7 {
    public static void main(String[] args) {
        int history = 59;
        String h = "History";
        String p = "Programming";
        int programming = 91;
        int mP = 1;
        int mH = 1;

        if (history <= 60) {
            int markH = 2;
            mH = markH;
            System.out.println("Предмет " + h + " Ваша оценка по истории - " + markH);
        } else if (history > 60 && history <= 73) {
            int markH = 3;
            mH = markH;
            System.out.println("Предмет " + h + " Ваша оценка по истории - " + markH);
        } else if (history > 73 && history <= 91) {
            int markH = 4;
            mH = markH;
            System.out.println("Предмет " + h + " Ваша оценка по истории - " + markH);

        } else if (history > 91) {
            int markH = 5;
            mH = markH;
            System.out.println("Предмет " + h + " Ваша оценка по истории - " + markH);
        }

        if (programming <= 60) {
            int markP = 2;
            mP = markP;
            System.out.println("Предмет " + p + " Ваша оценка по истории - " + markP);
        } else if (programming > 60 && programming <= 73) {
            int markP = 3;
            mP = markP;
            System.out.println("Предмет " + h + " Ваша оценка по истории - " + markP);
        } else if (programming > 73 && programming <= 91) {
            int markP = 4;
            mP = markP;
            System.out.println("Предмет " + p + " Ваша оценка по истории - " + markP);

        } else if (programming > 91) {
            int markP = 5;
            mP = markP;
            System.out.println("Предмет " + p + " Ваша оценка по истории - " + markP);
        }
        int m = (mP + mH) / 2;
        int midPercent = (history + programming) / 2;
        System.out.println("Средний бал оценок по предметам - " + m +
                "\n" + "Средний процент предметов - " + midPercent + " %");
    }
}
