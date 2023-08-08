package com.company;
import java.util.*;

public class Main {

    public static void initial_tests()
    {
        String red_color = (char)27 + "[31m";
        String green_color = (char)27 + "[32m";
        String white_color = (char)27 + "[37m";
        System.out.println(white_color + "Исходный тест №1 - '1 + 2':");
        try {
            System.out.println(green_color + calc("1 + 2"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Исходный тест №2 - 'VI / III':");
        try {
            System.out.println(green_color + calc("VI / III"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Исходный тест №3 - 'I - II':");
        try {
            System.out.println(green_color + calc("I - II"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Исходный тест №4 - 'I + 1':");
        try {
            System.out.println(green_color + calc("I + 1"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Исходный тест №5 - '1':");
        try {
            System.out.println(green_color + calc("1"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Исходный тест №6 - '1 + 2 + 3':");
        try {
            System.out.println(green_color + calc("1 + 2 + 3"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
    }

    public static void my_tests()
    {
        String red_color = (char)27 + "[31m";
        String green_color = (char)27 + "[32m";
        String white_color = (char)27 + "[37m";
        String default_color = (char)27 + "[39m";
        System.out.println(default_color + "1. Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя" +
                " числами: a + b, a - b, a * b, a / b.\nДанные передаются в одну строку (смотри пример)! Решения," +
                " в которых каждое число и арифмитеческая операция передаются с новой строки считаются неверными.");
        System.out.println(white_color + "Мой тест №1 - '6 + 3':");
        try {
            System.out.println(green_color + calc("6 + 3"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Мой тест №2 - '6 - 3':");
        try {
            System.out.println(green_color + calc("6 - 3"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Мой тест №3 - '6 * 3':");
        try {
            System.out.println(green_color + calc("6 * 3"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Мой тест №4 - '6 / 3':");
        try {
            System.out.println(green_color + calc("6 / 3"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Мой тест №5 - '6\\n/\\n3':");
        try {
            System.out.println(green_color + calc("6\n/\n3"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(default_color + "2. Калькулятор умеет работать как с арабскими (1,2,3,4,5…)," +
                " так и с римскими (I,II,III,IV,V…) числами.");
        System.out.println(white_color + "Мой тест №6 - 'V * IV':");
        try {
            System.out.println(green_color + calc("V * IV"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(default_color + "3. Калькулятор должен принимать на вход числа от 1 до 10 включительно," +
                " не более. На выходе числа не ограничиваются по величине и могут быть любыми.");
        System.out.println(white_color + "Мой тест №7 - '0 * 10':");
        try {
            System.out.println(green_color + calc("0 * 10"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Мой тест №8 - '1 * 11':");
        try {
            System.out.println(green_color + calc("1 * 11"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Мой тест №9 - 'I * XI':");
        try {
            System.out.println(green_color + calc("I * XI"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(default_color + "4. Калькулятор умеет работать только с целыми числами.");
        System.out.println(white_color + "Мой тест №10 - '3.5 * 4.18':");
        try {
            System.out.println(green_color + calc("3.5 * 4.18"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(default_color + "5. Калькулятор умеет работать только с арабскими или римскими" +
                " цифрами одновременно, при вводе пользователем строки вроде 3 + II калькулятор должен\n" +
                "выбросить исключение и прекратить свою работу.");
        System.out.println(white_color + "Мой тест №11 - '3 + II':");
        try {
            System.out.println(green_color + calc("3 + II"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(default_color + "6. При вводе римских чисел, ответ должен быть выведен римскими цифрами," +
                " соответственно, при вводе арабских - ответ ожидается арабскими.");
        System.out.println(white_color + "Мой тест №12 - '3 + 6':");
        try {
            System.out.println(green_color + calc("3 + 6"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Мой тест №13 - 'I + V':");
        try {
            System.out.println(green_color + calc("I + V"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(default_color + "7. При вводе пользователем неподходящих чисел приложение выбрасывает" +
                " исключение и завершает свою работу.");
        System.out.println(white_color + "Мой тест №14 - '-5 + 6':");
        try {
            System.out.println(green_color + calc("-5 + 6"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(default_color + "8. При вводе пользователем строки, не соответствующей одной из вышеописанных" +
                " арифметических операций, приложение выбрасывает исключение и завершает свою работу.");
        System.out.println(white_color + "Мой тест №15 - '5 // 6':");
        try {
            System.out.println(green_color + calc("5 // 6"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Мой тест №16 - '5 \\ 6':");
        try {
            System.out.println(green_color + calc("5 \\ 6"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Мой тест №17 - '5 . 6':");
        try {
            System.out.println(green_color + calc("5 . 6"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(default_color + "9. Результатом операции деления является целое число, остаток отбрасывается. ");
        System.out.println(white_color + "Мой тест №18 - '5 / 6':");
        try {
            System.out.println(green_color + calc("5 / 6"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Мой тест №19 - '9 / 6':");
        try {
            System.out.println(green_color + calc("9 / 6"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Мой тест №20 - 'V / III':");
        try {
            System.out.println(green_color + calc("V / III"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Мой тест №21 - 'I / III':");
        try {
            System.out.println(green_color + calc("I / III"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(default_color + "10. Результатом работы калькулятора с арабскими числами могут быть " +
                "отрицательные числа и ноль. Результатом работы калькулятора с римскими числами\nмогут быть только " +
                "положительные числа, если результат работы меньше единицы, выбрасывается исключение");
        System.out.println(white_color + "Мой тест №22 - '1 - 9':");
        try {
            System.out.println(green_color + calc("1 - 9"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Мой тест №23 - '1 - 1':");
        try {
            System.out.println(green_color + calc("1 - 1"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Мой тест №24 - 'I - I':");
        try {
            System.out.println(green_color + calc("I - I"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
        System.out.println(white_color + "Мой тест №25 - 'I - V':");
        try {
            System.out.println(green_color + calc("I - V"));
        }
        catch (Exception e){
            System.out.println(red_color + "throws Exception");
        }
    }

    public static int convert_roman_to_arabic(String roman_number) {
        Map<Character, Integer> roman_numbers_map = new HashMap<Character, Integer>();
        roman_numbers_map.put('I', 1);
        roman_numbers_map.put('V', 5);
        roman_numbers_map.put('X', 10);
        roman_numbers_map.put('L', 50);
        roman_numbers_map.put('C', 100);
//        roman_numbers_map.put('D', 500);
//        roman_numbers_map.put('M', 1000);

        int result = 0;
        int previous_value = 0;

        for (int i = roman_number.length() - 1; i >= 0; i--) {
            int current_value = roman_numbers_map.get(roman_number.charAt(i));

            if (current_value < previous_value) {
                result -= current_value;
            } else {
                result += current_value;
            }

            previous_value = current_value;
        }
        return result;
    }

    public static String convert_arabic_to_roman(int arabic_number){
        Map<Integer, String> roman_numbers_map = new LinkedHashMap<>();
        roman_numbers_map.put(100, "C");
        roman_numbers_map.put(50, "L");
        roman_numbers_map.put(10, "X");
        roman_numbers_map.put(5, "V");
        roman_numbers_map.put(1, "I");
        String result = "";

        for (Map.Entry<Integer, String> entry : roman_numbers_map.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();

            while (arabic_number >= value) {
                result += symbol;
                arabic_number -= value;
            }
        }
        return result;
    }


    public static String calc_roman_numbers(int first, int second, char operator) throws Exception {
        int result;
        if (operator == '+')
            result = first + second;
        else if (operator == '-')
            result = first - second;
        else if (operator == '*')
            result = first * second;
        else
            result = first / second;
        if (result < 1)
            throw new Exception();
        else
            return convert_arabic_to_roman(result);
    }

    public static String calc_arabic_numbers(int first, int second, char operator){
        if (operator == '+')
            return Integer.toString(first + second);
        else if (operator == '-')
            return Integer.toString(first - second);
        else if (operator == '*')
            return Integer.toString(first * second);
        else
            return Integer.toString(first / second);
    }

    public static boolean array_contains_string(String[] array, String str){
        for (String element : array) {
            if (Objects.equals(element, str)) {
                return true;
            }
        }
        return false;
    }

    public static String calc(String input) throws Exception {
        String permissible_operators = "+-*/";
        String roman_permissible_digits = "IVX";
        String[] arabic_permissible_numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        String[] nums_and_operator = input.split(" ");
        if (nums_and_operator.length != 3)
            throw new Exception();

        String num_string_1 = nums_and_operator[0];
        String num_string_2 = nums_and_operator[2];

        if (nums_and_operator[1].length() != 1)
            throw new Exception();

        char operator = nums_and_operator[1].charAt(0);
        boolean valid_operator = false;
        for (int i = 0; i < permissible_operators.length(); i++) {
            if (Objects.equals(operator, permissible_operators.charAt(i))) {
                valid_operator = true;
                break;
            }
        }
        if (!valid_operator)
            throw new Exception();


        if ((!array_contains_string(arabic_permissible_numbers, num_string_1) &&
                array_contains_string(arabic_permissible_numbers, num_string_2)) ||
                (array_contains_string(arabic_permissible_numbers, num_string_1) &&
                        !array_contains_string(arabic_permissible_numbers, num_string_2))) {
            throw new Exception();
        }
        else if (array_contains_string(arabic_permissible_numbers, num_string_1) &&
                array_contains_string(arabic_permissible_numbers, num_string_2))
            return calc_arabic_numbers(Integer.parseInt(num_string_1), Integer.parseInt(num_string_2), operator);

        boolean first_number_is_roman = true;
        boolean second_number_is_roman = true;

        for (int i = 0; i < num_string_1.length(); i++) {
            if (roman_permissible_digits.indexOf(num_string_1.charAt(i)) == -1){
                first_number_is_roman = false;
                break;
            }
        }
        for (int i = 0; i < num_string_2.length(); i++) {
            if (roman_permissible_digits.indexOf(num_string_2.charAt(i)) == -1){
                second_number_is_roman = false;
                break;
            }
        }
        if ((first_number_is_roman && !second_number_is_roman) || (!first_number_is_roman && second_number_is_roman))
            throw new Exception();
        else if (first_number_is_roman && second_number_is_roman && convert_roman_to_arabic(num_string_1) <= 10 &&
                convert_roman_to_arabic(num_string_2) <= 10)
            return calc_roman_numbers(convert_roman_to_arabic(num_string_1), convert_roman_to_arabic(num_string_2), operator);
        else
            throw new Exception();
    }

    public static void main(String[] args) throws Exception {
//        initial_tests();
//        my_tests();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));
    }
}
