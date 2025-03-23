package vendingmachine;

public class Inventory {

    ItemShelf inventory[]=null;

    public Inventory(int count){
        inventory=new ItemShelf[count];
        initialEmptyInventory();
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    private void initialEmptyInventory() {

        int startCode=101;

        for(int i=0;i<inventory.length;i++){
            inventory[i]=new ItemShelf();
            inventory[i].setCode(startCode);
            inventory[i].setItem(null);
            inventory[i].setSoldOut(true);
            startCode++;
        }
    }

    public void addItem(Item item, int codeNumber ){
        for(ItemShelf itemShelf: inventory){
            if(itemShelf.getCode()==codeNumber && itemShelf.isSoldOut){
                itemShelf.setItem(item);
                itemShelf.setSoldOut(false);
            }else{
                System.out.println("Item is already present!");
            }
        }
    }

    public Item getItem(int codeNumber){
        for(ItemShelf itemShelf: inventory){
            if(itemShelf.getCode()==codeNumber){
                return itemShelf.getItem();
            }
        }

        System.out.println("Invalid Code");
        return null;
    }

    public void update(int codeNumber){
        for(ItemShelf itemShelf: inventory){
            if(itemShelf.getCode()==codeNumber){
                itemShelf.setSoldOut(true);
            }
        }

        System.out.println("Invalid Code");
    }


}
