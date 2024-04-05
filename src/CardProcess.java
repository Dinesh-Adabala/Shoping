public class CardProcess {
    String cardNo = "789789";
   static double limit = 5000;
    public double paymentProcess(String cardNo,double itemAmount){

        if (this.cardNo.equals(cardNo) && itemAmount<=limit){
        this.limit = limit-itemAmount;
            System.out.println(limit);
        }
        return limit;
    }

    public double rePayProcess(String cardNo,double itemAmount){
        if (this.cardNo.equals(cardNo)){
            this.limit = limit+itemAmount;
            System.out.println(limit);
        }
        return limit;

    }
}
