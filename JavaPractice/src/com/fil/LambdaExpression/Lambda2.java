package com.fil.LambdaExpression;

import java.util.StringJoiner;

@FunctionalInterface
interface StringFormatter {
    String format(String input);
}

public class Lambda2 {

	public static void main(String[] args) {
        StringFormatter formatter = (input) -> {
            return String.join(" ", input.split(""));
        };

        String inputString = "FIL";
        String formattedString = formatter.format(inputString);
        System.out.println(formattedString);

	}

}
