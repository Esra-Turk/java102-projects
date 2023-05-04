import Store.PatikaStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Store.PatikaStore Products.Product Management Panel !\n" +
                "1 - Notebook Transactions\n" +
                "2 - Phone Transactions\n" +
                "3 - List Brand\n" +
                "0 - Sign Out");

        while(true){
            Scanner scan = new Scanner(System.in);
            int selected = scan.nextInt();

            switch (selected) {
                case 0 -> System.exit(0);
                case 1 -> PatikaStore.listProducts(PatikaStore.addNotebook());
                case 2 -> PatikaStore.listProducts(PatikaStore.addPhone());
                case 3 -> PatikaStore.listTradeMark();
                default -> System.out.println("Invalid.try again");

            }

        }

    }
}