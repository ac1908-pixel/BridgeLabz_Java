package objectOrientedProgramming.inheritance;

class Order {
    String orderId;
    String orderDate;

    // Constructor
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    String getOrderStatus() {
        return "Order Placed";
    }
}


class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // initialize Order fields
        this.trackingNumber = trackingNumber;
    }

    // Override getOrderStatus()
    @Override
    String getOrderStatus() {
        return "Order Shipped (Tracking No: " + trackingNumber + ")";
    }
}



class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor
    DeliveredOrder(String orderId, String orderDate,
                   String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Override getOrderStatus()
    @Override
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}



public class OrderTest {
    public static void main(String[] args) {

        Order order = new Order("ORD-101", "2024-01-10");
        ShippedOrder shipped = new ShippedOrder(
                "ORD-102", "2024-01-11", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder(
                "ORD-103", "2024-01-12", "TRK67890", "2024-01-15");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}

