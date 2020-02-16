package com.swing.version1.app;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class SwingInit implements CopyInterface {

		private JFrame frame;
		
		public SwingInit() {
			this.frame=initialize(this.frame);
		}

		@Override
		public JFrame initialize(JFrame frame) {
			frame=new JFrame();
			frame.setBounds(100,100,450,300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			return frame;
			
			
			
		}
		
		

		public JFrame getFrame() {
			return frame;
		}

		@Override
		public void run() {
			EventQueue.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					try {
						SwingInit init=new SwingInit();
						init.getFrame().setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			});
			
		}
	

	

}
