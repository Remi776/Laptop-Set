import java.util.*;

public class LaptopManagementService {
    private static Map<Integer, Laptop> laptopSet;

    static {
        initLaptops();
    }

    public LaptopManagementService() {
    }

    private static void initLaptops() {
         laptopSet = new HashMap<>(Map.of(
                 1, new Laptop(Brand.APPLE, Colour.BLACK, "MacbookPro", 1100),
                 2, new Laptop(Brand.APPLE, Colour.BLACK, "MacbookPro", 1100),
                 3, new Laptop(Brand.HP, Colour.WHITE, "Dragonfly G4", 950),
                 4, new Laptop(Brand.LENOVO, Colour.GREY, "Legion Pro 5", 1200),
                 5, new Laptop(Brand.DELL, Colour.GOLD, "Alienware", 1320),
                 6, new Laptop(Brand.DELL, Colour.WHITE, "Inspiron", 1000)
         ));
    }

    public Map<Integer, Laptop> getLaptopSet() {
        return laptopSet;
    }

    public void filterByBrand(String userInput){
        for(Map.Entry<Integer, Laptop> entry : laptopSet.entrySet()){
            if (entry.getValue().getBrand().equals(Brand.valueOf(userInput.toUpperCase()))){
                System.out.println(entry.getValue());
            }
        }
    }

    public void filterByColor(String userInput){
        for(Map.Entry<Integer, Laptop> entry : laptopSet.entrySet()){
            if (entry.getValue().getColour().equals(Colour.valueOf(userInput.toUpperCase()))){
                System.out.println(entry.getValue());
            }
        }
    }
}
