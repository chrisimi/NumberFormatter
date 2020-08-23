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

    @Test
    public void TestWith1M()
    {
        assertEquals("1M$", NumberFormatter.format(1000000));
    }

    @Test
    public void TestWith1MAndAComma()
    {
        assertEquals("1.2M$", NumberFormatter.format(1200000));
    }

    @Test
    public void TestWith1B()
    {
        assertEquals("1B$", NumberFormatter.format(1000000000));
    }

    @Test
    public void TestWith1BAndAComma()
    {
        assertEquals("1.5B$", NumberFormatter.format(1500000000));
    }

    @Test
    public void TestWith1T()
    {
        assertEquals("1T$", NumberFormatter.format(1000000000000.0));
    }

    @Test
    public void TestWith1TAndAComma()
    {
        assertEquals("1.9T$", NumberFormatter.format(1900000000000.0));
    }

    @Test
    public void TestWith1Q()
    {
        assertEquals("1Q$", NumberFormatter.format(1000000000000000.0));
    }

    @Test
    public void TestWith1QandComma()
    {
        assertEquals("1.3Q$", NumberFormatter.format(1300000000000000.0));
    }
}
