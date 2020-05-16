public class Test {
    public static void main(String[] args) {
        AirTrafficControl controller = new AirTrafficControlImpl();
        Aircraft a1 = new Aircraft("1234", controller);
        Aircraft a2 = new Aircraft("2345", controller);
        Aircraft a3 = new Aircraft("3456", controller);
        Aircraft a4 = new Aircraft("4567", controller);
        a1.setAltitude(1000);
        a2.setAltitude(100);
        a3.setAltitude(200);
        a4.setAltitude(100);
    }
}
