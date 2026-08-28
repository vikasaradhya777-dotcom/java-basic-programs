package DAY8;

import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class empl {

    String name;
    String department;
    int salary;

    empl(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " " + department + " " + salary;
    }
}

public class example {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<empl> employees = new ArrayList<>();

        System.out.println("Enter number of employees:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter name:");
            String name = sc.nextLine();

            System.out.println("Enter department:");
            String department = sc.nextLine();

            System.out.println("Enter salary:");
            int salary = sc.nextInt();
            sc.nextLine();

            employees.add(new empl(name, department, salary));
        }

        employees.sort(
            Comparator.comparing((empl e) -> e.department)
                .thenComparing(
                    (empl e) -> e.salary,
                    Comparator.reverseOrder()
                )
                .thenComparing(e -> e.name)
        );

        System.out.println("\nSorted Employees:");

        for (empl e : employees) {
            System.out.println(e);
        }

        sc.close();
    }
}