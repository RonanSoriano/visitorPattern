public class UnliCallTextPackage implements UnliCallOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (unliCallText) {
            return telcoName + " unlimited calls and text package";
        } else {
            return telcoName + " does not offer unlimited calls and text package";
        }
    }
}