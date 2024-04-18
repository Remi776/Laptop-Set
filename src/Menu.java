
import java.util.Map;
import java.util.Scanner;


public class Menu {
    private Scanner scanner;
    private LaptopManagementService laptopManagementService;

    {
        laptopManagementService = new LaptopManagementService();
    }

    public void start() {
        String userInput;
        do {
            System.out.println("Product catalog:\n");
            printLaptopsToConsole();
            System.out.println("Filter:\n1 - by brand\n2 - by colour\n3 - exit");
            userInput = getSelection();
            if (userInput.equals("1")) {
                System.out.println("Enter the brand name from the list: Apple, HP, Lenovo, Dell.");
                userInput = getSelection();
                laptopManagementService.filterByBrand(userInput);
            } else if (userInput.equals("2")) {
                System.out.println("Enter the color from the list: white, black, gold, grey.");
                userInput = getSelection();
                laptopManagementService.filterByColor(userInput);
            } else if (!userInput.equals("3")){
                System.out.println("Only 1, 2, 3 is allowed. Try one more time.\n");
            }
        } while (!userInput.equals("3"));
    }

    private void printLaptopsToConsole() {
        Map<Integer, Laptop> laptops = laptopManagementService.getLaptopSet();
        for (Map.Entry<Integer, Laptop> entry : laptops.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private String getSelection() {
        scanner = new Scanner(System.in);
        return scanner.next();
    }


}
