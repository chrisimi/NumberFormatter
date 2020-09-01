package com.chrisimi.numberformatter;

import java.text.DecimalFormat;

public class NumberFormatter
{
    public static void setConfiguration(Configuration configuration)
    {
        if(configuration.symbols != null)
            symbols = configuration.symbols;
        if(configuration.difference != 0.0)
            div = configuration.difference;
        if(configuration.currency != null)
            currency = configuration.currency;
        if(configuration.atTheBegin != null)
            atTheBegin = configuration.atTheBegin;
    }

    /**
     * set the currency for the format
     * default is FALSE
     * @param currency string of the currency to display if you want to have a space between symbol and number you have to add the space in the string too like "$ "
     * @param atTheBegin if the currency should be displayed before the number
     *                   true: $1M
     *                   false: 1M$
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
     *                  true: ~1.3M
     *                  false: 1.280.982 $
     *                  default is TRUE
     * @return a string in a formatted way like 1.000.000 -> 1M
     */
    public static String format(double amount, boolean hardParse)
    {
        return formatValue(amount, hardParse);
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
                if(Math.pow(div, i + 1) <= amount)
                {
                    double divResult = amount / Math.pow(div, i + 1);

                    //to have one number after the comma like 21.2
                    double roundedResult = (double)Math.round(divResult * 10) / 10;

                    return formatRoundedNumber(roundedResult, i, divResult != roundedResult);
                }
            }
        }

        return formatRoundedNumber(amount, -1, false);
    }

    private static String formatValueHardParse(double amount)
    {
        return formatRoundedNumber(amount, -1, false);
    }

    /**
     * at the character and symbols to the number
     * @param roundedAmount should be the rounded Number
     * @param index index of the symbol, -1 for no symbol
     * @return the converted amount with symbols like 1,2 M
     */
    private static String formatRoundedNumber(double roundedAmount, int index, boolean rounded)
    {
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#.###");

        if(atTheBegin)
            sb.append(currency);

        //check the amount of comma digits
        if(roundedAmount % 1 == 0)
            sb.append(String.format("%s", (int)roundedAmount));
        else if(rounded)
            sb.append("~").append(df.format(roundedAmount));
        else if(roundedAmount % 1 < 5)
            sb.append(df.format(roundedAmount));


        //add symbol
        if(index >= 0)
            sb.append(symbols[index]);

        if(!atTheBegin)
            sb.append(currency);

        return sb.toString();
    }
}
