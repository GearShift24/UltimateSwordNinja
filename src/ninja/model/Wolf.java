package ninja.model;

/**
 * 
 * @author Joe Wrigley
 *Created methods to create the objects within here, and give stats / moves.
 */

public class Wolf extends Enemies{

	

	public Wolf()
	{
		super("Wolf");
	}
	
	public Wolf(String name)
	{
		super(name);

		this.setHealth(32);
	}
	
	
	public int attack()
	{
		return 5;
	}
	
}
