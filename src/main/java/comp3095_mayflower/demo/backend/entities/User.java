/**************************************************************************************************
 * Project: <COMP3095_mayflower>
 * Assignment: < assignment #2 >
 * Author(s): <Esther Kim, Beatriz Morales, Alan Pintor, Afsana Bilkis-Ritu>
 * Student Number: <101125413,101159722,101136369,101165654>
 * Date: 2020-11-08
 * Description: This is the class for the User entity, which is what will be mapped to the database.
 It contains all of the fields required and the ID is auto generated for ease of use.
 ***************************************************************************************************/

package comp3095_mayflower.demo.backend.entities;

import comp3095_mayflower.demo.backend.entities.CreditProfile;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstname;
    private String lastname;
    private String address;
    private String email;
    private String password;
    private String role;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
    private List<CreditProfile> creditprofile = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
    private List<UserProfile> userprofile = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
    private List<Messages> messages = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, mappedBy="user")
    private AdminProfile adminprofile;

    public User() {
    }

    public User(String firstname, String lastname, String address, String email, String password, String role) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return String.format("User[id=%d, firstname='%s', lastname='%s', address='%s', email='%s',password='%s']",
                id, firstname, lastname, address, email, password);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

