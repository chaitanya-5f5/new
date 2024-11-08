package pr1;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calci extends Frame {
    private TextField num1Field, num2Field, resultField;

    public calci() {
        // Set up the Frame
        setTitle("Integer Division Calculator");
        setSize(300, 200);

        // Create components
        Label num1Label = new Label("Num1:");
        Label num2Label = new Label("Num2:");
        Label resultLabel = new Label("Result:");

        num1Field = new TextField(10);
        num2Field = new TextField(10);
        resultField = new TextField(10);
        resultField.setEditable(false);  // Make result field read-only

        Button divideButton = new Button("Divide");
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performDivision();
            }
        });

        // Set up layout using GridLayout
        setLayout(new GridLayout(4, 2));
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(divideButton);

        // Set up the closing operation
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    private void performDivision() {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());

            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            int result = num1 / num2;
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            showMessageDialog("Please enter valid integers for Num1 and Num2.");
        } catch (ArithmeticException e) {
            showMessageDialog(e.getMessage());
        }
    }

    private void showMessageDialog(String message) {
        Dialog dialog = new Dialog(this, "Error", true);
        dialog.setLayout(new FlowLayout());
        dialog.add(new Label(message));
        Button okButton = new Button("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        dialog.add(okButton);
        dialog.setSize(200, 100);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new calci().setVisible(true);
            }
        });
    }
}
