
public class Main {

    public static void main(String[] args) {

        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        PaymentTerminal uniCafeExactum = new PaymentTerminal();
        double change = uniCafeExactum.eatAffordably(10);
        System.out.println("remaining change: " + change);

        change = uniCafeExactum.eatAffordably(5);
        System.out.println("remaining change: " + change);

        change = uniCafeExactum.eatHeartily(4.3);
        System.out.println("remaining change: " + change);

        System.out.println(uniCafeExactum);

        PaymentCard annesCard = new PaymentCard(7);
        wasSuccessful = uniCafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money : " + wasSuccessful);
        wasSuccessful = uniCafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money : " + wasSuccessful);
        wasSuccessful = uniCafeExactum.eatAffordably(annesCard);
        System.out.println("there was enough money : " + wasSuccessful);
        System.out.println("money " + annesCard.balance());
        System.out.println(uniCafeExactum);

        uniCafeExactum.addMoneyToCard(annesCard, 10);
        System.out.println(uniCafeExactum);
        System.out.println("money " + annesCard.balance());

        uniCafeExactum.addMoneyToCard(annesCard, 1100);
        System.out.println(uniCafeExactum);
        System.out.println("money " + annesCard.balance());
    }
}

