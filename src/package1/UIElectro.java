package package1;

import java.util.Scanner;

public class UIElectro {
    public static int showMenuElectroCons() {
        System.out.println("Seleccione el tipo de consumo");
        int response = 0;

        do {
            System.out.println("1. Consumo tipo A (450.000)");
            System.out.println("2. Consumo tipo A (350.000)");
            System.out.println("3. Consumo tipo A (250.000)");

            Scanner entry = new Scanner(System.in);
            response = Integer.valueOf(entry.nextLine());
        } while (response < 0 && response < 4);

        return valueConsume(response);

    }

    public static int valueConsume(int respose){
        switch (respose){
            case 1:
                respose=450000;
                break;
            case 2:
                respose=350000;
                break;
            case 3:
                respose=250000;
                break;
        }
        return respose;
    }

    public static int showMenuElectroOrigin() {
        System.out.println("Seleccione la procedencia");
        int response = 0;

        do{
            System.out.println("1. Nacional (250.000)");
            System.out.println("2. Internacional (350.000)");
            //System.out.println("0. Salir/Generar Factura");

            Scanner entry = new Scanner(System.in);
            response = Integer.valueOf(entry.nextLine());

        } while (response < 0 && response < 3);

        return valueOrigin(response);
    }

    public static int valueOrigin(int respose){
        switch (respose){
            case 1:
                respose=250000;
                break;
            case 2:
                respose=350000;
                break;
        }
        return respose;
    }
}
