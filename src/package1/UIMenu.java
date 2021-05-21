package package1;

import java.util.ArrayList;
import java.util.Scanner;

import static package1.UITelevision.showMenuTelevision;

public class UIMenu {

    public static void showMenu(){
        System.out.println("Bienvenido a la comercializadora ElectriCasa! \nSeleccione una opción");
        int response = 0;
        do {
            System.out.println("1. Comprar televisor");
            System.out.println("2. Comprar nevera");
            System.out.println("3. Comprar electrodoméstico general");
            System.out.println("0. Salir/Generar Factura");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    response = 0;
                    shoppingCartUI(1);
                    break;
                case 2:
                    response = 0;
                    shoppingCartUI(2);
                    break;
                case 3:
                    response = 0;
                    shoppingCartUI(2);
                    break;

                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void shoppingCartUI(int deviceType) {
        // 1 Television
        // 2 Fridge
        // 3 general device
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();


        while (true){
            if(deviceType == 1){
                electrodomesticos.add(showMenuTelevision());
            }else if(deviceType == 2){
                //electrodomesticos.add(new Fridge());
            }else if(deviceType == 3){
                //electrodomesticos.add(new Electrodomestico());
            }

        }

    }

}
