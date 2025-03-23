package VendingStates;

import vendingmachine.Coin;
import vendingmachine.Item;
import vendingmachine.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{

    public IdleState(){
        System.out.println("Vending machine is in Idle State!");
    }

    public IdleState(VendingMachine machine){
        System.out.println("Vending machine is in Idle State!");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("First click on inset coin button!");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You cannot insert voin in Idle State!");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You cannot choose product in Idle State!");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You cannot get change in Idle State!");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You cannot dispense product in Idle State!");
    }

    @Override
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You cannot get refunded amount in Idle State!");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) {
        machine.getInventory().addItem(item, codeNumber);
    }
}
