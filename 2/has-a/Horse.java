public class Horse extends Animal {
    private Halter myHalter;
    public void tie(LeadRope rope){
        myHealter.tie(rope); // Delegate tie behavior to the Halter object
    }
}