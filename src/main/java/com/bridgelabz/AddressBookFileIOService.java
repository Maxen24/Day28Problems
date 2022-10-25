package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//UC-14 Ability to Read/Write the Address Book with Persons Contact as CSV File

public class AddressBookFileIOService {


    public static String ADDRESS_FILE_NAME = "AddressBook-file.csv";

    public void writeData(List<Contacts> addressBookList) {
        System.out.println("Its Working");
        StringBuffer empBuffer = new StringBuffer();
        addressBookList.forEach(employee -> {
            String employeeDataString = employee.toString().concat("\n");
            empBuffer.append(employeeDataString);
        });

        try {
            Files.write(Paths.get(ADDRESS_FILE_NAME), empBuffer.toString().getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printData() {
        try {
            Files.lines(new File("AddressBook-file.csv").toPath()).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public long countEntries() {
        long entries = 0;
        try {
            entries = Files.lines(new File("AddressBook-file.csv").toPath()).count();
        } catch (IOException e) {

            e.printStackTrace();
        }
        return entries;

    }
}