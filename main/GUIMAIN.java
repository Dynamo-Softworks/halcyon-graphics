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

import ref.Settings;

public class GUIMAIN implements ActionListener{
	private JFrame frame;
	private JLabel info1; 
	private JButton generateRandButton;
	private JSpinner imagesGen;
	private SpinnerModel model;
	private SpinnerModel expandedModel;
	private SpinnerModel expandedModel2;
	private JTextField time;
	private JTextField progress;
	private JSpinner xRes;
	private JSpinner yRes;
	public void createUI(){
		frame = new JFrame("Halycon Wallpaper Conjurer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		info1 = new JLabel("Click this button to generate some Images");
		info1.setText("Generate Images: XRes,YRes");
		info1.setPreferredSize(new Dimension(200, 20));
		generateRandButton = new JButton("Unleash the dreams of the Universe");
		generateRandButton.addActionListener(this);
		generateRandButton.setPreferredSize(new Dimension(370, 20));
		model = new SpinnerNumberModel(1, 1, 1000,1);
		expandedModel = new SpinnerNumberModel(1024,100, 5000,1);
		expandedModel2 = new SpinnerNumberModel(768,100, 5000,1);
		imagesGen = new JSpinner(model);
		time = new JTextField();
		time.setText("00:00");
		time.setEditable(false);
		progress = new JTextField();
		progress.setText("0");
		progress.setSize(100, 20);
		progress.setLocation(410,0);
		progress.setEditable(false);
		xRes = new JSpinner(expandedModel);
		xRes.setSize(100, 20);
		xRes.setLocation(210, 0);
		yRes = new JSpinner(expandedModel2);
		yRes.setSize(100, 20);
		yRes.setLocation(310,0);
		frame.getContentPane().add(xRes, BorderLayout.WEST);
		frame.getContentPane().add(yRes, BorderLayout.WEST);
		frame.getContentPane().add(progress, BorderLayout.WEST);
		frame.getContentPane().add(time, BorderLayout.LINE_END);
		frame.getContentPane().add(info1, BorderLayout.NORTH);
		frame.getContentPane().add(imagesGen, BorderLayout.LINE_START);
		frame.getContentPane().add(generateRandButton, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Settings.imgHeight = (int) yRes.getValue();
		Settings.imgWidth = (int) xRes.getValue();
		if(arg0.getSource().equals(generateRandButton)){
			progress.setText("0");
			long startTime = System.currentTimeMillis();
			for(int x= 1; x <= (int)(imagesGen.getValue()); x++){
				
				try{
					progress.setText(x+" Conjured");
					Main.gen.generateImg();
				}catch(Exception e){
					x--;
					System.out.print("Ouch");
				}
				
				
			}
			long endTime = System.currentTimeMillis();
			int differ = (int) (endTime - startTime) /1000;
			//System.out.print(differ);
			int min = (int) (differ/60);
			int seconds = differ%60;
			time.setText(min +":" +seconds);
			System.out.println("Ayye");
		}
		
	}
}
