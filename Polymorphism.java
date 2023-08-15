import java.util.Arrays;

//A class that will inherit later
class ElectronicStuff {
    public void phone() {
        String[] PhoneTypes = {"Asus", "Samsung", "Apple"};
        System.out.println("Phone Types: " + Arrays.toString(PhoneTypes));
    }

    public void laptop() {
        String[] LaptopTypes = {"Acer", "Asus", "Lenovo"};
        System.out.println("Laptop Types: " + Arrays.toString(LaptopTypes));
    }

    public void monitor() {
        String[] MonitorTypes = {"AOC", "HP", "Prism+"};
        System.out.println("Monitor Types: " + Arrays.toString(MonitorTypes));
    }
}

//Main Class
//The Polymorphism happen here
class Polymorphism {
    public static void main(String[] args) {
        ElectronicStuff ES = new ElectronicStuff();
        ES.phone();
        ES.laptop();
        ES.monitor();
    }
}
