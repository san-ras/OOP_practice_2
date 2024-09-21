
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int finalPrice = this.squares * this.princePerSquare;
        int finalPriceCompared = compared.squares * compared.princePerSquare;
        if (finalPrice > finalPriceCompared) {
            return finalPrice - finalPriceCompared;
        } else if (finalPriceCompared > finalPrice) {
            return finalPriceCompared - finalPrice;
        }
        return 0;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return this.squares * this.princePerSquare > compared.squares * compared.princePerSquare;
    }


}
