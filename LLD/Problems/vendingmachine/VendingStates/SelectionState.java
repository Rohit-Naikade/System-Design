package VendingStates;

import vendingmachine.Coin;
import vendingmachine.Item;
import vendingmachine.VendingMachine;

import java.util.List;

public class SelectionState implements State{

    public SelectionState(){
        System.out.println("Vending machine is in Selection State!");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("First click on Product Selection button!");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you cannot insert coin in selection state!");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        Item item=machine.getInventory().getItem(codeNumber);

        int paidByUser=0;
        for(Coin coin: machine.getCoinList()){
            paidByUser+=coin.getValue();
        }

        if(paidByUser<item.getPrice()){
            System.out.println("Insufficient amount, product you selected has price: "+item.getPrice()+" and you paid: "+paidByUser);
            refundMoney(machine);
            throw new Exception("Insufficient amount!!");
        }else if(paidByUser>=item.getPrice()){
            if(paidByUser> item.getPrice()){
                getChange(paidByUser- item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine, codeNumber));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Returned the change in the coin dispense tray: "+returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you cannot dispense product in selection state!");
    }

    @Override
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Refunded full amount in coin dispense tray!");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("you cannot update inventory in selection state!");
    }
}
