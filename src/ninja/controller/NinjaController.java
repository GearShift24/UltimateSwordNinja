package ninja.controller;

/**
 * Joe Wrigley
 * partially modified - Todd Williamson
 * added imports, created ninja controller and made frame appear from todds frame!
 */
import javax.swing.JOptionPane;
import ninja.model.*;
import ninja.view.NinjaFrame;
import java.util.ArrayList;
import ninja.model.Hero;
import java.util.Random;
import ninja.view.*;
//10/10 love the name
//your narrator is very observant
public class NinjaController {

	private NinjaFrame ninjaFrame;
	public ArrayList<Enemies> enemyList;
	public ArrayList<Hero> heroList;

	private Random randomGenerator;
	public NinjaPanel basePanel;
	

//	 public int buttonDamage;
	
	
	public NinjaController()
	{
		enemyList = new ArrayList<Enemies>();
		heroList = new ArrayList<Hero>();
		buildEnemyList();
		buildHeroList();
		randomEnemyFromList();
		
		ninjaFrame = new NinjaFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(ninjaFrame, "welcome to SwordNinja!!!!, YOU ARE FIGHTING AN ENEMY GO AND GET EM CHAMP!");
		
		JOptionPane.showMessageDialog(ninjaFrame, "On Your adventure you found a " + enemyList.get(0).getName());
		buildEnemyList();
		
		buildHeroList();
		
		if(keepPlaying())
		{
			playGame("innitalNoDamage");	

		}
		else
		{
			JOptionPane.showMessageDialog(ninjaFrame, "YOU DIED, TRY AGAIN ANOTHER TIME");
		}

	}
	
	
	private void buildEnemyList()
	{ 
		enemyList.add(new Bear("Bear"));  //might be fixed when the enemies fully made
		enemyList.add(new Wolf("Wolf"));
		enemyList.add(new Samurai("Samurai"));
	}
	
	public Enemies randomEnemyFromList()
	{
		getEnemyList();
		Enemies currentEnemy = enemyList.get(0);
		
		int randomNumber = (int)(Math.random()*15);
		
		if(randomNumber <= 6)
		{
			currentEnemy = enemyList.get(1);
		}
		else if(randomNumber > 6 && randomNumber <= 12)
		{
			currentEnemy = enemyList.get(0);
		}
		else if(randomNumber > 12 && randomNumber <= 15)
		{
			currentEnemy = enemyList.get(2);
		}
		
		enemyList.set(0, currentEnemy);
		
		return currentEnemy;
	}
	
	public void buildHeroList()
	{
		heroList.add(new Ninja("Ninja"));
	}
	
	public ArrayList<Hero> getHeroList()
	{
		return heroList;
	}
	
	public NinjaFrame getNinjaFrame()
	{
		return ninjaFrame;
	}
	
	public ArrayList<Enemies> getEnemyList()
	{
		return enemyList;
	}
	
	public String getName()
	{
		String name = randomEnemyFromList().getName();
		
		return name;
	}
//	public String getName()
//	{
//		String name = enemyList.get(0).getName();
//		
//		return name;
//	}
	
	public boolean keepPlaying()
	{
		boolean play = true;
		
		Hero heroCurrent = heroList.get(0);
		
		if(heroCurrent.getPlayerHealth() <= 0)
		{
			play = false;
		}
		
		return play;
	}
	
	public int getAttack()
	{
		int damage = heroList.get(0).attack();
				
			return damage;
	}
	
	public int getRangedAttack()
	{
		int damage = heroList.get(0).rangeAttack();
		
		return damage;

	
	}
	
	public int getLuckyAttack()
	{
		int damage = heroList.get(0).luckyHit();
		
		return damage;
	}
	
	
	
	public void playGame(String attackType)
	{
		int damage = 0;
		if (attackType.equals("innitalNoDamage"))
		{
			damage = 0;
		}
		if (attackType.equals("lucky"))
		{
			damage = getLuckyAttack();
		}
		if (attackType.equals("attack"))
		{
			damage = getAttack();
		}
		if (attackType.equals("range"))
		{
			damage = getRangedAttack();
		}
		
		
			
				 if(keepPlaying())
				 {
					Hero currentHero = heroList.get(0);
			
					
					int buttonDamage = damage;// basePanel.buttonDamage;
					 		

//					int index = randomGenerator.nextInt(enemyList.size());
					Enemies currentEnemy = enemyList.get(0);
				
					
//					if(buttonPressed = true)	
					
						
					currentEnemy.setHealth(currentEnemy.getHealth() - buttonDamage); 

					 JOptionPane.showMessageDialog(ninjaFrame, "You hit the foe, and it has " + currentEnemy.getHealth() + " hp left!");
					 
						currentHero.setPlayerHealth(currentHero.getPlayerHealth() - currentEnemy.attack());
						 
						 JOptionPane.showMessageDialog(ninjaFrame, "The foe hit you and you have " + currentHero.getPlayerHealth() + " hp left!");
						 
						 
						 	if(currentEnemy.getHealth() <=0)
					 			{
						 		JOptionPane.showMessageDialog(ninjaFrame, "You killed him. You found nothing. :(");
						 		
						 		
								 JOptionPane.showMessageDialog(ninjaFrame, "You went home and rested");
								 currentHero.setPlayerHealth(30);
								 
								 JOptionPane.showMessageDialog(ninjaFrame, "You went to find another one");
								 
								 JOptionPane.showMessageDialog(ninjaFrame, "Close the game and try again, dont hit a dead body while its down :(");
					 			}
					
						 	
						 	
						 	 if(currentHero.getPlayerHealth() <= 0 )
							 {
								 JOptionPane.showMessageDialog(ninjaFrame, "You DIED and cant do anything, restart to try again.");
							 }	 	
				 }
				 
				
		}
	
	
//your GUI is pretty nice. i think the idea for ur game is pretty coool!! follow me on instagrame - psaineeraj
	//Are you planning on implementing a random drop?
}
