
public class TestCookie {

	public static void main(String[] args) {
		MasterOrder goodies = new MasterOrder(); 
		goodies.addOrder(new CookieOrder("Chocolate Chip", 1)); 
		goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
		goodies.addOrder(new CookieOrder("Shortbread", 5)); 
		goodies.addOrder(new CookieOrder("Macaroon", 2)); 
		System.out.println(goodies.getTotalBoxes());
		goodies.removeVariety("Chocolate Chip");
		System.out.println(goodies);
	}
}