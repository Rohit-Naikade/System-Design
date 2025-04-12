import java.util.ArrayList;
import java.util.List;

public class CarRentalSystem {
    List<Store> stores;

    public CarRentalSystem(){
        stores=new ArrayList<>();
    }

    public Store getStore(String location) {
        for(Store store: stores){
            if(store.getLocation()==location){
                return store;
            }
        }

        return null;
    }

    public void addStore(Store store) {
        this.stores.add(store);
    }
}
