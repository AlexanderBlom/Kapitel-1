import javax.swing.*;

/*
	Alexander Blom
	2017/09/18
	Program som visar vilket os du har
*/
	public class Ovning1_8{
		public static void main(String[] args) {
			
			JOptionPane.showMessageDialog(null, "Du kör" + 
				System.getProperty("os.name") + "idag!");
		}
	}
