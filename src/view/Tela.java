package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class Tela extends JPanel {

	private JTextField jTextField;
	private JButton jButton0;
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;
	private JButton jButton5;
	private JButton jButton6;
	private JButton jButton7;
	private JButton jButton8;
	private JButton jButton9;
	private JButton jButtonAdicao;
	private JButton jButtonSubtracao;
	private JButton jButtonDivisao;
	private JButton jButtonMultiplicacao;
	private JButton jButtonIgual;
	private JButton jButtonPonto;
	private JButton jButtonC;
	private JButton jButtonCE;
	private JButton jButtonSQRT;
	private JButton jButtonElevadoAoQuadrado;
	private JButton jButtonSeno;
	private JButton jButtonCosceno;
	private JButton jButtonLogaritmo;
	private JButton jButton1SobreX;

	public Tela() {
		this.setLayout(null);
		this.setBackground(UIManager.getColor("Button.background"));
		this.add(getjTextField());
		this.add(getjButton0());
		this.add(getjButton1());
		this.add(getjButton2());
		this.add(getjButton3());
		this.add(getjButton4());
		this.add(getjButton5());
		this.add(getjButton6());
		this.add(getjButton7());
		this.add(getjButton8());
		this.add(getjButton9());
		this.add(getjButtonDivisao());
		this.add(getjButtonIgual());
		this.add(getjButtonAdicao());
		this.add(getjButtonSubtracao());
		this.add(getjButtonPonto());
		this.add(getjButtonMultiplicacao());
		this.add(getjButtonC());
		this.add(getjButtonCE());
		this.add(getjButtonSQRT());
		this.add(getjButtonElevadoAoQuadrado());
		this.add(getjButtonSeno());
		this.add(getjButtonCosceno());
		this.add(getjButton1SobreX());
		this.add(getjButtonLogaritmo());
	}

	public JTextField getjTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
			jTextField.setBackground(UIManager.getColor("Button.background"));
			jTextField.setEditable(false);
			jTextField.setBounds(10, 11, 216, 64);
		}
		return jTextField;
	}

	public JButton getjButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("0");
			jButton0.setFont(new Font("Arial", Font.BOLD, 11));
			jButton0.setBounds(10, 242, 52, 28);

		}
		return jButton0;
	}

	public JButton getjButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("1");
			jButton1.setFont(new Font("Arial", Font.BOLD, 11));
			jButton1.setBounds(119, 211, 52, 28);

		}
		return jButton1;
	}

	public JButton getjButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("2");
			jButton2.setFont(new Font("Arial", Font.BOLD, 11));
			jButton2.setBounds(65, 211, 52, 28);
		}
		return jButton2;
	}

	public JButton getjButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("3");
			jButton3.setFont(new Font("Arial", Font.BOLD, 11));
			jButton3.setBounds(10, 211, 52, 28);
		}
		return jButton3;
	}

	public JButton getjButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("4");
			jButton4.setFont(new Font("Arial", Font.BOLD, 11));
			jButton4.setBounds(119, 179, 52, 28);
		}
		return jButton4;
	}

	public JButton getjButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setText("5");
			jButton5.setFont(new Font("Arial", Font.BOLD, 11));
			jButton5.setBounds(65, 179, 52, 28);
		}
		return jButton5;
	}

	public JButton getjButton6() {
		if (jButton6 == null) {
			jButton6 = new JButton();
			jButton6.setText("6");
			jButton6.setFont(new Font("Arial", Font.BOLD, 11));
			jButton6.setBounds(10, 179, 52, 28);
		}
		return jButton6;
	}

	public JButton getjButton7() {
		if (jButton7 == null) {
			jButton7 = new JButton();
			jButton7.setText("7");
			jButton7.setFont(new Font("Arial", Font.BOLD, 11));
			jButton7.setBounds(10, 148, 52, 28);
		}
		return jButton7;
	}

	public JButton getjButton8() {
		if (jButton8 == null) {
			jButton8 = new JButton();
			jButton8.setText("8");
			jButton8.setFont(new Font("Arial", Font.BOLD, 11));
			jButton8.setBounds(65, 148, 52, 28);
		}
		return jButton8;
	}

	public JButton getjButton9() {
		if (jButton9 == null) {
			jButton9 = new JButton();
			jButton9.setText("9");
			jButton9.setFont(new Font("Arial", Font.BOLD, 11));
			jButton9.setBounds(119, 148, 52, 28);
		}
		return jButton9;
	}

	public JButton getjButtonAdicao() {
		if (jButtonAdicao == null) {
			jButtonAdicao = new JButton();
			jButtonAdicao.setText("+");
			jButtonAdicao.setFont(new Font("Arial", Font.BOLD, 11));
			jButtonAdicao.setBounds(174, 242, 52, 28);
		}
		return jButtonAdicao;
	}

	public JButton getjButtonSubtracao() {
		if (jButtonSubtracao == null) {
			jButtonSubtracao = new JButton();
			jButtonSubtracao.setText("-");
			jButtonSubtracao.setFont(new Font("Arial", Font.BOLD, 11));
			jButtonSubtracao.setBounds(174, 211, 52, 28);
		}
		return jButtonSubtracao;
	}

	public JButton getjButtonDivisao() {
		if (jButtonDivisao == null) {
			jButtonDivisao = new JButton();
			jButtonDivisao.setText("÷");
			jButtonDivisao.setFont(new Font("Arial", Font.BOLD, 11));
			jButtonDivisao.setBounds(174, 148, 52, 28);
		}
		return jButtonDivisao;
	}

	public JButton getjButtonMultiplicacao() {
		if (jButtonMultiplicacao == null) {
			jButtonMultiplicacao = new JButton();
			jButtonMultiplicacao.setText("×");
			jButtonMultiplicacao.setFont(new Font("Arial", Font.BOLD, 11));
			jButtonMultiplicacao.setBounds(174, 179, 52, 28);
		}
		return jButtonMultiplicacao;
	}

	public JButton getjButtonIgual() {
		if (jButtonIgual == null) {
			jButtonIgual = new JButton();
			jButtonIgual.setText("=");
			jButtonIgual.setFont(new Font("Arial", Font.BOLD, 11));
			jButtonIgual.setBounds(119, 242, 52, 28);
		}
		return jButtonIgual;
	}

	public JButton getjButtonPonto() {
		if (jButtonPonto == null) {
			jButtonPonto = new JButton();
			jButtonPonto.setText(".");
			jButtonPonto.setFont(new Font("Arial", Font.BOLD, 11));
			jButtonPonto.setBounds(65, 242, 52, 28);
		}
		return jButtonPonto;
	}

	public JButton getjButtonC() {
		if (jButtonC == null) {
			jButtonC = new JButton();
			jButtonC.setText("C");
			jButtonC.setFont(new Font("Arial", Font.BOLD, 11));
			jButtonC.setBounds(65, 117, 52, 28);
		}
		return jButtonC;
	}

	public JButton getjButtonCE() {
		if (jButtonCE == null) {
			jButtonCE = new JButton();
			jButtonCE.setText("CE");
			jButtonCE.setFont(new Font("Arial", Font.BOLD, 11));
			jButtonCE.setBounds(10, 117, 52, 28);
		}
		return jButtonCE;
	}

	public JButton getjButtonSQRT() {
		if (jButtonSQRT == null) {
			jButtonSQRT = new JButton();
			jButtonSQRT.setText("√");
			jButtonSQRT.setFont(new Font("Arial", Font.BOLD, 11));
			jButtonSQRT.setBounds(10, 86, 52, 28);
		}
		return jButtonSQRT;
	}

	public JButton getjButtonElevadoAoQuadrado() {
		if (jButtonElevadoAoQuadrado == null) {
			jButtonElevadoAoQuadrado = new JButton();
			jButtonElevadoAoQuadrado.setText("X\u00B2");
			jButtonElevadoAoQuadrado.setFont(new Font("Arial", Font.BOLD, 11));
			jButtonElevadoAoQuadrado.setBounds(65, 86, 52, 28);
		}
		return jButtonElevadoAoQuadrado;
	}

	public JButton getjButtonSeno() {
		if (jButtonSeno == null) {
			jButtonSeno = new JButton();
			jButtonSeno.setText("Sin");
			jButtonSeno.setFont(new Font("Arial", Font.BOLD, 11));
			jButtonSeno.setBounds(119, 86, 52, 28);
		}
		return jButtonSeno;
	}

	public JButton getjButtonCosceno() {
		if (jButtonCosceno == null) {
			jButtonCosceno = new JButton();
			jButtonCosceno.setText("Cos");
			jButtonCosceno.setFont(new Font("Arial", Font.BOLD, 10));
			jButtonCosceno.setBounds(174, 86, 52, 28);
		}
		return jButtonCosceno;
	}
	
	public JButton getjButton1SobreX() {
		if (jButton1SobreX == null) {
			jButton1SobreX = new JButton();
			jButton1SobreX.setText("1/X");
			jButton1SobreX.setFont(new Font("Arial", Font.BOLD, 10));
			jButton1SobreX.setBounds(119, 117, 52, 28);
		}
		return jButton1SobreX;
	}
	
	public JButton getjButtonLogaritmo() {
		if (jButtonLogaritmo == null) {
			jButtonLogaritmo = new JButton();
			jButtonLogaritmo.setText("Log");
			jButtonLogaritmo.setFont(new Font("Arial", Font.BOLD, 10));
			jButtonLogaritmo.setBounds(174, 117, 52, 28);
		}
		return jButtonLogaritmo;
	}
}
