package ninja.view;


import ninja.controller.NinjaController;

import javax.swing.*;

import java.awt.Color;

import java.awt.Dimension;

import java.awt.event.*;

import ninja.model.*;

/**

 * 

 * @author Todd Williamson

 *

 */



public class NinjaPanel extends JPanel

{

private NinjaController baseController;

private SpringLayout baseLayout;

private JButton attackButton;

private JButton luckyAttackButton;

private JButton rangeAttackButton;

private JLabel attackLabel;

private JTextArea reactionDisplay;

private JTextArea enemyDisplay;

private JLabel heroHealthLabel;

private JLabel enemyHealthLabel;




public NinjaPanel(NinjaController baseController)

{

this.baseController = baseController;

this.baseLayout = new SpringLayout();

this.attackButton = new JButton("Attack");

this.rangeAttackButton = new JButton("Range Attack");

this.luckyAttackButton = new JButton("Lucky Attck");

this.attackLabel = new JLabel("Use: ");

this.reactionDisplay = new JTextArea(5, 25);

this.enemyDisplay = new JTextArea(5, 25);

this.enemyHealthLabel = new JLabel(baseController.getName() + " Max Health: " + baseController.enemyList.get(0).getHealth());

this.heroHealthLabel = new JLabel("Your Max Health: " + baseController.heroList.get(0).getPlayerHealth());


setupPanel();

setupLayout();

setupListeners();

}


private void setupPanel()

{

this.setLayout(baseLayout);

setPreferredSize(new Dimension(900,600));

this.setBackground(Color.gray);

this.reactionDisplay.setEditable(false);

this.enemyDisplay.setEditable(false);

this.add(attackButton);

this.add(rangeAttackButton);

this.add(luckyAttackButton);

this.add(attackLabel);

this.add(reactionDisplay);

this.add(enemyDisplay);

this.add(heroHealthLabel);

this.add(enemyHealthLabel);



}


private void setupLayout()

{

baseLayout.putConstraint(SpringLayout.WEST, attackButton, 10, SpringLayout.WEST, this);

baseLayout.putConstraint(SpringLayout.NORTH, enemyDisplay, 61, SpringLayout.NORTH, this);

baseLayout.putConstraint(SpringLayout.EAST, enemyDisplay, 0, SpringLayout.EAST, reactionDisplay);

baseLayout.putConstraint(SpringLayout.NORTH, attackButton, 0, SpringLayout.NORTH, rangeAttackButton);

baseLayout.putConstraint(SpringLayout.NORTH, rangeAttackButton, 0, SpringLayout.NORTH, luckyAttackButton);

baseLayout.putConstraint(SpringLayout.EAST, rangeAttackButton, -6, SpringLayout.WEST, luckyAttackButton);

baseLayout.putConstraint(SpringLayout.WEST, luckyAttackButton, 234, SpringLayout.WEST, this);

baseLayout.putConstraint(SpringLayout.SOUTH, luckyAttackButton, -154, SpringLayout.SOUTH, this);

baseLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, attackButton);

baseLayout.putConstraint(SpringLayout.SOUTH, attackLabel, -6, SpringLayout.NORTH, attackButton);

baseLayout.putConstraint(SpringLayout.NORTH, reactionDisplay, 6, SpringLayout.SOUTH, attackButton);

baseLayout.putConstraint(SpringLayout.WEST, reactionDisplay, 10, SpringLayout.WEST, attackButton);

baseLayout.putConstraint(SpringLayout.WEST, enemyHealthLabel, 22, SpringLayout.WEST, this);

baseLayout.putConstraint(SpringLayout.SOUTH, enemyHealthLabel, -6, SpringLayout.NORTH, enemyDisplay);

baseLayout.putConstraint(SpringLayout.NORTH, heroHealthLabel, 0, SpringLayout.NORTH, attackLabel);

baseLayout.putConstraint(SpringLayout.EAST, heroHealthLabel, 0, SpringLayout.EAST, luckyAttackButton);



}


private void setupListeners()

{

attackButton.addActionListener(new ActionListener()

{

public void actionPerformed(ActionEvent click)

{

String response = "You attacked the enemy!";


baseController.playGame("attack");


reactionDisplay.setText(response + "\nIt has " + baseController.enemyList.get(0).getHealth() + " HP left");


enemyHealthLabel.setText("Enemy Health " + baseController.enemyList.get(0).getHealth());

heroHealthLabel.setText("Your Health: " + baseController.heroList.get(0).getPlayerHealth());
}

});

rangeAttackButton.addActionListener(new ActionListener()

{

public void actionPerformed(ActionEvent click)

{

String response = "You threw a star at the enemy!";


baseController.playGame("range");


reactionDisplay.setText(response + "\nIt has " + baseController.enemyList.get(0).getHealth() + " HP left");


enemyHealthLabel.setText("Enemy Health " + baseController.enemyList.get(0).getHealth());

heroHealthLabel.setText("Your Health: " + baseController.heroList.get(0).getPlayerHealth());
}

});

luckyAttackButton.addActionListener(new ActionListener()

{

public void actionPerformed(ActionEvent click)

{

String response = "You used a lucky attack!";


baseController.playGame("lucky");


reactionDisplay.setText(response + "\nIt has " + baseController.enemyList.get(0).getHealth() + " HP left");



enemyHealthLabel.setText("Enemy Health " + baseController.enemyList.get(0).getHealth());

heroHealthLabel.setText("Your Health: " + baseController.heroList.get(0).getPlayerHealth());
}

});

}




public int getAttack()

{

int damage = baseController.heroList.get(0).attack();


return damage;

}


public int getRangedAttack()

{

int damage = baseController.heroList.get(0).rangeAttack();


return damage;



}


public int getLuckyAttack()

{

int damage = baseController.heroList.get(0).luckyHit();


return damage;

}




}
