class Light {
	static int counter;
    int noOfWatts = 100;
	boolean indicator;
	String location;
	public static void main(String[] args) {
	Light bulb = new Light();
	System.out.println("Static variable counter: " + Light.counter);
    System.out.println("Instance variable noOfWatts: " + bulb.noOfWatts);
    System.out.println("Instance variable indicator: " + bulb.indicator);
    System.out.println("Instance variable location: " + bulb.location);
    return;
}
}
