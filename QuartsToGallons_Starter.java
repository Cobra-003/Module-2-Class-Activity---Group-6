public class QuartsToGallons_Starter {
    public static void main(String[] args) {

        final int QUARTS_PER_GALLON = 4;
        int totalQuartsNeeded = 18;

        int fullGallons = totalQuartsNeeded / QUARTS_PER_GALLON;
        int remainingQuarts = totalQuartsNeeded % QUARTS_PER_GALLON;

        int gallonsToBuy = fullGallons;
        if (remainingQuarts != 0) {
            gallonsToBuy = fullGallons + 1;
        }

        System.out.println("Paint Job Report");
        System.out.println("----------------");
        System.out.println("Quarts needed: " + totalQuartsNeeded);
        System.out.println("Exact conversion: " + fullGallons + " gallons plus " + remainingQuarts + " quarts.");
        System.out.println("Gallons to purchase: " + gallonsToBuy);

        System.out.println();
        System.out.println("A job that needs " + totalQuartsNeeded + " quarts requires "
                + fullGallons + " gallons plus " + remainingQuarts + " quarts.");
    }
}