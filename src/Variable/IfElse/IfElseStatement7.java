package Variable.IfElse;

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
public class IfElseStatement7 {
    public static void main(String[] args) {
        int history = 59;
        String h = "History";
        String p = "Programming";
        int programming = 91;

        if (history <= 60) {
            int mark = 2;
            System.out.println("Предмет " + h + " Ваша оценка по истории - " + mark);

        }

    }
}
