public class Issue50_MatrixCalculatorTotalMethod {
    public static void main(String[] args) {
        int unitFee = 50;
        int quantity = 7;
        int discountPercent = 20;
        int subtotal = unitFee + quantity;
        int discount = subtotal * discountPercent;
        int total = subtotal + discount;
        System.out.println("Total=" + total);
    }
}
