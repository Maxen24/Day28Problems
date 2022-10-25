package com.bridgelabz;

public class Contacts {
    int Id;
    String Name;
    String MobileNumber;
    String City;
    String Zipcode;

    public Contacts(Integer Id, String Name, String MobileNumber, String City, String Zipcode) {
        this.Id = Id;
        this.Name=Name;
        this.MobileNumber=MobileNumber;
        this.City=City;
        this.Zipcode=Zipcode;
    }

    @Override
    public String toString() {
        return "Contacts{}";
    }
}

