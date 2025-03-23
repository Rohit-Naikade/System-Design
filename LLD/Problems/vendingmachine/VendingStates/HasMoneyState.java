package VendingStates;

import vendingmachine.Coin;
import vendingmachine.Item;
import vendingmachine.VendingMachine;

import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState(){
        System.out.println("Currently vending machine is in has money state!");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        return;
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accepted a coin:");
        machine.getCoinList().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("First click on Product Selection button!");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You cannot get change in hasMoney State!");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You cannot dispense product in hasMoney State!");
    }

    @Override
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Returned full amount back in the coin dispense tray!");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("You cannot update inventory in hasMoney State!");
    }
}
