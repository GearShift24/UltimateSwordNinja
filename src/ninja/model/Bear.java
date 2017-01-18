package ninja.model;
import ninja.view.*;
/**
 * 
 * @author Joe Wrigley
 *Created methods to create the objects within here, and give stats / moves.
 */
public class Bear extends Enemies 
{

	public Bear()
	{
		super("Bear");
	}
	
	public Bear(String name)
	{
		super(name);
		this.setHealth(25);
	}
	
	public int gnaw()
	{
		return 1;

		
		//display this with words on the field frame that you are making
	}
	
	public int pounds()
	{
		return this.getHealth() * (1/2);
		//display this with words on the field frame that you are making
	}
	
	
}
