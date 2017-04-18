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
		this.setMaxHealth(32);
	}
	
	
	public int attack()
	{
		int i = (int) Math.random() * 1;
		
		if( i == 0)
				{
			return 6;
				}
		else
		{
			return 9;
		}
		
	}
	
}
