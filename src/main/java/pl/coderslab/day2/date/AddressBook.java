package pl.coderslab.day2.date;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AddressBook {

    public static void main(String[] args) {
        Optional<String> address = findAddressByName("Marek Marecki");
        if (address.isPresent()) {
            System.out.println(address.get());
        } else {
            System.out.println("brak");
        }
        Optional<String> nameByAddress = findNameByAddress("Kraków Polna 11");
        Optional<String> nameByAddress2 = findNameByAddress("Kraków Polna 111");
        System.out.println(nameByAddress.orElse("brak"));
        System.out.println(nameByAddress2.orElse("brak"));
    }

    private static final HashMap<String, String> phoneBookEntries = new HashMap<>();

    static {
        phoneBookEntries.put("Jan Kowalski", "Kraków Polna 11");
        phoneBookEntries.put("Marek Marecki", "016/161617");
    }

    public static Optional<String> findAddressByName(String name) {
        return Optional.ofNullable(phoneBookEntries.get(name));
    }

    public static Optional<String> findNameByAddress(String address) {
        return phoneBookEntries.entrySet()
                .stream()
                .filter(e -> address.equals(e.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();
    }
}
