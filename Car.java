public class Car {
    private String name, gender, birthdate, address, icn;
    
    public void setCustomerInfo(String nm, String gd, String ic, String bd, String add){
	name=nm;
        gender = gd;
        icn = ic;
        birthdate = bd;
        address = add;
    }
    public String getName(){
	    return name;
    }
    public String getGender(){
            return gender;
    }
    public String getIc(){
            return icn;
    }
    public String getBdate(){
            return birthdate;
    }
    public String getAddress(){
            return address;
    }
    public static void audi(){
        System.out.println("1) Audi");
    }
    public static void bmw(){
        System.out.println("2) BMW");
    }
    public static void honda(){
        System.out.println("3) Honda");
    }
    public static void mazda(){
        System.out.println("4) Mazda");
    }
}
