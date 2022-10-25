package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO
    }

    private List<Contacts> addressBookList;

    public AddressBook(List<Contacts> addressBookList) {
        this.addressBookList = addressBookList;
    }

    private void readContacts(Scanner consoleInputReader) {

        System.out.println("Enter the Id : ");
        int Id = consoleInputReader.nextInt();
        System.out.println("Enter the Name : ");
        String Name = consoleInputReader.next();
        System.out.println("Enter the Mobile Number : ");
        String MobileNumber = consoleInputReader.next();
        System.out.println("Enter the City Name : ");
        String City= consoleInputReader.next();
        System.out.println("Enter the Zipcode : ");
        String Zipcode= consoleInputReader.next();

        addressBookList.add(new Contacts(Id, Name, MobileNumber, City, Zipcode));
    }

    private void writeContacts(IOService ioService) {
        if (ioService.equals(IOService.CONSOLE_IO)){
            System.out.println("\nWriting Employee Payroll Roster to Console\n" + addressBookList);
        }
        else if (ioService.equals(IOService.FILE_IO)){
            new AddressBookFileIOService().writeData(addressBookList);
        }



    }

    public static void main (String[]args){

        System.out.println("---------- Welcome To Address Book Application ----------\n");
        ArrayList<Contacts> employeePayrollList = new ArrayList<Contacts>();
        AddressBook employeePayrollService = new AddressBook(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);

        employeePayrollService.readContacts(consoleInputReader);
        employeePayrollService.writeContacts(IOService.FILE_IO);

    }

}

