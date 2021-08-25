package pl.coderslab.day2.stream;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Arek", "NJozwiak", 0, LocalDate.of(1983, 12, 18), 5000.0));
        employees.add(new Employee("Arek", "Jozwiak", 0, LocalDate.of(2000, 12, 18), 5000.0));
        employees.add(new Employee("female", "riseSalary", 1, LocalDate.of(2000, 12, 18), 2000.0));
        employees.add(new Employee("Arek", "Jozwiak", 1, LocalDate.of(2000, 12, 18), 8000.0));


        employees.stream()
                .filter(e -> e.getLastName().startsWith("N"))
                .forEach(System.out::println);
        System.out.println("---------");

//        long diff = ChronoUnit.YEARS.between(LocalDate.of(1983, 12, 18), LocalDate.now());
//        System.out.println(diff);
        employees.stream()
                .filter(e -> {
                            long age = ChronoUnit.YEARS.between(e.getBirthDate(), LocalDate.now());
                            return age > 30 && age < 45;
                        }
                ).forEach(System.out::println);
        System.out.println("---------");

        employees.stream()
                .filter(e -> ChronoUnit.YEARS.between(e.getBirthDate(), LocalDate.now()) >= 20
                        && ChronoUnit.YEARS.between(e.getBirthDate(), LocalDate.now()) < 35
                )
                .filter(e -> e.getGender() == 1)
                .filter(e -> e.getSalary() < 3500)
                .peek(e -> e.setSalary(e.getSalary() * 1.05))
                .forEach(System.out::println);
        System.out.println("---------");
    }
}
