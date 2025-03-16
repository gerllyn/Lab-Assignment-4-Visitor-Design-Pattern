public class ECommercePlatform {
    public static void main(String[] args) {
        Furniture[] furnitureItems = {
                new Chair(5.0),
                new Table(10.0),
                new Sofa(15.0, 100.0)
        };

        ShippingCostVisitor shippingCalculator = new ShippingCalculator();

        for (Furniture item : furnitureItems) {
            System.out.println("Shipping cost: $" + item.accept(shippingCalculator));
        }
    }
}