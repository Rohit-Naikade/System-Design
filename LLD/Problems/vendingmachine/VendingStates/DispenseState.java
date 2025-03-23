package VendingStates;

import vendingmachine.Coin;
import vendingmachine.Item;
import vendingmachine.ItemShelf;
import vendingmachine.VendingMachine;

import java.util.List;

public class DispenseState implements State{

    public DispenseState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Vending machine is in Dispense State!");
        dispenseProduct(machine, codeNumber);
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("you cannot insert coins in dispense state!");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("you cannot select product in dispense state!");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you cannot insert coins in dispense state!");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you cannot choose product in dispense state!");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you cannot get change in dispense state!");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed!");
        Item item=machine.getInventory().getItem(codeNumber);
        machine.getInventory().update(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you cannot refund amount in dispense state!");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("you cannot update inventory in dispense state!");
    }
}
