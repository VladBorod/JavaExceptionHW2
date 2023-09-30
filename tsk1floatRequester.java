//Реализуйте метод, который запрашивает у пользователя
//        ввод дробного числа (типа float), и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения,
//        вместо этого,
//        необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class tsk1floatRequester {
    public static void main(String[] args) {
        boolean flag = true;
//        open scanner.
        Scanner nm = new Scanner(System.in);
//        eternal cycle
        String someValue;
        while (flag) {
            System.out.printf("Enter the number (using a point or comma for fraction): ");
            someValue = nm.nextLine();
            try {
                if (someValue == null || someValue.isEmpty()){
                    System.out.println("Empty input is not allowed!");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            Double temp = requester(someValue);
//            examination of Double and Float types, Double type stops application execution.
            if (temp instanceof Double) {
                System.out.println(requester(someValue));
                flag = false;
            } else {
                System.out.println("Let's try agan!");
                flag = true;
            }
        }
        nm.close();
    }
    public static Double requester(String tempValue){
//        variable initialization.
        Double number = null;
        String value = tempValue.replace(',', '.');
//        try parsing str to float + value return if true.
        try {
//            if string contains point - number float or double.
            if (value.contains(".") || value.contains(",")) {
                try {
                    number = Double.parseDouble(value);
                    floatDoubleComparator(number);
                    return number;
                } catch (TypeNotPresentException e){
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Number is Integer type or text was entered");
            }
        } catch (Exception e){
            System.out.println("Incorrect data was entered. Exception: " + e.getMessage());
        }
        return number;
    }
    public static void floatDoubleComparator(Double number){
        double maxPlus;
        double maxMinus;
        float pI = 3.4F;
        int degreePlus = 38;
        int degreeMinus = -38;
        int ten = 10;
        maxPlus = (pI * Math.pow(ten, degreePlus));
        maxMinus = (pI * Math.pow(ten, degreeMinus));

        if (number <= maxPlus && number >= maxMinus){
            System.out.println("Number is Float type");
        } else {
            System.out.println("Number is type Double, you need to enter " +
                    "Float type number");
        }
    }
}
