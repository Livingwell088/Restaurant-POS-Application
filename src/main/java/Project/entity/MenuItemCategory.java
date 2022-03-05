package Project.entity;

public class MenuItemCategory {

    private String firstName;
    private String secondName;
    private int category;
    private String specialRequest;
    private int menuType;

    public MenuItemCategory(String firstName, String secondName, int category, String specialRequest, int menuType) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.category = category;
        this.specialRequest = specialRequest;
        this.menuType = menuType;
    }

    public MenuItemCategory() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    public int getMenuType() {
        return menuType;
    }

    public void setMenuType(int menuType) {
        this.menuType = menuType;
    }
}
