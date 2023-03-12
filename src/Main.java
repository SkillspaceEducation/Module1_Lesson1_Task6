/*
1. Написать метод, принимающий на вход 5ти-значное число и возвращающий 3юю цифру.
2. При тестировании метода, число вводить с клавиатуры
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пятизначное число:");
        int number = scanner.nextInt();
        int result = getThirdDigit(number);
        System.out.printf("Третьей цифрой числа %d является %d", number, result);
    }
    static int getThirdDigit(int i){
        int num = (i /100); // "отбрасываем" 4 и 5 цифру числа
        return num % 10; // получаем значение третьей цифры исходного числа
    }
}