public class TestFactoryPattern {
    public static void main(String[] args) {
        // Create an order
        Order order = new Order();

        // Create observers
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        // Attach observers
        order.attach(priceObserver);
        order.attach(quantityObserver);

        // Add items and notify observers
        System.out.println("First addition:");
        order.addItem(190.0);
        order.addItem(100.0);
        order.addItem(300.0);
        order.addItem(300.0);
        order.addItem(300.0);




        // Detach QuantityObserver and make another change
        order.attach(quantityObserver);

        System.out.println("Second addition (after detaching QuantityObserver):");
        order.addItem(50.0);
    }
}