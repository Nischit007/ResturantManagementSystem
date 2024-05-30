import java.util.ArrayList;
import java.util.List;

public class Menu {
    
    private int menuID;
    private String name;
    private String purpose;
    private String venue;
    private String sessionTime;
    private List<MenuItem> menuItems;

    public Menu() {
        this.menuID = 0;
        this.name = "unknown";
        this.purpose = "unknown";
        this.venue = "unknown";
        this.sessionTime = "unknown";
        this.menuItems = new ArrayList<>();
    }

    public Menu(int menuID, String name, String purpose, String venue, String sessionTime) {
        this.menuID = menuID;
        this.name = name;
        this.purpose = purpose;
        this.venue = venue;
        this.sessionTime = sessionTime;
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(int number, String name, String description, double price) {
        menuItems.add(new MenuItem(number, name, description, price));
    }

    public void removeMenuItem(int number) {
        menuItems.removeIf(menuItem -> menuItem.getItemNumber() == number);
    }

    public void displayMenuItems() {
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem);
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu ID: ").append(menuID).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Purpose: ").append(purpose).append("\n");
        sb.append("Venue: ").append(venue).append("\n");
        sb.append("Session Time: ").append(sessionTime).append("\n");
        sb.append("Menu Items:\n");
        for (MenuItem menuItem : menuItems) {
            sb.append(menuItem).append("\n");
        }
        return sb.toString();
    }
}