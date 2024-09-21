
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private static final double HEARTY_MEAL = 4.3;
    private static final double AFFORDABLE_MEAL = 2.50;


    public PaymentTerminal() {
        this.money = 1000.0;
    }

    public double eatAffordably(double payment) {
        if (payment >= AFFORDABLE_MEAL) {
            this.money += AFFORDABLE_MEAL;
            affordableMeals++;
            return payment - AFFORDABLE_MEAL;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= AFFORDABLE_MEAL) {
            card.takeMoney(AFFORDABLE_MEAL);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        if (payment >= HEARTY_MEAL) {
            this.money += HEARTY_MEAL;
            heartyMeals++;
            return payment - HEARTY_MEAL;
        }
        return payment;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= HEARTY_MEAL) {
            card.takeMoney(HEARTY_MEAL);
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum <= money && sum > 0) {
            money += sum;
            card.addMoney(sum);
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
