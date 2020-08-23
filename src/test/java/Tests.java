package test.java;


import com.chrisimi.numberformatter.NumberFormatter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests
{
    @Test
    public void Test1()
    {
        assertEquals("500.0$", NumberFormatter.format(500));
    }
}
