package exercise14;

public class ObserverPatternDemo {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        System.out.println("Updating Cognizant Stock Price...");
        stockMarket.setStock("Cognizant", 3850.75);

        System.out.println();

        System.out.println("Removing Web App Observer...");
        stockMarket.removeObserver(web);

        System.out.println();

        System.out.println("Updating Infosys Stock Price...");
        stockMarket.setStock("Infosys", 1625.50);
    }
}