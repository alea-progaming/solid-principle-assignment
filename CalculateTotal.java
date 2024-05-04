
public class CalculateTotal implements TotalCalculator{
	@Override
    public double calculateTotal(double price, int quantity) {
		return price * quantity;
    }
}
