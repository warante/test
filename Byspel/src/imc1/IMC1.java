package imc1;

import javax.swing.JOptionPane;

public class IMC1 {
	
	IMCFrame vista = new IMCFrame(this);

	void calcularIMC() {
		double peso = Double.parseDouble(vista.txtPeso.getText());
		double est = Double.parseDouble(vista.txtEstatura.getText());

		double IMC = peso / (est * est);

		JOptionPane.showMessageDialog(null, "El índice de masa corporal es: " + IMC);

		if (IMC < 18.5) {
			JOptionPane.showMessageDialog(null, "Peso inferior a lo normal");
		} else if (IMC >= 18.5 && IMC <= 24.9) {
			JOptionPane.showMessageDialog(null, "Peso normal");
		} else if (IMC >= 25.0 && IMC <= 30) {
			JOptionPane.showMessageDialog(null, "Peso superior a lo normal");
		} else {
			JOptionPane.showMessageDialog(null, "Obesidad");
		}
	}

}
