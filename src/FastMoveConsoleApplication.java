
import base.Bike;
import data.ToyData;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author praisan
 */
public class FastMoveConsoleApplication {

    Scanner sc = new Scanner(System.in);

    public void menu() {
        boolean exit = false;
        do {
            System.out.println("MENU");
            System.out.println("1.Add Bike");
            System.out.println("2.Add Person");
            System.out.println("3.Add Parcel");
            System.out.println("0.Exit");
            switch (getNumberFromKeyboard()) {
                case 1: addBike();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    exit = !exit;
                    break;
            }
        } while (!exit);
    }

    public Bike addBike() {
        return new Bike(sc.nextLine(), getNumberFromKeyboard());
    }

    public int getNumberFromKeyboard() {
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("it's not integer insert again");
        }
        return sc.nextInt();
    }
}
