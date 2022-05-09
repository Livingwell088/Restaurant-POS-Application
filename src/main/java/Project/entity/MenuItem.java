package Project.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class MenuItem {

    private String itemID;
    private String itemNumber;
    private String firstName;
    private String secondName;
    private int category;
    private String specialRequest;
    private String specialRequestItem;
    private boolean fixedPrice;
    private int printerSetting;
    private LocalDate dateNotAvailable;
    private LocalTime timeNotAvailable;
    private int color;
    private double price0;
    private double price1;
    private double price2;
    private double price3;
    private double price4;
    private double price5;

    public MenuItem(
            String itemID,
            String itemNumber,
            String firstName,
            String secondName,
            int category,
            String specialRequest,
            String specialRequestItem,
            boolean fixedPrice,
            int printerSetting,
            LocalDate dateNotAvailable,
            LocalTime timeNotAvailable,
            int color,
            double price0,
            double price1,
            double price2,
            double price3,
            double price4,
            double price5) {
        this.itemID = itemID;
        this.itemNumber = itemNumber;
        this.firstName = firstName;
        this.secondName = secondName;
        this.category = category;
        this.specialRequest = specialRequest;
        this.specialRequestItem = specialRequestItem;
        this.fixedPrice = fixedPrice;
        this.printerSetting = printerSetting;
        this.dateNotAvailable = dateNotAvailable;
        this.timeNotAvailable = timeNotAvailable;
        this.color = color;
        this.price0 = price0;
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
        this.price4 = price4;
        this.price5 = price5;
    }

    public MenuItem() {}

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

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

    public String getSpecialRequestItem() {
        return specialRequestItem;
    }

    public void setSpecialRequestItem(String specialRequestItem) {
        this.specialRequestItem = specialRequestItem;
    }

    public boolean isFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(boolean fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    public int getPrinterSetting() {
        return printerSetting;
    }

    public void setPrinterSetting(int printerSetting) {
        this.printerSetting = printerSetting;
    }

    public LocalDate getDateNotAvailable() {
        return dateNotAvailable;
    }

    public void setDateNotAvailable(LocalDate dateNotAvailable) {
        this.dateNotAvailable = dateNotAvailable;
    }

    public LocalTime getTimeNotAvailable() {
        return timeNotAvailable;
    }

    public void setTimeNotAvailable(LocalTime timeNotAvailable) {
        this.timeNotAvailable = timeNotAvailable;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public double getPrice0() {
        return price0;
    }

    public void setPrice0(double price0) {
        this.price0 = price0;
    }

    public double getPrice1() {
        return price1;
    }

    public void setPrice1(double price1) {
        this.price1 = price1;
    }

    public double getPrice2() {
        return price2;
    }

    public void setPrice2(double price2) {
        this.price2 = price2;
    }

    public double getPrice3() {
        return price3;
    }

    public void setPrice3(double price3) {
        this.price3 = price3;
    }

    public double getPrice4() {
        return price4;
    }

    public void setPrice4(double price4) {
        this.price4 = price4;
    }

    public double getPrice5() {
        return price5;
    }

    public void setPrice5(double price5) {
        this.price5 = price5;
    }
}
