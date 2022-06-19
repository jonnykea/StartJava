package Lesson_1.IfElse.IfElse;
//Перевод псевдокода на язык Java (это название задачи)
//        перепишите псевдокод, приведенный ниже, с помощью Java
//        используйте переменные, условные операторы, логическое НЕ
//        придумайте сообщения и отобразите в консоли
//        ЕСЛИ(возраст > 20) {
//        сообщение
//        } ИНАЧЕ {
//        сообщение
//        }
//
//        ЕСЛИ(!мужскойПол) {
//        сообщение
//        }
//
//        ЕСЛИ(рост < 1.80) {
//        сообщение
//        } ИНАЧЕ {
//        сообщение
//        }
////
//        перваяБукваИмени = “Имя”.charAt(0);
//        ЕСЛИ(перваяБукваИмени == 'M') {
//        сообщение
//        } ИНАЧЕ ЕСЛИ(перваяБукваИмени == 'I') {
//        сообщение
//        } ИНАЧЕ {
//        сообщение
//        }

public class IfElseStatementTheme1 {
    public static void main(String[] args) {
        int age = 33;
        boolean isMale = false;
        float height = 1.75f;
        String name = "ЖЕНЯ";


        if (age > 20) {
            System.out.println("Старик )))");
        } else {
            System.out.println("Молодой )))");
        }

        if (!isMale) {
            System.out.println("женщина");
        }

        if (height < 1.80) {
            System.out.println("Коротковат " + height);
        } else {
            System.out.println("Средний рост");
        }

        char firstLetter = name.charAt(0);
        if (firstLetter == 'M') {
            System.out.println("Не угадал");
        } else if (firstLetter == 'Ж') {
            System.out.println("Угадал");
        } else {
            System.out.println("Все мимо");
        }
    }
}
