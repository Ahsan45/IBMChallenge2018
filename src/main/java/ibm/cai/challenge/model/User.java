package ibm.cai.challenge.model;

import java.util.Random;

public class User{
    private String firstName;
    private String lastName;
    private String address;
    private String droneID;
    private String uniqueID;

    public void setFirstName(String name){
        this.firstName = name;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setDroneID(String droneID){
        this.droneID = droneID;
    }

    public String getDroneID(){
        return droneID;
    }

    public void setUniqueID(){
        Random rand = new Random();
        uniqueID = String.format("%09d", rand.nextInt(10000000) + 1);
    }

    public String getUniqueID(){
        return uniqueID;
    }
}