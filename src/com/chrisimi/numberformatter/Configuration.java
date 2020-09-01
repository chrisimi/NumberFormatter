package com.chrisimi.numberformatter;

/**
 * a configuration class to configure the settings of the number formatter
 */
public class Configuration
{
    public String[] symbols = null;
    public double difference = 0.0;
    public String currency = null;
    public Boolean atTheBegin = null;

    /**
     * create a new configuration
     */
    public Configuration() {}

    /**
     * add own symbols for the formatter
     * @param symbols string array in which every element is
     * @return the new configuration
     */
    public Configuration withSymbols(String[] symbols)
    {
        this.symbols = symbols;
        return this;
    }

    /**
     * add a own difference
     * a difference is the value between one symbol like 1000k is 1M
     * when difference is 1000
     * @param difference a double value which is the difference between all symbols
     * @return the new configuration
     */
    public Configuration withDiv(double difference)
    {
        this.difference = difference;
        return this;
    }

    /**
     * add your own currency
     * @param currency a string which contains the currency
     * @param atTheBegin true if the currency should be before the number, false if after the number
     * @return the new configuration
     */
    public Configuration withCurrency(String currency, boolean atTheBegin)
    {
        this.currency = currency;
        this.atTheBegin = atTheBegin;
        return this;
    }
}

