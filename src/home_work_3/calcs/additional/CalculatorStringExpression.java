package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculatorWithoutSquareRoot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Разбор (парсинг) СТРОКИ с математическим выражением
 * Создан новый интерфейс ICalculatorWithoutSquareRoot (отличается отсутствием метода squareRoot(a,b)
 * Создан класс-адаптер CalculatorWithMathCopyAdapter для возможности осущ-ния вычислений с помощью калькулятора из класса CalculatorWithMathCopy
 * Вычисления проводятся поэтапно
 * Результат каждого вычисления вставляется в String выражение вместо выражения "число+оператор+число"
 * ! не протестировано на отрицательных числах типа (-d) ли -d
 */
public class CalculatorStringExpression {
    private final ICalculatorWithoutSquareRoot calculator;

    public CalculatorStringExpression(ICalculatorWithoutSquareRoot calculator) {
        this.calculator = calculator;
    }

    public double parseAndCalculateString(String input) {
        double calculatedResult;

        if (isEnoughBrackets(input)) {

            input = changeStringConstantIntoNumber(input);

            input = applyABS(input);

            input = changeBracketsExpressionIntoNumber(input);

            calculatedResult = calculateResult(input);
        } else {
            calculatedResult = Double.NaN;
        }
        return calculatedResult;
    }

    public double calculateResult(String input) {
        input = input.replaceAll(" ", "");

        while (input.contains("^")) {
            input = doMathPow(input);
        }

        while (input.contains("*") || input.contains("/")) {
            input = multiplyDivide(input);
        }

        while (input.contains("+") || input.contains("-")) {
            input = addSubtract(input);
        }

        return Double.parseDouble(input);

    }

    public boolean isEnoughBrackets(String input) {
        int countStartBracket = 0;
        int countEndBracket = 0;
        int countABSBracket = 0;
        boolean answer = true;

        for (char inputChar : input.toCharArray()) {
            if (inputChar == '(') {
                countStartBracket++;
            } else if (inputChar == ')') {
                countEndBracket++;
            } else if (inputChar == '|') {
                countABSBracket++;
            }

        }
        if (countStartBracket != countEndBracket || countABSBracket % 2 != 0) {
            answer = false;
        }
        return answer;
    }

    public String changeStringConstantIntoNumber(String input) {
        input = input.replaceAll("(?i)PI", String.valueOf(Math.PI));
        input = input.replaceAll("(?i)E", String.valueOf(Math.E));
        return input;
    }

    public String applyABS(String input) {
        String ABSToTransform;
        double ABSTransformed;
        int startIndex = input.indexOf('|');
        int finalIndex = input.indexOf('|', startIndex + 1);
        while ((startIndex = input.indexOf('|')) != -1) {
            finalIndex = input.indexOf('|', startIndex + 1);
            ABSToTransform = input.substring(startIndex + 1, finalIndex);
            ABSTransformed = calculator.absoluteValue(Double.parseDouble(ABSToTransform));
            input = input.substring(0, startIndex) + ABSTransformed + input.substring(finalIndex + 1);
        }
        return input;
    }

    public String changeBracketsExpressionIntoNumber(String input) {
        while (input.contains("(")) {
            int startIndex = input.lastIndexOf('(');
            int endIndex = input.indexOf(')', startIndex);

            String expressionInBrackets = input.substring(startIndex + 1, endIndex);

            double resultInBrackets = calculateResult(expressionInBrackets);

            input = input.substring(0, startIndex) + resultInBrackets + input.substring(endIndex + 1);
        }

        return input;
    }

    private String findExpression(String input, String regex, Operation operation) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuilder result = new StringBuilder();
        int lastEnd = 0; //индекс, до которого уже обработана строка
        while (matcher.find()) {
            double a = Double.parseDouble(matcher.group(1));
            double b = Double.parseDouble(matcher.group(4));
            double res = operation.apply(a, b);

            result.append(input, lastEnd, matcher.start()); // строка между последним обработанным совпадением и текущим совпадением
            result.append(res);

            lastEnd = matcher.end(); //обновляет lastEnd на конец текущего совпадения для последующей обработки
        }

        result.append(input.substring(lastEnd)); //часть строки, которая не содержала подходящих шаблонов
        return result.toString();
    }

    @FunctionalInterface
    private interface Operation {
        double apply(double a, double b);
    }

    private String doMathPow(String input) {
        return findExpression(input, "(\\d+(\\.\\d+)?)(\\^(\\d+(\\.\\d+)?))", (a, b) -> calculator.raiseToPower(a, b));
    }

    private String multiplyDivide(String input) {
        return findExpression(input, "(\\d+(\\.\\d+)?)([*/])(\\d+(\\.\\d+)?)",
                (a, b) -> input.contains("*") ? calculator.multiply(a, b) : calculator.divide(a, b));
    }

    private String addSubtract(String input) {
        return findExpression(input, "(\\d+(\\.\\d+)?)([+-])(\\d+(\\.\\d+)?)",
                (a, b) -> input.contains("+") ? calculator.add(a, b) : calculator.subtract(a, b));
    }
}

