package behaviral.command;

public class Main {
    public static void main(String[] args){
        Stock stock = new Stock();

        BuyStock buyStockOrder = new BuyStock(stock);
        BuyStock sellStockOrder = new BuyStock(stock);

        Broker broker= new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
    }

}
