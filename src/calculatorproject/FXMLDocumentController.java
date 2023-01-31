
package calculatorproject;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

	float data = 0f;
	int operation = -1;

	@FXML
	private Button dot;

	@FXML
	private Button clear;

	@FXML
	private TextField display;

	@FXML
	private Button div;

	@FXML
	private Button eight;

	@FXML
	private Button equals;

	@FXML
	private Button five;

	@FXML
	private Button four;

	@FXML
	private Button minus;

	@FXML
	private Button mult;

	@FXML
	private Button nine;

	@FXML
	private Button one;

	@FXML
	private Button plus;

	@FXML
	private Button seven;

	@FXML
	private Button six;

	@FXML
	private Button three;

	@FXML
	private Button two;

	@FXML
	private Button zero;
	
	@FXML
	private Button percent;

	@FXML
	void handleButtonAction(ActionEvent event) {
		if (event.getSource() == one) {
			display.setText(display.getText() + "1");
		} else if (event.getSource() == two) {
			display.setText(display.getText() + "2");
		} else if (event.getSource() == three) {
			display.setText(display.getText() + "3");
		} else if (event.getSource() == four) {
			display.setText(display.getText() + "4");
		} else if (event.getSource() == five) {
			display.setText(display.getText() + "5");
		} else if (event.getSource() == six) {
			display.setText(display.getText() + "6");
		} else if (event.getSource() == seven) {
			display.setText(display.getText() + "7");
		} else if (event.getSource() == eight) {
			display.setText(display.getText() + "8");
		} else if (event.getSource() == nine) {
			display.setText(display.getText() + "9");
		} else if (event.getSource() == zero) {
			display.setText(display.getText() + "0");
		}

		else if (event.getSource() == plus) {
			data = Float.parseFloat(display.getText());
			operation = 1;
			display.setText("");
		} else if (event.getSource() == minus) {
			data = Float.parseFloat(display.getText());
			operation = 2;
			display.setText("");
		}
		else if (event.getSource() == mult) {
			data = Float.parseFloat(display.getText());
			operation = 3;
			display.setText("");

		}

		else if (event.getSource() == div) {
			data = Float.parseFloat(display.getText());
			operation = 4;
			display.setText("");
		} else if (event.getSource() == clear) {
			data = 0f;
			operation = -1;
			display.setText("");
		} else if (event.getSource() == dot) {
			display.setText(display.getText() + ".");

		} 
		else if (event.getSource() == percent) {
			
			try {
				data = Float.parseFloat(display.getText());
				data /= 100;
				display.setText(String.valueOf(data));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		else if (event.getSource() == equals)

		{
			
			Float secondOperand = Float.parseFloat(display.getText());
			switch (operation) {
			case 1:
				Float ans;
				try {
					ans = data + secondOperand;
					display.setText(String.valueOf(ans));
					break;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case 2:
				try {
					ans = data - secondOperand;
					display.setText(String.valueOf(ans));
					break;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case 3:
				try {
					ans = data * secondOperand;
					display.setText(String.valueOf(ans));
					break;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case 4:
				ans = data / secondOperand;
				if (secondOperand == 0) {
					try {
						data = 0f;
						operation = -1;
						display.setText("0");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					try {
						display.setText(String.valueOf(ans));
						break;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}
	}

	public void initialize(URL url, ResourceBundle rb) {

	}

}