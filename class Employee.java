class Employee {
    String name;
    String address;
    String designation;

    Employee(String name, String address, String designation) {
        this.name = name;
        this.address = address;
        this.designation = designation;
    }

    void displayInfo() {
        System.out.println("Name: " + name + "\nAddress: " + address + "\nDesignation: " + designation);
    }

    class NestedClass {
        String nestedAttribute;

        NestedClass(String nestedAttribute) {
            this.nestedAttribute = nestedAttribute;
        }

        void displayNestedInfo() {
            System.out.println("Nested Attribute: " + nestedAttribute);
        }
    }
}
class Manager extends Employee {
    String department;

    Manager(String name, String address, String designation, String department) {
        super(name, address, designation);
        this.department = department;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }

    // Overloaded method
    void extraMethod(String extraInfo) {
        System.out.println("Extra Information: " + extraInfo);
    }
}
class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", "123 Main St", "Software Engineer");
        employee1.displayInfo();

        Employee.NestedClass nestedInstance = employee1.new NestedClass("Nested Value");
        nestedInstance.displayNestedInfo();

        Manager manager1 = new Manager("Alice Smith", "456 Oak St", "Project Manager", "IT");
        manager1.displayInfo();

        manager1.extraMethod("Some additional info"); // Calling the overloaded method
    }
}
