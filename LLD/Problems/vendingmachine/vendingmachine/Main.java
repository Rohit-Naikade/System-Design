package vendingmachine;

import VendingStates.State;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {
        VendingMachine machine=new VendingMachine();
        Scanner sc=new Scanner(System.in);
        System.out.println("********* Filling up inventory **********");
        fillInventory(machine);
        displayInventory(machine);

        State vendingMachineState=machine.getVendingMachineState();
        boolean shallContinue=true;
        while(shallContinue){
            displayMenu();
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    vendingMachineState=machine.getVendingMachineState();
                    vendingMachineState.clickOnInsertCoinButton(machine);
                    break;
                case 2:
                    System.out.println("Choose Coin:");
                    System.out.println("1.PENNY");
                    System.out.println("2.NICKEL");
                    System.out.println("3.DIME");
                    System.out.println("4.QUARTER");
                    int ch=sc.nextInt();
                    vendingMachineState=machine.getVendingMachineState();
                    if(ch==1){
                        vendingMachineState.insertCoin(machine, Coin.PENNY);
                    }else if(ch==2){
                        vendingMachineState.insertCoin(machine, Coin.NICKEL);
                    }else if(ch==3){
                        vendingMachineState.insertCoin(machine, Coin.DIME);
                    }else{
                        vendingMachineState.insertCoin(machine, Coin.QUARTER);
                    }
                    break;
                case 3:
                    vendingMachineState=machine.getVendingMachineState();
                    vendingMachineState.clickOnStartProductSelectionButton(machine);
                    break;
                case 4:
                    vendingMachineState=machine.getVendingMachineState();
                    displayInventory(machine);
                    System.out.println("Select Code Number:");
                    int num=sc.nextInt();
                    vendingMachineState.chooseProduct(machine,num);
                    break;
                case 5:
                    displayInventory(machine);
                    break;
                case 6:
                    shallContinue=false;
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("******** Vending Machine Menu **********");
        System.out.println("1.Click on insert coin button.");
        System.out.println("2.Insert coins.");
        System.out.println("3.Click on select product button.");
        System.out.println("4.Choose Product.");
        System.out.println("5.Print Inventory.");
        System.out.println("4.Exit.");
    }

    private static void displayInventory(VendingMachine machine) {
        ItemShelf[] slots = machine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {

            System.out.println("CodeNumber: " + slots[i].getCode() +
                    " Item: " + slots[i].getItem().getType().name() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].isSoldOut);
        }

    }

    private static void fillInventory(VendingMachine machine) {
        ItemShelf[] slots=machine.getInventory().getInventory();

        for(int i=0;i<slots.length;i++){
            Item newItem = new Item();
            if(i >=0 && i<3) {
                newItem.setType(ItemType.COKE);
                newItem.setPrice(12);
            }else if(i >=3 && i<5){
                newItem.setType(ItemType.PEPSI);
                newItem.setPrice(9);
            }else if(i >=5 && i<7){
                newItem.setType(ItemType.JUICE);
                newItem.setPrice(13);
            }else if(i >=7 && i<10){
                newItem.setType(ItemType.SODA);
                newItem.setPrice(7);
            }
            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);

        }
    }
}
