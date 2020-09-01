# NumberFormatter
a small formatter program which formats a number into a smaller number where it also round the number. 

## examples
1.200 -> 1.2k
1.150 -> ~1.2k
1.000 -> 1k

# how to use it

## download 
clone the latest build from github `git clone https://www.github.com/chrisimi/NumberFormatter.git`. Then you have to update the project so that maven can download the dependencies and afterwards you use `maven clean install` to install the library in your local maven repository to use it

OR

download the jar from the latest release and include it within your project

## integration with maven
When you are finished with the first step then you have to integrate it in your plugin.

Maven:
```
<dependency>
  <groupId>com.chrisimi</groupId>
  <artifactId>numberformatter</artifactId>
  <version>1.0</version>
</dependency>
```

## integration in code

To use the library you simply have to use the following code 
```
double a = 1050.0;
String b = NumberFormatter.format(a); //b is ~1.1k
```

## configure the formatter

You can also configure the formatter with the 'Configuration' class (optional)

```
Configuration configuration = new Configuration()
    .withSymbols(String[] symbols) // add your own symbols (optional)
    .withDiv(double difference) //add your own difference between symbols
    .withCurrency(String currency, boolean atTheBegin) //add your own currency and say if the currency is before or after the number

```
