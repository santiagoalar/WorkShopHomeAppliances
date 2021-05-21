package package1;

import java.util.Scanner;

import static package1.UIElectro.showMenuElectroCons;
import static package1.UIElectro.showMenuElectroOrigin;

public class UITelevision {
    public static Electrodomestico showMenuTelevision(){

        Television television = new Television(showMenuElectroCons(), showMenuElectroOrigin());

        television.setSizeTv(showMenuSizeTv());
        television.increaseCuzSize(television.getSizeTv());

        television.setHasTdt(showMenuHasTdt());
        television.increaseCuzTdt(television.isHasTdt());

        return television;
    }

    public static int showMenuSizeTv(){
        System.out.println("Enter size TV: ");
        int response = 0;
        do{
            Scanner entry = new Scanner(System.in);
            response = Integer.valueOf(entry.nextLine());
        }while (response < 0);

        return  response;
    }

    public static boolean showMenuHasTdt(){
        boolean response = false;
        if (displayOptionsTdt()==1)response=true;
        return  response;
    }

    public static int displayOptionsTdt(){
        int responseEntry = 2;
        Scanner entry = new Scanner(System.in);

        System.out.println("Does it include TDT?");
        do{
            System.out.println("1. Yes \n2. No ");
            responseEntry = Integer.valueOf(entry.nextLine());
        } while (responseEntry < 0 && responseEntry<3);
        return responseEntry;
    }
}
