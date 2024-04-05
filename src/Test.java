public class Test {
    public static void main(String[] args) {
        CardProcess cardProcess = new CardProcess();
        cardProcess.paymentProcess("789789",500);

        CardProcess cardProcess1 = new CardProcess();
        cardProcess1.paymentProcess("789789",500);


        CardProcess cardProcess2 = new CardProcess();
        cardProcess2.rePayProcess("789789",500);

        CardProcess cardProcess3 = new CardProcess();
        cardProcess3.paymentProcess("789789",500);




    }


}
