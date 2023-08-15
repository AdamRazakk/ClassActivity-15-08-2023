import java.util.Arrays;
//SuperClass (Parent)
public class Inheritance {
    public void AnimalTypes() {
        String[] SeaAnimal = {"Fish", "Prawn", "SeaHorse"};
        System.out.println(Arrays.toString(SeaAnimal));
    }
}

//SubClass (Child)
class Animals extends Inheritance { 
    public static void main(String[] args) {
        Animals AnimalTypes = new Animals();
        System.out.println("This is are the types of sea animals:");
        AnimalTypes.AnimalTypes();
    }
}
