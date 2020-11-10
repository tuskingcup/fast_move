package data;

import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        bikes[0]=new Bike("AA001", 1);
        bikes[1]=new Bike("AA002", 2);
        bikes[2]=new Bike("AA003", 3);
        
        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code
        person[0]=new Person("RAPEEPAT","KLAMJEEN");
        person[1]=new Person("Apiwat","Atittieng");
        person[2]=new Person("CHOKPUTWEE","POOLCHAKO");
        
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        // your code
parcels[1]=new Parcel(10, ParcelStatus.SHIPPING,new Location(120, 120));
parcels[2]=new Parcel(10, ParcelStatus.SHIPPING,new Location(120, 120));
parcels[3]=new Parcel(10, ParcelStatus.SHIPPING,new Location(120, 120));
parcels[4]=new Parcel(10, ParcelStatus.SHIPPING,new Location(120, 120));
parcels[5]=new Parcel(10, ParcelStatus.SHIPPING,new Location(120, 120));
parcels[6]=new Parcel(10, ParcelStatus.SHIPPING,new Location(120, 120));
parcels[7]=new Parcel(10, ParcelStatus.SHIPPING,new Location(120, 120));
parcels[8]=new Parcel(10, ParcelStatus.SHIPPING,new Location(120, 120));
parcels[9]=new Parcel(10, ParcelStatus.SHIPPING,new Location(120, 120));
parcels[10]=new Parcel(10, ParcelStatus.SHIPPING,new Location(120, 120));
        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
