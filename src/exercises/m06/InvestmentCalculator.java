package exercises.m06;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class InvestmentCalculator extends Application {
	private static TextField tfinvestmentAmount = new TextField();
	private static TextField tfmonthlyInterest = new TextField();
	private static TextField tfYearsToInvest = new TextField();
	private static TextField futureValue = new TextField();
	
	private Button btCalculate = new Button("Calculate Value");
	
	public static void main(String args[]) {
		Application.launch(args);
	}
	
	private static void futureValue() {
		double investmentAmount = Double.parseDouble(tfinvestmentAmount.getText());
		double monthlyInterest = Double.parseDouble(tfmonthlyInterest.getText());
		double yearsToInvest = Double.parseDouble(tfYearsToInvest.getText());
		double value = Math.round((investmentAmount * Math.pow((1 + monthlyInterest), (yearsToInvest * 12))) * 100.0) / 100.0;
		futureValue.setText("$" + Double.toString(value));
	}

	@Override
	public void start(Stage primaryStage) {
//		Setting fields up
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("Amount Invested:"), 0, 0);
		gridPane.add(tfinvestmentAmount, 1, 0);
		gridPane.add(new Label("Monthly Interest Rate as Decimal:"), 0, 2);
		gridPane.add(tfmonthlyInterest, 1, 2);
		gridPane.add(new Label("Years to Invest:"), 0, 4);
		gridPane.add(tfYearsToInvest, 1, 4);
		gridPane.add(btCalculate, 0, 8);
		gridPane.add(futureValue, 1, 8);
		btCalculate.setOnAction(e -> futureValue());
		
		
//		Alignment
		gridPane.setAlignment(Pos.CENTER);
		
//		Displaying Scene
		Scene scene = new Scene(gridPane, 400, 300);
		primaryStage.setTitle("Investment Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();	
	}
}
