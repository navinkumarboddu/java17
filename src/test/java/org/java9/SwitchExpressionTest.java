package org.java9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchExpressionTest {

    private SwitchExpression switches = new SwitchExpression();
    private static final LocalDate date = LocalDate.now();

    @Test
    public void getQuarterFromMonthSwitchStatementBefore14(){
        String quarter = switches.getQuarterFromMonthSwitchStatementBefore14(date.plusMonths(7));
        assertEquals(quarter, "Q4, Fourth Quarter");
    }

    @Test
    public void getQuarterFromMonthSwitchStatementFrom14(){
        String quarter = switches.getQuarterFromMonthSwitchStatementFrom14(date.plusMonths(7));
        assertEquals(quarter, "Q4, Fourth Quarter");
    }
}
