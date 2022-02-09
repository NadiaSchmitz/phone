
public class Main {

	public static void main(String[] args) {
		
		Phone xiip = new Phone(1631512063, 100.15, "Xiaomi Mi10", "Nadia");
		Phone sank = new Phone(1296363511, 120.90, "Samsung Galaxy S20", "Michael");
		Phone sorg = new Phone(1314522250, 115.12, "Soni Xperia", "Paula");
		
		System.out.printf(" %10s   %7s %20s %10s", xiip.getNumber(), xiip.getWeight(), xiip.getModel(), xiip.getName());
		System.out.println();
		System.out.printf(" %10s   %7s %20s %10s", sank.getNumber(), sank.getWeight(), sank.getModel(), sank.getName());
		System.out.println();
		System.out.printf(" %10s   %7s %20s %10s", sorg.getNumber(), sorg.getWeight(), sorg.getModel(), sorg.getName());
		System.out.println();
		System.out.println();
		
		xiip.receiveCall(1631512063);
		sank.receiveCall(1296363511);
		sorg.receiveCall(1314522250);
		
		xiip.receiveCall(1631512063, "Michael");
		sank.receiveCall(1631512063, "Michael");
		sorg.receiveCall(1314522250, "Paula");
		
	}

}
