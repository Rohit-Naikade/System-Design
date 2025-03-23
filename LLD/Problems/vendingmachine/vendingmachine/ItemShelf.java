package vendingmachine;

public class ItemShelf {

    int code;
    Item item;
    Boolean isSoldOut;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Boolean getSoldOut() {
        return isSoldOut;
    }

    public void setSoldOut(Boolean soldOut) {
        isSoldOut = soldOut;
    }
}
