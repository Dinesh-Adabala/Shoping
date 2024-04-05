import java.util.Date;
import java.util.UUID;

public class CardService {
    Shop shop;
    CreditCard creditCard=new CreditCard();
        public CreditCard card(User user){
            creditCard.holderName= user.name;
            creditCard.bankName="State Bank Of India";
            creditCard.cardNo= "789789";
            creditCard.cvv= "123";
            creditCard.cardExpiry=new Date();
            creditCard.cardlLimt=50000;
            creditCard.avalibleBalance=50000;
            return creditCard;
        }

//        public void debitProcess(String cardNo ,OrderService orderService){
//            if (cardNo.equals(creditCard.cardNo)){
//                creditCard.avalibleBalance=creditCard.avalibleBalance-orderService.orderAmount;
//                System.out.println(creditCard.avalibleBalance);
//            }
//        }
    public void debitProcess(String cardNo ){
        if (cardNo.equals(creditCard.cardNo)){
            creditCard.avalibleBalance=creditCard.avalibleBalance-shop.amount;
            System.out.println(creditCard.avalibleBalance);
        }
    }
    }

