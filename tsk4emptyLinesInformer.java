import java.util.Scanner;

public class tsk4emptyLinesInformer {
    public static void main(String[] args) {
        String someValue = null;
        while (true) {
            Scanner nm = new Scanner(System.in);
            try {
                System.out.printf("Enter the number (using a point for fraction): ");
                someValue = nm.nextLine();
                if (someValue == null || someValue.isEmpty()) {
                    System.out.println("Empty input is not allowed!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(requester(someValue));
        }
    }
    public static Float requester(String value){
//        if (value.isEmpty()){
//            System.out.println("Empty input is not allowed!");
//        }
        Float number = null;
        try {
            number = Float.parseFloat(value);
            return number;
        } catch (Exception e){
            System.out.println("Incorrect data was entered. Exception: " + e.getMessage());
        }
        return number;
    }
}
