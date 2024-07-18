public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getCount() > 5) {
            order.setShippingCost(0);
            System.out.println("QuantityObserver: Shipping cost set to zero. Current shipping cost: " + order.getShippingCost());
        } else {
            order.setShippingCost(10);
            System.out.println("QuantityObserver: Shipping cost set to $10. Current shipping cost: " + order.getShippingCost());
        }
    }
}
