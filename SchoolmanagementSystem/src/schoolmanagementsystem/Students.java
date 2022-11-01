/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

/**
 *
 * @author macbookpro
 */
public class Students {
    String firstName,secondName,birthday,gender,joinIn,nationality;

    public Students(String firstName, String secondName, String birthday, String gender, String joinIn, String nationality) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.gender = gender;
        this.joinIn = joinIn;
        this.nationality = nationality;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getJoinIn() {
        return joinIn;
    }

    public String getNationality() {
        return nationality;
    }
    
    
}
