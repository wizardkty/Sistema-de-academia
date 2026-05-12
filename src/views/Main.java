package views;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 464, 439);
		contentPane.add(tabbedPane);
		
		JDesktopPane desktopPaneCadastro = new JDesktopPane();
		tabbedPane.addTab("Cadastro", null, desktopPaneCadastro, null);
		
		textField = new JTextField();
		textField.setBounds(75, 95, 161, 20);
		desktopPaneCadastro.add(textField);
		textField.setColumns(10);
		
		JLabel lblDigiteSeuNome = new JLabel("Nome: ");
		lblDigiteSeuNome.setBounds(20, 41, 83, 43);
		desktopPaneCadastro.add(lblDigiteSeuNome);
		
		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setBounds(20, 79, 83, 43);
		desktopPaneCadastro.add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(75, 52, 161, 20);
		desktopPaneCadastro.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setBounds(207, 11, 54, 30);
		desktopPaneCadastro.add(lblNewLabel);
		
	}
}
