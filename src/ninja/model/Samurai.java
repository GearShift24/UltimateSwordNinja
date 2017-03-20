package ninja.model;
/**
 * 
 * @author Joe Wrigley
 *Created methods to create the objects within here, and give stats / moves.
 */
public class Samurai extends Enemies{

	
	public Samurai()
	{
		super("Samurai");
	}
	
	public Samurai(String name)
	{
		super(name);
		this.setHealth(67);
	}
	
	
	
	public int attack()
	{
		return (int) (Math.random() * 20) + 1;
		
	}
	
}
