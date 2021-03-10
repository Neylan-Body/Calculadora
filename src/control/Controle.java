package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Frame;
import view.Tela;

public class Controle implements ActionListener {

	private Tela tela;
	private Frame frame;
	private double valor1 = 0, valor2 = 0;
	private String sinal = "";

	public Controle() {
		getFrame().setContentPane(getTela());
		getFrame().repaint();
		getFrame().validate();
		eventosdojButton();
		getTela().getjButtonAdicao().setToolTipText("Adiçao");
		getTela().getjButtonSubtracao().setToolTipText("Subtraçao");
		getTela().getjButtonMultiplicacao().setToolTipText("Multiplicação");
		getTela().getjButtonDivisao().setToolTipText("Divisão");
		getTela().getjButtonSQRT().setToolTipText("Raiz quadrada");
		getTela().getjButtonElevadoAoQuadrado().setToolTipText("Numero selecionado ao quadrado");
		getTela().getjButtonSeno().setToolTipText("Seno");
		getTela().getjButtonCosceno().setToolTipText("Cosceno");
		getTela().getjButtonIgual().setToolTipText("Igual");
		getTela().getjButtonCE().setToolTipText("Limpa o campo de texto");
		getTela().getjButtonC().setToolTipText("Limpa tudo");
		getTela().getjButtonLogaritmo().setToolTipText("Logaritmo");
		getTela().getjButton1SobreX().setToolTipText("Divide o numero 1 pelo numero selecionado");
	}

	public void eventosdojButton() {
		this.getTela().getjButton0().addActionListener(this);
		this.getTela().getjButton1().addActionListener(this);
		this.getTela().getjButton2().addActionListener(this);
		this.getTela().getjButton3().addActionListener(this);
		this.getTela().getjButton4().addActionListener(this);
		this.getTela().getjButton5().addActionListener(this);
		this.getTela().getjButton6().addActionListener(this);
		this.getTela().getjButton7().addActionListener(this);
		this.getTela().getjButton8().addActionListener(this);
		this.getTela().getjButton9().addActionListener(this);
		this.getTela().getjButtonDivisao().addActionListener(this);
		this.getTela().getjButtonAdicao().addActionListener(this);
		this.getTela().getjButtonSubtracao().addActionListener(this);
		this.getTela().getjButtonMultiplicacao().addActionListener(this);
		this.getTela().getjButtonPonto().addActionListener(this);
		this.getTela().getjButtonIgual().addActionListener(this);
		this.getTela().getjButtonCE().addActionListener(this);
		this.getTela().getjButtonC().addActionListener(this);
		this.getTela().getjButtonCosceno().addActionListener(this);
		this.getTela().getjButtonSeno().addActionListener(this);
		this.getTela().getjButtonSQRT().addActionListener(this);
		this.getTela().getjButtonElevadoAoQuadrado().addActionListener(this);
		this.getTela().getjButtonLogaritmo().addActionListener(this);
		this.getTela().getjButton1SobreX().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == getTela().getjButton0()) {
			getTela().getjTextField().setText(getTela().getjTextField().getText() + "0");
		}
		if (e.getSource() == getTela().getjButton1()) {
			getTela().getjTextField().setText(getTela().getjTextField().getText() + "1");
		}
		if (e.getSource() == getTela().getjButton2()) {
			getTela().getjTextField().setText(getTela().getjTextField().getText() + "2");
		}
		if (e.getSource() == getTela().getjButton3()) {
			getTela().getjTextField().setText(getTela().getjTextField().getText() + "3");
		}
		if (e.getSource() == getTela().getjButton4()) {
			getTela().getjTextField().setText(getTela().getjTextField().getText() + "4");
		}
		if (e.getSource() == getTela().getjButton5()) {
			getTela().getjTextField().setText(getTela().getjTextField().getText() + "5");
		}
		if (e.getSource() == getTela().getjButton6()) {
			getTela().getjTextField().setText(getTela().getjTextField().getText() + "6");
		}
		if (e.getSource() == getTela().getjButton7()) {
			getTela().getjTextField().setText(getTela().getjTextField().getText() + "7");
		}
		if (e.getSource() == getTela().getjButton8()) {
			getTela().getjTextField().setText(getTela().getjTextField().getText() + "8");
		}
		if (e.getSource() == getTela().getjButton9()) {
			getTela().getjTextField().setText(getTela().getjTextField().getText() + "9");
		}
		if (e.getSource() == getTela().getjButtonAdicao()) {
			if (!getTela().getjTextField().getText().equals("")) {
				valor1 = Double.parseDouble(getTela().getjTextField().getText());
				getTela().getjTextField().setText("");
				sinal = "soma";
			}
			if (getTela().getjTextField().getText().equals("") && valor1 != 0) {
				getTela().getjTextField().setText("");
				sinal = "soma";
			}
		}
		if (e.getSource() == getTela().getjButtonSubtracao()) {
			if (!getTela().getjTextField().getText().equals("")) {
				valor1 = Double.parseDouble(getTela().getjTextField().getText());
				getTela().getjTextField().setText("");
				sinal = "subtracao";
			}
			if (getTela().getjTextField().getText().equals("") && valor1 != 0) {
				getTela().getjTextField().setText("");
				sinal = "subtracao";
			}
		}
		if (e.getSource() == getTela().getjButtonDivisao()) {
			if (!getTela().getjTextField().getText().equals("")) {
				valor1 = Double.parseDouble(getTela().getjTextField().getText());
				getTela().getjTextField().setText("");
				sinal = "divisao";
			}
			if (getTela().getjTextField().getText().equals("") && valor1 != 0) {
				getTela().getjTextField().setText("");
				sinal = "divisao";
			}
		}
		if (e.getSource() == getTela().getjButtonMultiplicacao()) {
			if (!getTela().getjTextField().getText().equals("")) {
				valor1 = Double.parseDouble(getTela().getjTextField().getText());
				getTela().getjTextField().setText("");
				sinal = "multiplicacao";
			}
			if (getTela().getjTextField().getText().equals("") && valor1 != 0) {
				getTela().getjTextField().setText("");
				sinal = "multiplicacao";
			}
		}
		if (e.getSource() == getTela().getjButtonPonto()) {
			if (getTela().getjTextField().getText().equals("")) {
				getTela().getjTextField().setText(getTela().getjTextField().getText() + "0.");
			} else {
				if (!getTela().getjTextField().getText().contains(".")) {
					getTela().getjTextField().setText(getTela().getjTextField().getText() + ".");
				}
			}
		}
		if (e.getSource() == getTela().getjButtonIgual()) {
			if (!getTela().getjTextField().getText().equals("")) {
				valor2 = Double.parseDouble(getTela().getjTextField().getText());
				if (sinal.equals("soma")) {
					getTela().getjTextField().setText(String.valueOf(valor1 + valor2));
				}
				if (sinal.equals("subtracao")) {
					getTela().getjTextField().setText(String.valueOf(valor1 - valor2));
				}
				if (sinal.equals("divisao")) {
					getTela().getjTextField().setText(String.valueOf(valor1 / valor2));
				}
				if (sinal.equals("multiplicacao")) {
					getTela().getjTextField().setText(String.valueOf(valor1 * valor2));
				}
				sinal = "";
				getTela().getjButtonDivisao().setEnabled(true);
				getTela().getjButtonAdicao().setEnabled(true);
				getTela().getjButtonSubtracao().setEnabled(true);
				getTela().getjButtonMultiplicacao().setEnabled(true);
				getTela().getjButtonCosceno().setEnabled(true);
				getTela().getjButtonSeno().setEnabled(true);
				getTela().getjButtonSQRT().setEnabled(true);
				getTela().getjButtonLogaritmo().setEnabled(true);
				getTela().getjButton1SobreX().setEnabled(true);
				getTela().getjButtonElevadoAoQuadrado().setEnabled(true);
			}
		}
		if (e.getSource() == getTela().getjButtonCE()) {
			getTela().getjTextField().setText("");
			getTela().getjButtonDivisao().setEnabled(true);
			getTela().getjButtonAdicao().setEnabled(true);
			getTela().getjButtonSubtracao().setEnabled(true);
			getTela().getjButtonMultiplicacao().setEnabled(true);
			getTela().getjButtonCosceno().setEnabled(true);
			getTela().getjButtonSeno().setEnabled(true);
			getTela().getjButtonSQRT().setEnabled(true);
			getTela().getjButtonLogaritmo().setEnabled(true);
			getTela().getjButton1SobreX().setEnabled(true);
			getTela().getjButtonElevadoAoQuadrado().setEnabled(true);
		}
		if (e.getSource() == getTela().getjButtonC()) {
			valor1 = 0;
			valor2 = 0;
			getTela().getjTextField().setText("");
			sinal = "";
			getTela().getjButtonDivisao().setEnabled(true);
			getTela().getjButtonAdicao().setEnabled(true);
			getTela().getjButtonSubtracao().setEnabled(true);
			getTela().getjButtonMultiplicacao().setEnabled(true);
			getTela().getjButtonCosceno().setEnabled(true);
			getTela().getjButtonSeno().setEnabled(true);
			getTela().getjButtonSQRT().setEnabled(true);
			getTela().getjButtonLogaritmo().setEnabled(true);
			getTela().getjButton1SobreX().setEnabled(true);
			getTela().getjButtonElevadoAoQuadrado().setEnabled(true);
		}
		if (!sinal.equals("") && !getTela().getjTextField().getText().equals("")) {
			getTela().getjButtonDivisao().setEnabled(false);
			getTela().getjButtonAdicao().setEnabled(false);
			getTela().getjButtonSubtracao().setEnabled(false);
			getTela().getjButtonMultiplicacao().setEnabled(false);
//			getTela().getjButtonCosceno().setEnabled(false);
//			getTela().getjButtonSeno().setEnabled(false);
//			getTela().getjButtonSQRT().setEnabled(false);
//			getTela().getjButtonLogaritmo().setEnabled(false);
//			getTela().getjButton1SobreX().setEnabled(false);
//			getTela().getjButtonElevadoAoQuadrado().setEnabled(false);
		}
		if (e.getSource() == getTela().getjButtonCosceno()) {
			if(!getTela().getjTextField().getText().equals("")) {
			getTela().getjTextField().setText(Double.toString(Math.cos(Double.parseDouble(getTela().getjTextField().getText()))));
			}
		}
		if (e.getSource() == getTela().getjButtonSeno()) {
			if(!getTela().getjTextField().getText().equals("")) {
			getTela().getjTextField().setText(Double.toString(Math.sin(Double.parseDouble(getTela().getjTextField().getText()))));
			}
		}
		if (e.getSource() == getTela().getjButtonSQRT()) {
			if(!getTela().getjTextField().getText().equals("")) {
			getTela().getjTextField().setText(Double.toString(Math.sqrt(Double.parseDouble(getTela().getjTextField().getText()))));
			}
		}
		if (e.getSource() == getTela().getjButtonElevadoAoQuadrado()) {
			if(!getTela().getjTextField().getText().equals("")) {
			getTela().getjTextField().setText(Double.toString(Math.pow(Double.parseDouble(getTela().getjTextField().getText()), 2.0)));
			}
		}
		if (e.getSource() == getTela().getjButtonLogaritmo()) {
			if(!getTela().getjTextField().getText().equals("")) {
				getTela().getjTextField().setText(Double.toString(Math.log(Double.parseDouble(getTela().getjTextField().getText()))));
				}
		}
		if (e.getSource() == getTela().getjButton1SobreX()) {
			if(!getTela().getjTextField().getText().equals("")) {
				getTela().getjTextField().setText(Double.toString(1/Double.parseDouble(getTela().getjTextField().getText())));
				}
		}
	}
	
	public Frame getFrame() {
		if (frame == null) {
			frame = new Frame();
		}
		return frame;
	}

	public Tela getTela() {
		if (tela == null) {
			tela = new Tela();
		}
		return tela;
	}
}
