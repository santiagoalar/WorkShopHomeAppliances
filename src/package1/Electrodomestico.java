package package1;

public class Electrodomestico {

    public int cons;
    public int origin;
    private int price = 0;

    public Electrodomestico(int cons, int origin){
        this.cons = cons;
        this.origin = origin;
        int basePrice = cons + origin;
        setPrice(basePrice);
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price += price;
    }

    public int getCons() {
        return cons;
    }

    public void setCons(int cons) {
        this.cons = cons;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }
}
