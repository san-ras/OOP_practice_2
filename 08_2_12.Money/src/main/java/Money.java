
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros(), this.cents + addition.cents());
    }

    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros()) {
            return false;
        } else if (this.euros < compared.euros()) {
            return true;
        }
        return this.cents < compared.cents();
    }


    public Money minus(Money decreaser) {
        int totalEuros = this.euros - decreaser.euros();
        int totalCents = this.cents - decreaser.cents();
        if (totalCents < 0) {
            totalEuros--;
            totalCents += 100;
        }
        if ((totalEuros * 100 + totalCents) <= 0) {
            return new Money(0, 0);
        }
        return new Money(totalEuros, totalCents);
    }
}
