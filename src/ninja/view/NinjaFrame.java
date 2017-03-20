package ninja.view;

import javax.swing.*;
import ninja.controller.NinjaController;
import java.awt.Dimension;

public class NinjaFrame extends JFrame
{
	private NinjaController baseController;
	private NinjaPanel appPanel;
	
	public NinjaFrame(NinjaController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new NinjaPanel(baseController);
		
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Ultimate Fire Wolf-Killing Squad Alpha");
		this.setSize(new Dimension(900,600));
		this.setResizable(false);
		this.setVisible(true);
	}

}
