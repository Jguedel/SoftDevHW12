
public class CakeFactory {
	public Cake orderCake(String type) {
		if (type.equals("vanilla"))
			return new VanillaCake();
		else if (type.equals("chocolate"))
			return new ChocolateCake();
		else if (type.equals("red velvet"))
			return new RedVelvet();
		else
			return new LemonCake();
	}
}
