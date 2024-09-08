package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PatternHandler implements IHandler {

    public static final String NUMBER_PATTERN = "(\\d{1,}(\\.\\d{1,}){0,1})";
    private final Pattern pattern;

    public PatternHandler(String regexp) {
        this.pattern = Pattern.compile(regexp);
    }

    @Override
    public final String handle(String expression) {
        boolean isMatch = false;
        do {
            Matcher matcher = this.pattern.matcher(expression);
            isMatch = matcher.find();
            if (isMatch) {
                double result = calc(matcher);
                do {
                    expression = expression.replace(matcher.group(), String.valueOf(result));
                }
                while (expression.contains(matcher.group()));
            }
        } while (isMatch);

        return expression;
    }

    protected abstract double calc(Matcher matcher);
}
