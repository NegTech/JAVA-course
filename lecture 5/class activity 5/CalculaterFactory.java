package com.company;

public class CalculaterFactory {
    public Calculater makeCalculater(String input[]) {
        if (input != null) {
            switch (input[1]) {
                case "+":
                    return (Calculater) new CalcPlus();
                case "-":
                    return (Calculater) new CalcMinus();
            }
        } else
            return null;

        return null;
    }
}