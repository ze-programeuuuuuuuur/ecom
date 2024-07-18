import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderObserver> observers = new ArrayList<>();
    private double totalPrice;
    private int count;
    private double shippingCost = 10.0;

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getCount() {
        return count;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void addItem(double price) {
        this.totalPrice += price;
        this.count++;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Order{totalPrice=" + totalPrice + ", count=" + count + ", shippingCost=" + shippingCost + '}';
    }
}