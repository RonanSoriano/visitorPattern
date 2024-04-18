public interface TelcoSubscription {
    String accept(UsagePromo usagePromo, double price);
    String accept(UnliCallOffer unliCallOffer, boolean unliCallText);
}
