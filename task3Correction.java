//IMPORT!---------------------------
import java.io.FileNotFoundException;

public class task3Correction {
    public static void main(String[] args) { // NO NEED FOR THIS ---> throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
//      INCORRECT ORDER OF EXCEPTIONS!!!
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b){ //NO NEED ---> throws FileNotFoundException {
        System.out.println(a + b);
    }

}
