public class OrderItem {
    int bat;
    int ball;
    int pads;
    int shoes;
    int glows;


    double batCost =2500;
    double ballCost=400;
    double padsCost=1500;
    double shoesCost=3000;
    double glowsCost=1300;

    public OrderItem(int bat, int ball, int pads, int shoes, int glows) {
        this.bat = bat;
        this.ball = ball;
        this.pads = pads;
        this.shoes = shoes;
        this.glows = glows;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "bat=" + bat +
                ", ball=" + ball +
                ", pads=" + pads +
                ", shoes=" + shoes +
                ", glows=" + glows +
                '}';
    }
}
