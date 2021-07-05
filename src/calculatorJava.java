import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorJava {
    private JPanel javaCalculator;
    private JTextField txtDisplay;
    private JButton btnMultiply;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnOne;
    private JButton btnDivide;
    private JButton btnEqual;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnMinus;

    public calculatorJava() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = txtDisplay.getText() + btnOne.getText();
                txtDisplay.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = txtDisplay.getText() + btnTwo.getText();
                txtDisplay.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = txtDisplay.getText() + btnThree.getText();
                txtDisplay.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = txtDisplay.getText() + btnFour.getText();
                txtDisplay.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = txtDisplay.getText() + btnFive.getText();
                txtDisplay.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = txtDisplay.getText() + btnSix.getText();
                txtDisplay.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = txtDisplay.getText() + btnSeven.getText();
                txtDisplay.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = txtDisplay.getText() + btnEight.getText();
                txtDisplay.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = txtDisplay.getText() + btnNine.getText();
                txtDisplay.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = txtDisplay.getText() + btnZero.getText();
                txtDisplay.setText(btnZeroText);
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnPointText = txtDisplay.getText() + btnPoint.getText();
                txtDisplay.setText(btnPointText);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnClearText = txtDisplay.getText() + btnClear.getText();
                txtDisplay.setText(btnClearText);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnPlusText = txtDisplay.getText() + btnPlus.getText();
                txtDisplay.setText(btnPlusText);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnMinusText = txtDisplay.getText() + btnMinus.getText();
                txtDisplay.setText(btnMinusText);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnDivideText = txtDisplay.getText() + btnDivide.getText();
                txtDisplay.setText(btnDivideText);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnMultiplyText = txtDisplay.getText() + btnMultiply.getText();
                txtDisplay.setText(btnMultiplyText);
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEqualText = txtDisplay.getText() + btnEqual.getText();
                txtDisplay.setText(btnEqualText);
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("calculatorJava");
        frame.setContentPane(new calculatorJava().javaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
