package org.java9;

import java.time.LocalDate;

public class SwitchExpression {

    public static void main(String[] args) {
        var localDate = LocalDate.of(2024,8,15);
        System.out.println(getQuarterFromMonthSwitchStatementBefore14(localDate));
        System.out.println(getQuarterFromMonthSwitchStatementFrom14(localDate));
    }

    //Until - Java 14 Switch statement
    public static String getQuarterFromMonthSwitchStatementBefore14(LocalDate localDate){
        var month = localDate.getMonth();
        var quarter = "";

        switch (month){
            case JANUARY:
            case FEBRUARY:
            case MARCH:
                quarter = "Q1, First Quarter";
                break;
            case APRIL:
            case MAY:
            case JUNE:
                quarter = "Q2, Second Quarter";
                break;
            case JULY:
            case SEPTEMBER:
                quarter = "Q3, Third Quarter";
                break;
            case OCTOBER:
            case NOVEMBER:
            case DECEMBER:
                quarter = "Q4, Fourth Quarter";
        }
        return quarter;
    }

    /*From - Java 14 Switch statement
    * Unlike above method if any month is not included then we get below error:
    * 'switch' expression does not cover all possible input values
    *
    * we can add multiple lines on right side
    */
    public static String getQuarterFromMonthSwitchStatementFrom14(LocalDate localDate) {
        var month = localDate.getMonth();
        return switch (month){
            case JANUARY, FEBRUARY, MARCH -> {
                System.out.println("Please pay your advance tax..");
                yield "Q1, First Quarter";
            }
            case APRIL, MAY, JUNE -> "Q2, Secong Quarter";
            case JULY, AUGUST, SEPTEMBER -> "Q3, Third Quarter";
            case OCTOBER, NOVEMBER, DECEMBER -> "Q4, Fourth Quarter";
        };
    }

}
