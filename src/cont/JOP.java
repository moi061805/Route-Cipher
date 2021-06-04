package cont;

import javax.swing.JOptionPane;
//This class enables me to use the JOptionPane features
public class JOP {

	public static void msg(String str) {
		JOptionPane.showMessageDialog(null, str);
	}
	
	public static String in(String msg){
		return JOptionPane.showInputDialog(msg);
	}

	public static void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}
}
