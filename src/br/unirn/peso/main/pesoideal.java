package br.unirn.peso.main;

import javax.swing.JOptionPane;

public class pesoideal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double h, peso, ideal;
		int sexo;

		sexo = Integer.parseInt(JOptionPane
				.showInputDialog("Digite (1)-Feminino ou (2)-Masculino"));

		h = Double.parseDouble(JOptionPane
				.showInputDialog("Digite a altura da pessoa em metros"));

		peso = Double.parseDouble(JOptionPane
				.showInputDialog("Digite o peso da pessoa em Kilograma"));

		if (sexo == 1) {
			ideal = (62.1 * h) - 44.7;
		} else {
			ideal = (72.7 * h) - 58;
		}
		JOptionPane.showMessageDialog(null, "Seu peso atual é" + "  " + peso
				+ "O peso ideal é" + "  " + ideal);
	}
}