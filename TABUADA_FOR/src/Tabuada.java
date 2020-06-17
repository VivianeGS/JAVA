import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		
		int tabuada = 0;		
		
		tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada desejada: "));
		for(int i = 0; i <= 10; i++) {
			int total = tabuada * i;
			System.out.println(tabuada + " X " + i + " = " + total);
		}
		



	}

}
