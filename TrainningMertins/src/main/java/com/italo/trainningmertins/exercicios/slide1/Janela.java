import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame {

    private JLabel label = new JLabel("Numero 1");
    private JTextField txtNumero1 = new JTextField(20);
    private JLabel label2 = new JLabel("Numero 2");
    private JTextField txtNumero2 = new JTextField(20);
    private JLabel label3 = new JLabel("Resultado");
    private JTextField txtResultado = new JTextField(20);
    private JButton botao = new JButton("Calcular");
    private JComboBox<String> operacoes = new JComboBox<>(new String[]{"+", "-", "*", "/"});

    public Janela() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.iniciar();
    }

    private void iniciar() {
        this.setLayout(new GridLayout(5, 2, 10, 10));

        this.add(this.label);
        this.add(this.txtNumero1);

        this.add(this.label2);
        this.add(this.txtNumero2);

        this.add(new JLabel("Operação"));
        this.add(this.operacoes);

        this.add(this.label3);
        this.add(this.txtResultado);
        this.txtResultado.setEditable(false);

        this.botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtNumero1.getText());
                double num2 = Double.parseDouble(txtNumero2.getText());
                String operacao = (String) operacoes.getSelectedItem();
                double resultado = 0;

                switch (operacao) {
                    case "+":
                        resultado = num1 + num2;
                        break;
                    case "-":
                        resultado = num1 - num2;
                        break;
                    case "*":
                        resultado = num1 * num2;
                        break;
                    case "/":
                        resultado = num1 / num2;
                        break;
                }

                txtResultado.setText(String.valueOf(resultado));
            }
        });

        this.add(this.botao);
        this.setSize(400, 300);
    }

    public static void main(String[] args) {
        Janela janela = new Janela();
        janela.setVisible(true);
    }
}
