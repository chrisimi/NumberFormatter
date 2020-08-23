package test.java;


import com.chrisimi.numberformatter.NumberFormatter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests
{
    @Test
    public void Test1()
    {
        assertEquals("500$", NumberFormatter.format(500));
    }

    @Test
    public void TestWith1KAndAComma()
    {
        assertEquals("1.1k$", NumberFormatter.format(1100));
    }
}
