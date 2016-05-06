package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class GUIMAIN implements ActionListener{
	private JFrame frame;
	private JLabel info1; 
	private JButton generateRandButton;
	private JSpinner imagesGen;
	private SpinnerModel model;
	private JTextField time;
	public void createUI(){
		frame = new JFrame("Halycon Wallpaper Conjurer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		info1 = new JLabel("Click this button to generate some Images");
		info1.setText("Generate Images");
		info1.setPreferredSize(new Dimension(200, 20));
		generateRandButton = new JButton("Conjure");
		generateRandButton.addActionListener(this);
		generateRandButton.setPreferredSize(new Dimension(300, 20));
		model = new SpinnerNumberModel(1, 1, 1000,1);
		imagesGen = new JSpinner(model);
		time = new JTextField();
		time.setText("00:00");
		frame.getContentPane().add(time, BorderLayout.LINE_END);
		frame.getContentPane().add(info1, BorderLayout.NORTH);
		frame.getContentPane().add(imagesGen, BorderLayout.LINE_START);
		frame.getContentPane().add(generateRandButton, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(generateRandButton)){
			long startTime = System.currentTimeMillis();
			for(int x= 0; x < (int)(imagesGen.getValue()); x++){
				
				try{
					Main.gen.generateImg();
				}catch(Exception e){
					x--;
					System.out.print("Ouch");
				}
				
			}
			long endTime = System.currentTimeMillis();
			int differ = (int) (endTime - startTime) /1000;
			System.out.print(differ);
			int min = (int) (differ/60);
			int seconds = differ%60;
			time.setText(min +":" +seconds);
			System.out.println("Ayye");
		}
		
	}
}
