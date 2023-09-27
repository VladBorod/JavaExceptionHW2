//Реализуйте метод, который запрашивает у пользователя
//        ввод дробного числа (типа float), и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения,
//        вместо этого,
//        необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class tsk1floatRequester {
    public static void main(String[] args) {
//        eternal cycle
        while (true) {
//            open scanner + message for user.
            Scanner nm = new Scanner(System.in);
            System.out.printf("Enter the number (using a point for fraction): ");
//            input of string value.
            String someValue = nm.next();
//            cannot close scanner! ----->
//            nm.close();
//            output.
            System.out.println(requester(someValue));
        }
    }
    public static Float requester(String value){
//        variable initialization.
        Float number = null;
//        try parsing str to float + value return if true.
        try {
            number = Float.parseFloat(value);
            return number;
//         catch exception where parse is unsuccessful.
        } catch (Exception e){
            System.out.println("Incorrect data was entered. Exception: " + e.getMessage());
        }
//        not sure this return is need.
        return number;
    }
}
