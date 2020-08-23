package com.chrisimi.numberformatter;

public class NumberFormatter
{
    /**
     * set the currency for the format
     * default is FALSE
     * @param currency string of the currency to display
     * @param atTheBegin if the currency should be displayed before the number
     *                   true: $ 1M
     *                   false: 1M $
     */
    public static void setCurrency(String currency, boolean atTheBegin)
    {
        NumberFormatter.currency = currency;
        NumberFormatter.atTheBegin = atTheBegin;
    }

    private static String[] symbols = {"k", "M", "B", "T", "Q"};
    private static double div = 1000.0;
    private static String currency = "$";
    private static boolean atTheBegin = false;


    /**
     * format a number to a shorter version of it
     * @param amount the amount to format
     * @param hardParse set to true when the value should not be rounded
     *                  true: 1.280.822 -> 1.2M 80k 822
     *                  false: 1.280.822 -> ~1.3M
     *                  default is TRUE
     * @return a string in a formatted way like 1.000.000 -> 1M
     */
    public static String format(double amount, boolean hardParse)
    {

    }

    /**
     * format a number to a short version of it
     * @param amount the amount to format
     * @return a string in a formatted way like 1.000.000 -> 1M
     */
    public static String format(double amount)
    {
        return format(amount, true);
    }

    private static String formatValue(double amount, boolean hardParse)
    {
        return (hardParse) ? formatValue(amount) : formatValueHardParse(amount);
    }

    private static String formatValue(double amount)
    {
        while(amount > div)
        {
            for(int i = symbols.length - 1; i >= 0; i--)
            {
                if(Math.pow(div, i) > amount)
                {

                }
            }
        }
    }

    private static String formatValueHardParse(double amount)
    {
        return "";
    }
}
