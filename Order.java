public class Order {
    private String customerName;
    private String address;
    private double totalPrice;

    public Order(String customerName, String address, TotalCalculator calculator) {
        this.customerName = customerName;
        this.address = address;
    }

    public String getCustomerName() { return customerName; }
    public String getAddress() { return address; }
    public double getTotalPrice() { return totalPrice; }
}
