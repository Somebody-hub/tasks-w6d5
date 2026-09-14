import model.*;
import service.*;

public class Main {
    public static void main(String[] args) {
        ItemService<Item> itemService = new ItemService<>();
        itemService.addItem(new Weapon("Warhammer", ItemType.HAMMER, 6.5, 150.0, 55));
        itemService.addItem(new Weapon("Axe", ItemType.AXE, 0.4, 30.0, 12));
        itemService.addItem(new Weapon("Iron Sword", ItemType.SWORD, 3.2, 85.0, 35));
        itemService.addItem(new Weapon("Iron Sword", ItemType.SWORD, 3.2, 85.0, 35));
        itemService.addItem(new Armor("Wooden Shield", ItemType.SHIELD, 4.5, 20.0, 18));
        itemService.addItem(new Armor("Wooden Shield", ItemType.SHIELD, 4.5, 20.0, 18));
        System.out.println(itemService.sortByPrice());
        System.out.println(itemService.findMinWeightItem());
        System.out.println(itemService.typesItems());
        System.out.println();
        EmployeeService<Employee> employeeService = new EmployeeService<>();
        employeeService.addEmployee(new Developer(1, "Nick", 100.0, "Java"));
        employeeService.addEmployee(new Developer(2, "Bob", 110.0, "C++"));
        employeeService.addEmployee(new Manager(3, "Sam", 70.0, 100.0));
        employeeService.addEmployee(new Manager(4, "Rayon", 80.0, 50.0));
        System.out.println(employeeService.getEmpById(2).getName());
    }
}
