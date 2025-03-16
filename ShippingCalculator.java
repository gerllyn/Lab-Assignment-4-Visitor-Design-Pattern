class ShippingCalculator implements ShippingCostVisitor {
    @Override
    public double calculateShipping(Chair chair) {
        return 10.0; // Flat rate for chairs
    }

    @Override
    public double calculateShipping(Table table) {
        return table.getArea() * 5; // Cost based on table size
    }

    @Override
    public double calculateShipping(Sofa sofa) {
        return sofa.getVolume() * 2 + sofa.getDistance() * 0.5; // Cost based on volume and distance
    }
}

