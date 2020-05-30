import java.util.*;
public class Vehicle {
    public static void main(String[] args){
        String name, gender, bd, add, ic;
        int select, choice=0;
        Scanner in = new Scanner(System.in);
        Car c = new Car();
        Audic a = new Audic();
        Bmwc b = new Bmwc();
        Hondac h = new Hondac();
        Mazdac m = new Mazdac();
        
        do{
        System.out.println("Customer Registration Form");
        System.out.print("Name: ");
        name = in.next();
        System.out.print("Gender (Male/Female): ");
        gender = in.next();
        System.out.print("Identity Card Number: ");
        ic = in.next();
        System.out.print("Birth Date (D/M/Y): ");
        bd = in.next();
        System.out.print("Address: ");
        add = in.next();
        
        c.setCustomerInfo(name, gender, ic, bd, add);
        
        System.out.print("\n" + "1)Register" + "\n" + "2)Reset" + "\n" + "Select: ");
        select = in.nextInt();
        System.out.println("");        
        }while(select != 1);
        System.out.println("Name: " + c.getName());
        System.out.println("Gender: " + c.getGender());
        System.out.println("Identity Card Number: " + c.getIc());
        System.out.println("Birth Date: " + c.getBdate());
        System.out.println("Address: " + c.getAddress());
        
        do{
        System.out.println("");
        System.out.println("Information Center");
        System.out.println("Select Car Brand:");
        c.audi();
        c.bmw();
        c.honda();
        c.mazda();
        System.out.println("5) Exit");
        System.out.print("Select: ");
        select = in.nextInt();
        if(select == 1){
           do{
           System.out.println("");
           a.audi();
           choice = in.nextInt();
           if(choice == 1){
              System.out.println("");
              a.audia1();
           }
           else if(choice == 2){
                   System.out.println("");
                   a.audia3();
           }
           else if(choice == 3){
                   System.out.println("");
                   a.audiq2();
           }
           else if(choice == 4){
                   System.out.println("");
                   a.audiq3();
           }
           }while(choice == 1 || choice == 2 || choice == 3 || choice == 4);
        }
        else if(select == 2){
           do{
           System.out.println("");
           b.bmw();
           choice = in.nextInt();
           if(choice == 1){
              System.out.println("");
              b.bmw740();
           }
           else if(choice == 2){
                   System.out.println("");
                   b.bmwm850i();
           }
           else if(choice == 3){
                   System.out.println("");
                   b.bmwx7();
           }
           else if(choice == 4){
                   System.out.println("");
                   b.bmwz4();
           }
           }while(choice == 1 || choice == 2 || choice == 3 || choice == 4);
        }
        else if(select == 3){
           do{
           System.out.println("");
           h.honda();
           choice = in.nextInt();
           if(choice == 1){
              System.out.println("");
              h.hondahr();
           }
           else if(choice == 2){
                   System.out.println("");
                   h.hondacv();
           }
           else if(choice == 3){
                   System.out.println("");
                   h.hondacrz();
           }
           else if(choice == 4){
                   System.out.println("");
                   h.hondac();
           }
           }while(choice == 1 || choice == 2 || choice == 3 || choice == 4);
        }
        else if(select == 4){
           do{
           System.out.println("");
           m.mazda();
           choice = in.nextInt();
           if(choice == 1){
              System.out.println("");
              m.mazdab();
           }
           else if(choice == 2){
                   System.out.println("");
                   m.mazdacx9();
           }
           else if(choice == 3){
                   System.out.println("");
                   m.mazdabt();
           }
           else if(choice == 4){
                   System.out.println("");
                   m.mazdacx30();
           }
           }while(choice == 1 || choice == 2 || choice == 3 || choice == 4);
        }
        else if(select ==5){
                System.exit(0);
        }
        }while(choice != 1 || choice != 2 || choice != 3 || choice != 4);
    }
}
