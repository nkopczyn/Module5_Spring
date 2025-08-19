package pl.coderslab.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Optional<String> nameByAddress =
                addressBook.findNameByAddress("Kraków Polna 11");
        if (nameByAddress.isPresent()) {
            System.out.println("Znaleziono osobę: " + nameByAddress.get());
        } else {
            System.out.println("Nie znaleziono osoby o podanym adresie.");
        }
    }
}