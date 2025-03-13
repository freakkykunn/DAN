package Truong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nhan_chia {
	
	class MultiplyDivideFrame {
	    public static void openMultiplyDivideFrame() {
	        JFrame calcFrame = new JFrame("Multiply & Divide");
	        calcFrame.setSize(300, 200);
	        calcFrame.setLayout(new GridLayout(3, 2));

	        JTextField numberField1 = new JTextField();
	        JTextField numberField2 = new JTextField();
	        JButton multiplyButton = new JButton("Nhan");
	        JButton divideButton = new JButton("Chia");
	        JLabel resultLabel = new JLabel("Ket qua: ", SwingConstants.CENTER);

	        multiplyButton.addActionListener(e -> {
	            try {
	                double num1 = Double.parseDouble(numberField1.getText());
	                double num2 = Double.parseDouble(numberField2.getText());
	                resultLabel.setText("Ket qua: " + MathOperations.multiply(num1, num2));
	            } catch (NumberFormatException ex) {
	                resultLabel.setText("Vui lòng nhập số hợp lệ");
	            }
	        });

	        divideButton.addActionListener(e -> {
	            try {
	                double num1 = Double.parseDouble(numberField1.getText());
	                double num2 = Double.parseDouble(numberField2.getText());
	                resultLabel.setText("Kết quả: " + MathOperations.divide(num1, num2));
	            } catch (NumberFormatException ex) {
	                resultLabel.setText("Vui lòng nhập số hợp lệ");
	            }
	        });

	        calcFrame.add(new JLabel("Nhập số 1:", SwingConstants.CENTER));
	        calcFrame.add(numberField1);
	        calcFrame.add(new JLabel("Nhập số 2:", SwingConstants.CENTER));
	        calcFrame.add(numberField2);
	        calcFrame.add(multiplyButton);
	        calcFrame.add(divideButton);
	        calcFrame.add(resultLabel);

	        calcFrame.setVisible(true);
	    }
	}

	class MathOperations {
	    public static double multiply(double num1, double num2) {
	        return num1 * num2;
	    }

	    public static double divide(double num1, double num2) {
	        if (num2 == 0) {
	            return Double.NaN; // 
	        }
	        return num1 / num2;
	    }
	}
}
