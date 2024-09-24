package emailapp;

import java.util.Scanner;
import java.util.Random;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private int mailcapacity = 500;
    private String alternateEmail;
    public String email;

    // constructor always will have name of class which in this case is Email
    // this refers to class level variables. The top variables

    public Email(String fname, String lname) {
        firstname = fname;
        lastname = lname;
        department = setDepartment();
        System.out.println(department);
        System.out.println("How long do you want your password to be");
        Scanner myObj1 = new Scanner(System.in);
        int passwordlength = myObj1.nextInt(); // Read user input
        password = randomPassword(passwordlength);
        System.out.println(password);
        email = generateEmail();

    }

    private String setDepartment() {
        System.out.println(
                "Enter the Department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code");
        Scanner myObj = new Scanner(System.in);
        // Create a Scanner object

        int departmentChoice = myObj.nextInt(); // Read user input
        if (departmentChoice == 1) {
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Development";
        } else if (departmentChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }

    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*";
        Random rand = new Random();
        StringBuilder sb1 = new StringBuilder("");
        for (int i = 0; i < length; i++) {
            int rand_int = rand.nextInt(71);
            sb1.append(passwordSet.charAt(rand_int));
        }
        String newpassword = sb1.toString();
        return newpassword.toUpperCase();

    }

    private String generateEmail() {
        String email;
        if (department == "") {
            email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@company.com";
        } else {
            email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + ".company.com";
        }
        return email;
    }

    public void setMailCapacity(int n) {
        mailcapacity = n;
    }

    public int getMailCapacity() {
        return mailcapacity;
    }

    public void setAlternateEmail(String s) {
        alternateEmail = s;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void changePassword(String password) {
        this.password = password;

    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstname + " " + lastname + "\nEMAIL: " + email + "\nMAILBOX CAPACITY: "
                + mailcapacity;
    }

}