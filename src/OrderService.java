public class OrderService {
    OrderItem orderItem;
    double orderAmount;

    public OrderItem orderProcess( OrderItem orderItem){
        orderAmount = (orderItem.bat*orderItem.batCost) + (orderItem.ball*orderItem.ballCost)
                + (orderItem.glows*orderItem.glowsCost) + (orderItem.pads*orderItem.padsCost)
                + (orderItem.shoes*orderItem.shoesCost);
        System.out.println(orderItem);
        return orderItem;
    }
}
