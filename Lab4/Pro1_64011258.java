/*Program# 1(Exercise 9.2 The Stock class) 
Following the example of the Circle class in Section 9.2, 
design a class named Stock that contains:
■A string data field named symbol for the stock’s symbol.
■A string data field named name for the stock’s name.
■A double data field named previousClosingPrice that stores the stock price for the previous day.
■A double data field named currentPrice that stores the stock price for the current time.
■A constructor that creates a stock with the specified symbol and name.
■A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice. 

Sample run :

Symbol: ORCL
Name: Oracle Coperation
Previous Closing Price: 34.5
Current Price: 34.35
Price Change: -0.434782608695648%*/
public class Pro1_64011258 {

    public static void main(String[] args) {

        Stock stock1 = new Stock("ORCL", "Oracle Coperation");
        stock1.setCurrentPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println("Symbol: " + stock1.getSymbol() + "\nName: " + stock1.getName());
        System.out.println("Previous Closing Price: " + stock1.getPreviousClosingPrice());
        System.out.println("Current Price: " + stock1.getCurrentPrice());
        System.out.println("Price Change: " + stock1.getChangePercent());
    }
}