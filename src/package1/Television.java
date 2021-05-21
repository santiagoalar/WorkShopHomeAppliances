package package1;

public class Television extends Electrodomestico {

    private int sizeTv;
    private boolean hasTdt;

    public Television(int cons, int origin) {
        super(cons, origin);
    }


    public void increaseCuzSize(int sizeTv){
        int newPrice=0;
        if(sizeTv>40){
            newPrice = (int) (getPrice()*0.30);
        }

        super.setPrice(newPrice);
    }

    public void increaseCuzTdt(boolean flag){
        if (flag) setPrice(250000);
    }

    public int getSizeTv() {
        return sizeTv;
    }

    public void setSizeTv(int sizeTv) {
        this.sizeTv = sizeTv;
    }

    public boolean isHasTdt() {
        return hasTdt;
    }

    public void setHasTdt(boolean hasTdt) {
        this.hasTdt = hasTdt;
    }
}
