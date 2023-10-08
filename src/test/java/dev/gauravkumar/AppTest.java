package dev.gauravkumar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void fifteenPlusTwentyIsThirtyFive(){
        assertEquals(35, App.sum(new String[]{"15", "20"}));
    }
    @Test
    public void twentyPlusTwentyIsForty(){
        assertEquals(40, App.sum(new String[]{"20", "20"}));
    }
}
