package test.java;


import com.chrisimi.numberformatter.NumberFormatter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests
{
    @Test
    public void TestWithRoundingHard()
    {
        assertEquals("~1,1k$", NumberFormatter.format(1098));
    }

    @Test
    public void TestWithHardParse()
    {
        assertEquals("1259$", NumberFormatter.format(1259, false));
    }

    @Test
    public void TestWithMoreThan1Comma()
    {
        assertEquals("~1,2k$", NumberFormatter.format(1230));
    }

    @Test
    public void TestWithMoreThan1CommaRounding()
    {
        assertEquals("~1,3k$", NumberFormatter.format(1290));
    }

    @Test
    public void Test1()
    {
        assertEquals("500$", NumberFormatter.format(500));
    }

    @Test
    public void TestWith1KAndAComma()
    {
        assertEquals("1,1k$", NumberFormatter.format(1100));
    }

    @Test
    public void TestWith1M()
    {
        assertEquals("1M$", NumberFormatter.format(1000000));
    }

    @Test
    public void TestWith1MAndAComma()
    {
        assertEquals("1,2M$", NumberFormatter.format(1200000));
    }

    @Test
    public void TestWith1B()
    {
        assertEquals("1B$", NumberFormatter.format(1000000000));
    }

    @Test
    public void TestWith1BAndAComma()
    {
        assertEquals("1,5B$", NumberFormatter.format(1500000000));
    }

    @Test
    public void TestWith1T()
    {
        assertEquals("1T$", NumberFormatter.format(1000000000000.0));
    }

    @Test
    public void TestWith1TAndAComma()
    {
        assertEquals("1,9T$", NumberFormatter.format(1900000000000.0));
    }

    @Test
    public void TestWith1Q()
    {
        assertEquals("1Q$", NumberFormatter.format(1000000000000000.0));
    }

    @Test
    public void TestWith1QAndComma()
    {
        assertEquals("1,3Q$", NumberFormatter.format(1300000000000000.0));
    }
}
