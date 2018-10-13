package ibm.cai.challenge.model;

import java.io.Serializable;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "users")
public class User implements Serializable{

    private static final long serialVersionUID = -3009157732242241606L;

    @Column(name = "firstname")
    @NotNull
    @Size(min = 2, max = 100)
    private String firstName;
    @NotNull
    @Column(name = "lastname")
    @Size(min = 2, max = 100)
    private String lastName;
    @NotNull
    @Column(name = "address")
    @Size(min = 2, max = 100)
    private String address;
    @Id
    @NotNull
    @Size(min = 2, max = 100)
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

    public void setUniqueID(String droneID){
        this.uniqueID = "FAA" + droneID;
    }

    public String getUniqueID(){
        return uniqueID;
    }
}