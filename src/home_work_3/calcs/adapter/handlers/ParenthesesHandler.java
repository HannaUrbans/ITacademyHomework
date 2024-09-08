package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParenthesesHandler implements IHandler {

    private static final String PARENTHESES_PATTERN = "\\(([^()]+)\\)";
    private final IHandler[] handlers;
    private final ICalculator calculator = new CalculatorWithMathExtends();

    public ParenthesesHandler(IHandler... handlers) {
        this.handlers = handlers;
    }

    @Override
    public String handle(String expression) {
        Pattern pattern = Pattern.compile(PARENTHESES_PATTERN);
        Matcher matcher = pattern.matcher(expression);

        while (matcher.find()) {
            String innerExpression = matcher.group(1);
            for (IHandler handler : handlers) {
                innerExpression = handler.handle(innerExpression);
            }
            double result = evaluate(innerExpression);
            expression = expression.replace(matcher.group(), String.valueOf(result));
            matcher = pattern.matcher(expression); // Обновляем matcher для нового выражения
        }
        return expression;
    }


    private double evaluate(String expression) {
        try {
            return Double.parseDouble(expression);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ошибка в выражении: " + expression, e);
        }
    }


    @Override
    public int getPriority() {
        return 4;
    }
}

