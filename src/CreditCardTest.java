public class CreditCardTest {

        public static void main(String[] args) {

            Address address = new Address();

            address.flatNo = 9 - 60;
            address.street = "xyz";
            address.area = "KPHB";
            address.pincode = 522501;

            User user = new User();
            user.name = "kanna";
            user.dateOfBirth = "14/06/2002";
            user.mobileNumber = 23456789;
            user.aadharNumber = 3879;
            user.panNumber = "BIY44";
            user.address = address;

            OrderItem orderItem = new OrderItem(1,3,1,1,2);
            OrderService orderService = new OrderService();
            orderService.orderProcess(orderItem);

            CardService cardService = new CardService();
            System.out.println(cardService.card(user));

          //  cardService.debitProcess("789789",orderService);
            CardService cardService1 = new CardService();
            cardService1.debitProcess("789789");
        }

    }

