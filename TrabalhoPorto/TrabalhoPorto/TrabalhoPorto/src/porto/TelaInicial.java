package porto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;

import java.text.ParseException;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;


import javax.swing.JScrollPane;
import javax.swing.JTable;



public class TelaInicial {

	ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
	ArrayList<Navio> navios = new ArrayList<Navio>();
	ArrayList<Container> containers = new ArrayList<Container>();
	ArrayList<Saida> saidas = new ArrayList<Saida>();
	private JFrame frmPorto;
	private JPanel panelCadastroNavio;
	private JPanel panelCadastroCaminhao;
	private JPanel panelCarregarNavio;
	private JPanel panelCarregarCaminhao;
	private JPanel panelDescarregarNavio;
	private JPanel panelDescarregarCaminhao;
	private JPanel panelMenuPrincipal;
	private JLabel lblNewLabel;
	private JLabel lblCadastroDeCaminhes;
	private JLabel lblCarregarNavio;
	private JLabel lblCarregarCaminhes;
	private JLabel lblDescarregarDeNavios;
	private JLabel lblDescarregarcaminho;
	private JButton btnCadastroNavio_Menu;
	private JButton btnCadastroCaminhao_Menu;
	private JButton btnCarregaNavio_Menu;
	private JButton btnCarregaCaminhao_Menu;
	private JButton btnDescarregaNavio_Menu;
	private JButton btnDescarregaCaminhao_Menu;
	private JButton btnSair;
	private JLabel lblPlaca;
	private JLabel lblTransportadora;
	private JLabel lblMotorista;
	private JTextField tf_Matricula;
	private JTextField tf_TransportadoraNavio;
	private JTextField tf_Motorista;
	private JLabel lblMatrcula;
	private JTextField tf_Placa;
	private JLabel label_1;
	private JTextField tf_transportadoraCaminhao;
	private JLabel lblComandante;
	private JTextField tf_Comandante;
	private JButton btnCadCaminhao;
	private JButton btnLimCaminhao;
	private JTable tableCadastroNavios;
	private JButton btnRemCaminhao;
	private JTable tableCadastroCaminhao;
	private JTextField tf_CodigoContainerNavio;
	private JTextField tf_DescricaoContainerNavio;
	private JTextField tf_LocalizacaoContainerNavio;
	private JTextField tf_OrigemContainerNavio;
	private JTextField tf_DestinoContainerNavio;
	private JTextField tf_DataEntradaContainerNavio;
	private JTextField tf_DataSaidaContainerNavio;

	private JTable tableDescarregarNavio;
	private JTextField tf_CodigoContainerCaminhao;
	private JTextField tf_DescricaoContainerCaminhao;
	private JTextField tf_LocalizacaoContainerCaminhao;
	private JTable tableDescarregarCaminhao;
	private JFormattedTextField tf_OrigemContainerCaminhao;
	private JFormattedTextField tf_DestinoContainerCaminhao;
	private JFormattedTextField tf_DataSaidaContainerCaminhao;
	private JFormattedTextField tf_DataEntradaContainerCaminhao;
	private JTextField tf_CodigoCarregarNavio;
	private JTextField tf_DestinoCarregarNavio;
	private JTextField tf_DataCarregamentoNavio;
	private JTable tableCarregarContainersNavio;
	private JButton btnAtualizar;
	private JLabel lblNewLabel_1;
	private JLabel lblNaviosFila;
	private JScrollPane scrollPaneMostraNavios;
	private JTable tableCarregarNavios;
	private JLabel lblCarregamentoNavios;
	private JScrollPane scrollPaneCarregamentoNavios;
	private JTable tableCarregamentosNavio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.frmPorto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws ParseException 
	 */
	public TelaInicial() throws ParseException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		frmPorto = new JFrame();
		frmPorto.setTitle("Sistema Porto");
		frmPorto.setResizable(false);
		frmPorto.setBounds(100, 100, 620, 620);
		frmPorto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel principal = new JPanel();
		frmPorto.getContentPane().add(principal, BorderLayout.CENTER);
		principal.setLayout(new CardLayout(0, 0));

		panelMenuPrincipal = new JPanel();
		principal.add(panelMenuPrincipal, "name_1406476247233");
		panelMenuPrincipal.setLayout(null);

		JLabel lblMenuPrincipal = new JLabel("SELECIONE A OP\u00C7\u00C3O DESEJADA");
		lblMenuPrincipal.setForeground(Color.RED);
		lblMenuPrincipal.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblMenuPrincipal.setBounds(124, 11, 370, 44);
		panelMenuPrincipal.add(lblMenuPrincipal);

		JButton btnCadastrarNavio = new JButton("Cadastrar Navio");
		btnCadastrarNavio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				//Menu Inicial -> Cadastrar Navio
				panelMenuPrincipal.setVisible(false);
				panelCadastroNavio.setVisible(true);

			}
		});
		btnCadastrarNavio.setBackground(Color.BLUE);
		btnCadastrarNavio.setForeground(Color.WHITE);
		btnCadastrarNavio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadastrarNavio.setBounds(206, 66, 210, 60);
		panelMenuPrincipal.add(btnCadastrarNavio);

		JButton btnCadastrarCaminhao = new JButton("Cadastrar Caminh\u00E3o");
		btnCadastrarCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Menu Inicial -> Cadastrar Caminhão
				panelMenuPrincipal.setVisible(false);
				panelCadastroCaminhao.setVisible(true);
			}
		});
		btnCadastrarCaminhao.setForeground(Color.WHITE);
		btnCadastrarCaminhao.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadastrarCaminhao.setBackground(Color.BLUE);
		btnCadastrarCaminhao.setBounds(206, 137, 210, 60);
		panelMenuPrincipal.add(btnCadastrarCaminhao);

		JButton btnCarregarNavio = new JButton("Carregar Navio");
		btnCarregarNavio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Menu Inicial -> Carregar Navio
				panelMenuPrincipal.setVisible(false);
				panelCarregarNavio.setVisible(true);
			}
		});
		btnCarregarNavio.setForeground(Color.WHITE);
		btnCarregarNavio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCarregarNavio.setBackground(Color.BLUE);
		btnCarregarNavio.setBounds(206, 208, 210, 60);
		panelMenuPrincipal.add(btnCarregarNavio);

		JButton btnCarregarCaminhao = new JButton("Carregar Caminh\u00E3o");
		btnCarregarCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Menu Inicial -> Carregar Caminhão
				panelMenuPrincipal.setVisible(false);
				panelCarregarCaminhao.setVisible(true);
			}
		});
		btnCarregarCaminhao.setForeground(Color.WHITE);
		btnCarregarCaminhao.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCarregarCaminhao.setBackground(Color.BLUE);
		btnCarregarCaminhao.setBounds(206, 279, 210, 60);
		panelMenuPrincipal.add(btnCarregarCaminhao);

		JButton btnDescarregarNavio = new JButton("Descarregar Navio");
		btnDescarregarNavio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Menu Inicial -> Descarregar Navio
				panelMenuPrincipal.setVisible(false);
				panelDescarregarNavio.setVisible(true);
			}
		});
		btnDescarregarNavio.setForeground(Color.WHITE);
		btnDescarregarNavio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDescarregarNavio.setBackground(Color.BLUE);
		btnDescarregarNavio.setBounds(206, 350, 210, 60);
		panelMenuPrincipal.add(btnDescarregarNavio);

		JButton btnDescarregarCaminhao = new JButton("Descarregar Caminh\u00E3o");
		btnDescarregarCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Menu Inicial -> Descarregar Caminhão
				panelMenuPrincipal.setVisible(false);
				panelDescarregarCaminhao.setVisible(true);
			}
		});
		btnDescarregarCaminhao.setForeground(Color.WHITE);
		btnDescarregarCaminhao.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDescarregarCaminhao.setBackground(Color.BLUE);
		btnDescarregarCaminhao.setBounds(206, 421, 210, 60);
		panelMenuPrincipal.add(btnDescarregarCaminhao);

		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//SAIR
				System.exit(0);
			}
		});
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSair.setBackground(Color.BLUE);
		btnSair.setBounds(206, 492, 210, 60);
		panelMenuPrincipal.add(btnSair);

		panelCadastroNavio = new JPanel();
		principal.add(panelCadastroNavio, "name_2959873000418");
		panelCadastroNavio.setLayout(null);

		lblNewLabel = new JLabel("CADASTRO DE NAVIOS");
		lblNewLabel.setBounds(187, 32, 231, 25);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panelCadastroNavio.add(lblNewLabel);

		btnCadastroNavio_Menu = new JButton("Menu Inicial");
		btnCadastroNavio_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Cadastro Navio -> Menu
				panelCadastroNavio.setVisible(false);
				panelMenuPrincipal.setVisible(true);
			}
		});
		btnCadastroNavio_Menu.setBackground(Color.BLUE);
		btnCadastroNavio_Menu.setForeground(Color.WHITE);
		btnCadastroNavio_Menu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCadastroNavio_Menu.setBounds(258, 525, 111, 23);
		panelCadastroNavio.add(btnCadastroNavio_Menu);

		lblPlaca = new JLabel("Matr\u00EDcula");
		lblPlaca.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPlaca.setBounds(152, 91, 81, 14);
		panelCadastroNavio.add(lblPlaca);

		lblTransportadora = new JLabel("Transportadora");
		lblTransportadora.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTransportadora.setBounds(111, 116, 122, 14);
		panelCadastroNavio.add(lblTransportadora);

		lblMotorista = new JLabel("Comandante");
		lblMotorista.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMotorista.setBounds(141, 141, 92, 14);
		panelCadastroNavio.add(lblMotorista);


		MaskFormatter mascaraMatricula = new MaskFormatter("UUU-####");
		tf_Matricula = new JFormattedTextField(mascaraMatricula);
		//tf_Matricula = new JTextField();
		tf_Matricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_Matricula.setBounds(243, 90, 150, 20);
		panelCadastroNavio.add(tf_Matricula);
		tf_Matricula.setColumns(10);

		tf_TransportadoraNavio = new JTextField();
		tf_TransportadoraNavio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_TransportadoraNavio.setColumns(10);
		tf_TransportadoraNavio.setBounds(243, 115, 150, 20);
		panelCadastroNavio.add(tf_TransportadoraNavio);

		tf_Motorista = new JTextField();
		tf_Motorista.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_Motorista.setColumns(10);
		tf_Motorista.setBounds(243, 140, 150, 20);
		panelCadastroNavio.add(tf_Motorista);

		JButton btnCadNavio = new JButton("Cadastrar");
		btnCadNavio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// Cadastro de Navios
				DefaultTableModel dt = (DefaultTableModel) tableCadastroNavios.getModel();
				String placa = tf_Matricula.getText();
				String transportadora = tf_TransportadoraNavio.getText();
				String motorista = tf_Motorista.getText();
				if((placa.length() > 0) && (transportadora.length() > 0) && (motorista.length() > 0)) {
					dt.addRow(new String[] {placa,transportadora,motorista});
					
					//Aqui mostra msg de Cadastro Efetuado
					JOptionPane.showMessageDialog(null, "Navio Cadastrado com Sucesso!");
				}

				//Objeto Navio
				navios.add(new Navio(placa, transportadora, motorista));

				
			}
		});
		btnCadNavio.setForeground(new Color(255, 255, 255));
		btnCadNavio.setBackground(new Color(0, 128, 0));
		btnCadNavio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadNavio.setBounds(419, 87, 115, 23);
		panelCadastroNavio.add(btnCadNavio);

		JButton btnLimNavio = new JButton("Limpar");
		btnLimNavio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//limpar Campos Cadastro Navio
				tf_Matricula.setText("");
				tf_TransportadoraNavio.setText("");
				tf_Motorista.setText("");
			}
		});
		btnLimNavio.setForeground(Color.WHITE);
		btnLimNavio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimNavio.setBackground(Color.BLUE);
		btnLimNavio.setBounds(419, 119, 115, 23);
		panelCadastroNavio.add(btnLimNavio);

		JScrollPane scrollPaneNavio = new JScrollPane();
		scrollPaneNavio.setBounds(79, 201, 455, 287);
		panelCadastroNavio.add(scrollPaneNavio);

		tableCadastroNavios = new JTable();
		tableCadastroNavios.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Matrícula", "Transportadora","Comandante"
				}
				));
		scrollPaneNavio.setViewportView(tableCadastroNavios);

		JButton btnRemNavio = new JButton("Remover");
		btnRemNavio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// Aqui Remover Navio Tabela

				DefaultTableModel dt = (DefaultTableModel) tableCadastroNavios.getModel();
				// Se o número de linhas for maior que zero
				if((tableCadastroNavios.getRowCount() > 0) && (tableCadastroNavios.getSelectedRow() >= 0)) {
					// Remove a linha selecionada
					dt.removeRow(tableCadastroNavios.getSelectedRow());

					//Aqui mostra msg de Remoção Efetuada
					JOptionPane.showMessageDialog(null, "Navio Removido com Sucesso!");
				}



			}
		});
		btnRemNavio.setForeground(Color.WHITE);
		btnRemNavio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRemNavio.setBackground(Color.RED);
		btnRemNavio.setBounds(419, 151, 115, 23);
		panelCadastroNavio.add(btnRemNavio);


		panelCadastroCaminhao = new JPanel();
		principal.add(panelCadastroCaminhao, "name_3029757525104");
		panelCadastroCaminhao.setLayout(null);

		lblCadastroDeCaminhes = new JLabel("CADASTRO DE CAMINH\u00D5ES");
		lblCadastroDeCaminhes.setForeground(Color.RED);
		lblCadastroDeCaminhes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCadastroDeCaminhes.setBounds(187, 32, 292, 25);
		panelCadastroCaminhao.add(lblCadastroDeCaminhes);

		btnCadastroCaminhao_Menu = new JButton("Menu Inicial");
		btnCadastroCaminhao_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Cadastro Caminhao -> Menu
				panelCadastroCaminhao.setVisible(false);
				panelMenuPrincipal.setVisible(true);
			}
		});
		btnCadastroCaminhao_Menu.setForeground(Color.WHITE);
		btnCadastroCaminhao_Menu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCadastroCaminhao_Menu.setBackground(Color.BLUE);
		btnCadastroCaminhao_Menu.setBounds(258, 525, 111, 23);
		panelCadastroCaminhao.add(btnCadastroCaminhao_Menu);

		lblMatrcula = new JLabel("Placa");
		lblMatrcula.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMatrcula.setBounds(175, 93, 58, 14);
		panelCadastroCaminhao.add(lblMatrcula);

		MaskFormatter mascaraPlaca = new MaskFormatter("UUU-####");
		tf_Placa = new JFormattedTextField(mascaraPlaca);
		//tf_Placa = new JTextField();
		tf_Placa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_Placa.setColumns(10);
		tf_Placa.setBounds(243, 90, 150, 20);
		panelCadastroCaminhao.add(tf_Placa);

		label_1 = new JLabel("Transportadora");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(111, 118, 122, 14);
		panelCadastroCaminhao.add(label_1);

		tf_transportadoraCaminhao = new JTextField();
		tf_transportadoraCaminhao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_transportadoraCaminhao.setColumns(10);
		tf_transportadoraCaminhao.setBounds(243, 115, 150, 20);
		panelCadastroCaminhao.add(tf_transportadoraCaminhao);

		lblComandante = new JLabel("Motorista");
		lblComandante.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblComandante.setBounds(141, 142, 92, 14);
		panelCadastroCaminhao.add(lblComandante);

		tf_Comandante = new JTextField();
		tf_Comandante.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tf_Comandante.setColumns(10);
		tf_Comandante.setBounds(243, 140, 150, 20);
		panelCadastroCaminhao.add(tf_Comandante);

		btnCadCaminhao = new JButton("Cadastrar");
		btnCadCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Cadastrar Caminhão
				DefaultTableModel dt = (DefaultTableModel) tableCadastroCaminhao.getModel();
				String matricula = tf_Placa.getText();
				String transportadora = tf_transportadoraCaminhao.getText();
				String comandante = tf_Comandante.getText();
				if((matricula.length() > 0) && (transportadora.length() > 0) && (comandante.length() > 0)) {
					dt.addRow(new String[] {matricula,transportadora,comandante});
					
					//Aqui mostra msg de Cadastro Efetuado
					JOptionPane.showMessageDialog(null, "Caminhão Cadastrado com Sucesso!");
				}
				//Talvez tenha que subir o objeto pra dentro do IF
				//Objeto Caminhao
				caminhoes.add(new Caminhao(matricula, transportadora, comandante));

				
			}
		});
		btnCadCaminhao.setForeground(Color.WHITE);
		btnCadCaminhao.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCadCaminhao.setBackground(new Color(0, 128, 0));
		btnCadCaminhao.setBounds(419, 87, 115, 23);
		panelCadastroCaminhao.add(btnCadCaminhao);

		btnLimCaminhao = new JButton("Limpar");
		btnLimCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//limpar Campos Cadastro Caminhão
				tf_Placa.setText("");
				tf_transportadoraCaminhao.setText("");
				tf_Comandante.setText("");	
			}
		});
		btnLimCaminhao.setForeground(Color.WHITE);
		btnLimCaminhao.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimCaminhao.setBackground(Color.BLUE);
		btnLimCaminhao.setBounds(419, 119, 115, 23);
		panelCadastroCaminhao.add(btnLimCaminhao);

		btnRemCaminhao = new JButton("Remover");
		btnRemCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Aqui Remover Caminhao Tabela

				DefaultTableModel dt = (DefaultTableModel) tableCadastroCaminhao.getModel();
				// Se o número de linhas for maior que zero
				if((tableCadastroCaminhao.getRowCount() > 0) && (tableCadastroCaminhao.getSelectedRow() >= 0)) {
					// Remove a linha selecionada
					dt.removeRow(tableCadastroCaminhao.getSelectedRow());

					//Aqui mostra msg de Remoção Efetuada
					JOptionPane.showMessageDialog(null, "Caminhão Removido com Sucesso!");
				}

			}
		});
		btnRemCaminhao.setForeground(Color.WHITE);
		btnRemCaminhao.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRemCaminhao.setBackground(Color.RED);
		btnRemCaminhao.setBounds(419, 151, 115, 23);
		panelCadastroCaminhao.add(btnRemCaminhao);

		JScrollPane scrollPaneCaminhao = new JScrollPane();
		scrollPaneCaminhao.setBounds(79, 201, 455, 287);
		panelCadastroCaminhao.add(scrollPaneCaminhao);

		tableCadastroCaminhao = new JTable();
		tableCadastroCaminhao.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Placa", "Transportadora","Motorista"
				}
				));
		scrollPaneCaminhao.setViewportView(tableCadastroCaminhao);



		panelCarregarNavio = new JPanel();
		principal.add(panelCarregarNavio, "name_3051375505508");
		panelCarregarNavio.setLayout(null);

		lblCarregarNavio = new JLabel("CARREGAR  NAVIOS");
		lblCarregarNavio.setForeground(Color.RED);
		lblCarregarNavio.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCarregarNavio.setBounds(187, 32, 231, 25);
		panelCarregarNavio.add(lblCarregarNavio);

		btnCarregaNavio_Menu = new JButton("Menu Inicial");
		btnCarregaNavio_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Carregar Navio -> Menu
				panelCarregarNavio.setVisible(false);
				panelMenuPrincipal.setVisible(true);
			}
		});
		btnCarregaNavio_Menu.setForeground(Color.WHITE);
		btnCarregaNavio_Menu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCarregaNavio_Menu.setBackground(Color.BLUE);
		btnCarregaNavio_Menu.setBounds(258, 525, 111, 23);
		panelCarregarNavio.add(btnCarregaNavio_Menu);
		
		JLabel lblCodigoCarregarNavio = new JLabel("C\u00F3digo");
		lblCodigoCarregarNavio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCodigoCarregarNavio.setBounds(163, 81, 58, 24);
		panelCarregarNavio.add(lblCodigoCarregarNavio);
		
		tf_CodigoCarregarNavio = new JTextField();
		tf_CodigoCarregarNavio.setColumns(10);
		tf_CodigoCarregarNavio.setBounds(231, 85, 150, 20);
		panelCarregarNavio.add(tf_CodigoCarregarNavio);
		
		JButton btnCarregarContainerNavio = new JButton("Carregar");
		btnCarregarContainerNavio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AQUI TEM QUE FAZER O IF E COMPARAR SE O DESTINO DO CONTAINER É IGUAL A MATRICULA DO NAVIO
				
				DefaultTableModel dt = (DefaultTableModel) tableCarregarNavios.getModel();
				String matriculaNavio = tf_CodigoCarregarNavio.getText();
				String codigoContainer = tf_DestinoCarregarNavio.getText();
				String dataCarregamento = tf_DataCarregamentoNavio.getText();
				if((matriculaNavio.length() > 0) && (codigoContainer.length() > 0) && (dataCarregamento.length() > 0)) {
					
					//IF comaparar matricula com destino
					if (tableCadastroNavios.getColumn(tf_Matricula).equals(tableDescarregarNavio.getColumn(tf_CodigoContainerNavio))
						|| (tableCadastroNavios.getColumn(tf_Matricula).equals(tableDescarregarNavio.getColumn(tf_CodigoContainerCaminhao)))) {
						
						dt.addRow(new String[] {matriculaNavio,codigoContainer,dataCarregamento});
						
						//OBJETO
						saidas.add(new Saida(matriculaNavio, codigoContainer, dataCarregamento));
						
						//Aqui mostra msg de Remoção Efetuada
						JOptionPane.showMessageDialog(null, "Container Carregado no Navio com Sucesso!");
					}  else {
						//Aqui mostra msg de Remoção Efetuada
						JOptionPane.showMessageDialog(null, "O Navio não é o destino do Container!");
					}
					
					
				}
			}
		});
		btnCarregarContainerNavio.setForeground(Color.WHITE);
		btnCarregarContainerNavio.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCarregarContainerNavio.setBackground(new Color(0, 128, 0));
		btnCarregarContainerNavio.setBounds(409, 88, 115, 23);
		panelCarregarNavio.add(btnCarregarContainerNavio);
		
		JButton btnLimparCarregarNavio = new JButton("Limpar");
		btnLimparCarregarNavio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Limpar Campos
				tf_CodigoCarregarNavio.setText("");
				tf_DestinoCarregarNavio.setText("");
				tf_DataCarregamentoNavio.setText("");
			}
		});
		btnLimparCarregarNavio.setForeground(Color.WHITE);
		btnLimparCarregarNavio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimparCarregarNavio.setBackground(Color.BLUE);
		btnLimparCarregarNavio.setBounds(409, 120, 115, 23);
		panelCarregarNavio.add(btnLimparCarregarNavio);
		
		JButton btnRemoverCarregarNavio = new JButton("Remover");
		btnRemoverCarregarNavio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//VER CÓDIGO REMOVER
			}
		});
		btnRemoverCarregarNavio.setForeground(Color.WHITE);
		btnRemoverCarregarNavio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRemoverCarregarNavio.setBackground(Color.RED);
		btnRemoverCarregarNavio.setBounds(409, 152, 115, 23);
		panelCarregarNavio.add(btnRemoverCarregarNavio);
		
		
		MaskFormatter destinoCarregamentoNavio = new MaskFormatter("UUU-####");
		tf_DestinoCarregarNavio = new JFormattedTextField(destinoCarregamentoNavio);
		//tf_DestinoCarregarNavio = new JTextField();
		tf_DestinoCarregarNavio.setColumns(10);
		tf_DestinoCarregarNavio.setBounds(231, 116, 150, 20);
		panelCarregarNavio.add(tf_DestinoCarregarNavio);
		
		JLabel lblDestino_1 = new JLabel("Destino");
		lblDestino_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDestino_1.setBounds(163, 116, 58, 24);
		panelCarregarNavio.add(lblDestino_1);
		
		
		MaskFormatter dataCarregamento = new MaskFormatter("##/##/####");
		tf_DataCarregamentoNavio = new JFormattedTextField(dataCarregamento);
		//tf_DataCarregamento = new JTextField();
		tf_DataCarregamentoNavio.setColumns(10);
		tf_DataCarregamentoNavio.setBounds(231, 155, 150, 20);
		panelCarregarNavio.add(tf_DataCarregamentoNavio);
		
		JLabel lblDataCarregamento = new JLabel("Data Carregamento");
		lblDataCarregamento.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDataCarregamento.setBounds(76, 151, 145, 24);
		panelCarregarNavio.add(lblDataCarregamento);
		
		JScrollPane scrollPaneMostraContainersNavio = new JScrollPane();
		scrollPaneMostraContainersNavio.setBounds(27, 211, 555, 84);
		panelCarregarNavio.add(scrollPaneMostraContainersNavio);
		
		tableCarregarContainersNavio = new JTable();
		tableCarregarContainersNavio.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Código","Localização" ,"Destino", "Data Carregamento"
				}
				
			));
		scrollPaneMostraContainersNavio.setViewportView(tableCarregarContainersNavio);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Mostra Containers que tem cadastrado 
				DefaultTableModel dt = (DefaultTableModel) tableCarregarContainersNavio.getModel();
				if (containers.isEmpty()) {
					dt.addRow(new String[] {"Sem informações","Sem informações","Sem informações","Sem informações"});
				} else {
					for (int i = 0; i < containers.size(); i++) {
						dt.addRow(new String[] {containers.get(i).getCodigo(), containers.get(i).getLocalizacao(),
								containers.get(i).getDestino(), containers.get(i).getDataSaida() });
					}
				}
				
				//Mostra Navios que tem cadastrados
				DefaultTableModel dt2 = (DefaultTableModel) tableCarregarNavios.getModel();
				if (navios.isEmpty()) {
					dt2.addRow(new String[] {"Sem informações","Sem informações","Sem informações"});
				} else {
					for (int i = 0; i < navios.size(); i++) {
						dt2.addRow(new String[] {navios.get(i).getMatricula(), navios.get(i).getTransportadora(),
								navios.get(i).getComandante()});
					}
				}
				
				//Mostra Navios com Containers    REVER O ARRAYLIST EM QUE NAVIOS+CONTAINERS CARREGADOS
				DefaultTableModel dt3 = (DefaultTableModel) tableCarregamentosNavio.getModel();
				if (navios.isEmpty()) {
					dt3.addRow(new String[] {"Sem informações","Sem informações","Sem informações"});
				} else {
					for (int i = 0; i < navios.size(); i++) {
						dt3.addRow(new String[] {navios.get(i).getMatricula(), containers.get(i).getCodigo(),
								containers.get(i).getDataSaida()});
					}
				}
				
				
			}
		});
		btnAtualizar.setForeground(Color.WHITE);
		btnAtualizar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAtualizar.setBackground(new Color(0, 128, 128));
		btnAtualizar.setBounds(409, 54, 115, 23);
		panelCarregarNavio.add(btnAtualizar);
		
		lblNewLabel_1 = new JLabel("CONTAINERS DO P\u00C1TIO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(207, 186, 194, 27);
		panelCarregarNavio.add(lblNewLabel_1);
		
		lblNaviosFila = new JLabel("FILA NAVIOS ");
		lblNaviosFila.setForeground(Color.RED);
		lblNaviosFila.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNaviosFila.setBounds(244, 295, 125, 27);
		panelCarregarNavio.add(lblNaviosFila);
		
		scrollPaneMostraNavios = new JScrollPane();
		scrollPaneMostraNavios.setBounds(27, 321, 555, 77);
		panelCarregarNavio.add(scrollPaneMostraNavios);
		
		tableCarregarNavios = new JTable();
		tableCarregarNavios.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Matrícula","Transporte" ,"Comandante"
				}
				
			));
		scrollPaneMostraNavios.setViewportView(tableCarregarNavios);
		
		lblCarregamentoNavios = new JLabel("CARREGAMENTO NAVIOS");
		lblCarregamentoNavios.setForeground(Color.RED);
		lblCarregamentoNavios.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCarregamentoNavios.setBounds(207, 409, 211, 27);
		panelCarregarNavio.add(lblCarregamentoNavios);
		
		scrollPaneCarregamentoNavios = new JScrollPane();
		scrollPaneCarregamentoNavios.setBounds(27, 430, 555, 84);
		panelCarregarNavio.add(scrollPaneCarregamentoNavios);
		
		tableCarregamentosNavio = new JTable();
		tableCarregamentosNavio.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Matrícula Navio","Código Container","Data Carregamento"
				}
				
			));
		scrollPaneCarregamentoNavios.setViewportView(tableCarregamentosNavio);

		panelCarregarCaminhao = new JPanel();
		principal.add(panelCarregarCaminhao, "name_3106086129585");
		panelCarregarCaminhao.setLayout(null);

		lblCarregarCaminhes = new JLabel("CARREGAR CAMINH\u00D5ES");
		lblCarregarCaminhes.setForeground(Color.RED);
		lblCarregarCaminhes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCarregarCaminhes.setBounds(187, 32, 256, 25);
		panelCarregarCaminhao.add(lblCarregarCaminhes);

		btnCarregaCaminhao_Menu = new JButton("Menu Inicial");
		btnCarregaCaminhao_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Carregar Caminhao -> Menu
				panelCarregarCaminhao.setVisible(false);
				panelMenuPrincipal.setVisible(true);
			}
		});
		btnCarregaCaminhao_Menu.setForeground(Color.WHITE);
		btnCarregaCaminhao_Menu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCarregaCaminhao_Menu.setBackground(Color.BLUE);
		btnCarregaCaminhao_Menu.setBounds(258, 525, 111, 23);
		panelCarregarCaminhao.add(btnCarregaCaminhao_Menu);

		panelDescarregarNavio = new JPanel();
		principal.add(panelDescarregarNavio, "name_3129366274735");
		panelDescarregarNavio.setLayout(null);

		lblDescarregarDeNavios = new JLabel("DESCARREGAR DE NAVIOS");
		lblDescarregarDeNavios.setForeground(Color.RED);
		lblDescarregarDeNavios.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDescarregarDeNavios.setBounds(182, 32, 282, 25);
		panelDescarregarNavio.add(lblDescarregarDeNavios);

		btnDescarregaNavio_Menu = new JButton("Menu Inicial");
		btnDescarregaNavio_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Descarregar Navio -> Menu
				panelDescarregarNavio.setVisible(false);
				panelMenuPrincipal.setVisible(true);
			}
		});
		btnDescarregaNavio_Menu.setForeground(Color.WHITE);
		btnDescarregaNavio_Menu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDescarregaNavio_Menu.setBackground(Color.BLUE);
		btnDescarregaNavio_Menu.setBounds(258, 525, 111, 23);
		panelDescarregarNavio.add(btnDescarregaNavio_Menu);

		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCdigo.setBounds(192, 68, 58, 24);
		panelDescarregarNavio.add(lblCdigo);

		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDescrio.setBounds(163, 103, 87, 24);
		panelDescarregarNavio.add(lblDescrio);

		JLabel lblLocalizao = new JLabel("Localiza\u00E7\u00E3o");
		lblLocalizao.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLocalizao.setBounds(154, 135, 94, 24);
		panelDescarregarNavio.add(lblLocalizao);

		JLabel lblOrigem = new JLabel("Origem");
		lblOrigem.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOrigem.setBounds(184, 164, 66, 24);
		panelDescarregarNavio.add(lblOrigem);

		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDestino.setBounds(182, 199, 66, 24);
		panelDescarregarNavio.add(lblDestino);

		JLabel lblDataEntrada = new JLabel("Data Entrada");
		lblDataEntrada.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDataEntrada.setBounds(145, 224, 103, 24);
		panelDescarregarNavio.add(lblDataEntrada);

		JLabel lblDataSada = new JLabel("Data Sa\u00EDda");
		lblDataSada.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDataSada.setBounds(163, 248, 85, 24);
		panelDescarregarNavio.add(lblDataSada);

		tf_CodigoContainerNavio = new JTextField();
		tf_CodigoContainerNavio.setBounds(258, 72, 150, 20);
		panelDescarregarNavio.add(tf_CodigoContainerNavio);
		tf_CodigoContainerNavio.setColumns(10);

		tf_DescricaoContainerNavio = new JTextField();
		tf_DescricaoContainerNavio.setColumns(10);
		tf_DescricaoContainerNavio.setBounds(258, 103, 150, 20);
		panelDescarregarNavio.add(tf_DescricaoContainerNavio);

		tf_LocalizacaoContainerNavio = new JTextField();
		tf_LocalizacaoContainerNavio.setColumns(10);
		tf_LocalizacaoContainerNavio.setBounds(258, 139, 150, 20);
		panelDescarregarNavio.add(tf_LocalizacaoContainerNavio);

		MaskFormatter mascaraOrigemNavio = new MaskFormatter("UUU-####");
		tf_OrigemContainerNavio = new JFormattedTextField(mascaraOrigemNavio);
		//tf_OrigemContainerNavio = new JTextField();
		tf_OrigemContainerNavio.setColumns(10);
		tf_OrigemContainerNavio.setBounds(258, 168, 150, 20);
		panelDescarregarNavio.add(tf_OrigemContainerNavio);

		
		MaskFormatter mascaraDestinoNavio = new MaskFormatter("UUU-####");
		tf_DestinoContainerNavio = new JFormattedTextField(mascaraDestinoNavio);
		//tf_DestinoContainerNavio = new JTextField();
		tf_DestinoContainerNavio.setColumns(10);
		tf_DestinoContainerNavio.setBounds(258, 203, 150, 20);
		panelDescarregarNavio.add(tf_DestinoContainerNavio);

		
		MaskFormatter dataEntrada = new MaskFormatter("##/##/####");
		tf_DataEntradaContainerNavio = new JFormattedTextField(dataEntrada);
		//tf_DataEntradaContainerNavio = new JTextField();
		tf_DataEntradaContainerNavio.setColumns(10);
		tf_DataEntradaContainerNavio.setBounds(258, 228, 150, 20);
		panelDescarregarNavio.add(tf_DataEntradaContainerNavio);

		
		MaskFormatter dataSaida = new MaskFormatter("##/##/####");
		tf_DataSaidaContainerNavio = new JFormattedTextField(dataSaida);
		//tf_DataSaidaContainerNavio = new JTextField();
		tf_DataSaidaContainerNavio.setColumns(10);
		tf_DataSaidaContainerNavio.setBounds(258, 252, 150, 20);
		panelDescarregarNavio.add(tf_DataSaidaContainerNavio);

		JButton btnRemoverDescarregarNavio = new JButton("Remover");
		btnRemoverDescarregarNavio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel dt = (DefaultTableModel) tableDescarregarNavio.getModel();
				// Se o número de linhas for maior que zero
				if((tableDescarregarNavio.getRowCount() > 0) && (tableDescarregarNavio.getSelectedRow() >= 0)) {
					// Remove a linha selecionada
					dt.removeRow(tableDescarregarNavio.getSelectedRow());
				}
				
				//Aqui mostra msg de Remoção Efetuada
				JOptionPane.showMessageDialog(null, "Container Removido com Sucesso!");
			}
		});
		btnRemoverDescarregarNavio.setForeground(Color.WHITE);
		btnRemoverDescarregarNavio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRemoverDescarregarNavio.setBackground(Color.RED);
		btnRemoverDescarregarNavio.setBounds(438, 184, 115, 23);
		panelDescarregarNavio.add(btnRemoverDescarregarNavio);

		JButton btnLimparDescarregarNavio = new JButton("Limpar");
		btnLimparDescarregarNavio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Limpar Descarregar Navio
				tf_CodigoContainerNavio.setText("");
				tf_DescricaoContainerNavio.setText("");
				tf_LocalizacaoContainerNavio.setText("");
				tf_OrigemContainerNavio.setText("");
				tf_DestinoContainerNavio.setText("");
				tf_DataEntradaContainerNavio.setText("");
				tf_DataSaidaContainerNavio.setText("");
			}
		});
		btnLimparDescarregarNavio.setForeground(Color.WHITE);
		btnLimparDescarregarNavio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimparDescarregarNavio.setBackground(Color.BLUE);
		btnLimparDescarregarNavio.setBounds(438, 152, 115, 23);
		panelDescarregarNavio.add(btnLimparDescarregarNavio);

		JButton btnCadastroDescarregarNavio = new JButton("Descarregar");
		btnCadastroDescarregarNavio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); 
			    Date date = new Date(); */
				// POR ENQUANTO USEI STRING NA DATA 
				
				
				DefaultTableModel dt = (DefaultTableModel) tableDescarregarNavio.getModel();
				String codigo = tf_CodigoContainerNavio.getText();
				String descricao = tf_DescricaoContainerNavio.getText();
				String localizacao = tf_LocalizacaoContainerNavio.getText();
				String origem = tf_OrigemContainerNavio.getText();
				String destino = tf_DestinoContainerNavio.getText();

				String dataEntrada = tf_DataEntradaContainerNavio.getText(); //Converter DATE
				String dataSaida = tf_DataSaidaContainerNavio.getText(); //Converter DATE
				
				if((codigo.length() > 0) && (descricao.length() > 0) && (localizacao.length() > 0) &&
						(origem.length() > 0) && (destino.length() > 0) && (dataEntrada.length() > 0) 
						&& (dataSaida.length() > 0)) {
					dt.addRow(new String[] {codigo,descricao,localizacao,origem,destino,dataEntrada,dataSaida});

					//Aqui mostra msg de Cadastro Efetuado
					JOptionPane.showMessageDialog(null, "Container Cadastrado com Sucesso!");
				}
				
				//Objeto Container    MAS DEVO CRIAR E TROCAR POR OUTRO ARRAYLIST PARA O REGISTRO ex: <Container> regSaidaNavio
				containers.add(new Container(codigo, descricao, localizacao, origem, destino, dataEntrada, dataSaida));
				
				
			}
		});
		btnCadastroDescarregarNavio.setForeground(Color.WHITE);
		btnCadastroDescarregarNavio.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCadastroDescarregarNavio.setBackground(new Color(0, 128, 0));
		btnCadastroDescarregarNavio.setBounds(438, 120, 115, 23);
		panelDescarregarNavio.add(btnCadastroDescarregarNavio);

		JScrollPane scrollPaneDescarregarNavio = new JScrollPane();
		scrollPaneDescarregarNavio.setBounds(10, 322, 584, 192);
		panelDescarregarNavio.add(scrollPaneDescarregarNavio);

		tableDescarregarNavio = new JTable();
		tableDescarregarNavio.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Código", "Descrição","Localização","Remetente","Destino","Data Entrada","Data Saída"
				}
				));
		scrollPaneDescarregarNavio.setViewportView(tableDescarregarNavio);

		panelDescarregarCaminhao = new JPanel();
		principal.add(panelDescarregarCaminhao, "name_3209772920672");
		panelDescarregarCaminhao.setLayout(null);

		lblDescarregarcaminho = new JLabel("DESCARREGAR CAMINH\u00C3O");
		lblDescarregarcaminho.setForeground(Color.RED);
		lblDescarregarcaminho.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDescarregarcaminho.setBounds(182, 32, 286, 25);
		panelDescarregarCaminhao.add(lblDescarregarcaminho);

		btnDescarregaCaminhao_Menu = new JButton("Menu Inicial");
		btnDescarregaCaminhao_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Descarregar Caminhão -> Menu
				panelDescarregarCaminhao.setVisible(false);
				panelMenuPrincipal.setVisible(true);
			}
		});
		btnDescarregaCaminhao_Menu.setForeground(Color.WHITE);
		btnDescarregaCaminhao_Menu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDescarregaCaminhao_Menu.setBackground(Color.BLUE);
		btnDescarregaCaminhao_Menu.setBounds(258, 525, 111, 23);
		panelDescarregarCaminhao.add(btnDescarregaCaminhao_Menu);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCodigo.setBounds(220, 68, 58, 24);
		panelDescarregarCaminhao.add(lblCodigo);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o");
		lblDescricao.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDescricao.setBounds(191, 103, 87, 24);
		panelDescarregarCaminhao.add(lblDescricao);
		
		JLabel lblLocalizacao = new JLabel("Localiza\u00E7\u00E3o");
		lblLocalizacao.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLocalizacao.setBounds(182, 135, 94, 24);
		panelDescarregarCaminhao.add(lblLocalizacao);
		
		JLabel label_4 = new JLabel("Origem");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(212, 164, 66, 24);
		panelDescarregarCaminhao.add(label_4);
		
		JLabel label_5 = new JLabel("Destino");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(210, 199, 66, 24);
		panelDescarregarCaminhao.add(label_5);
		
		JLabel label_6 = new JLabel("Data Entrada");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_6.setBounds(173, 224, 103, 24);
		panelDescarregarCaminhao.add(label_6);
		
		JLabel lblDataSaida = new JLabel("Data Sa\u00EDda");
		lblDataSaida.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDataSaida.setBounds(191, 248, 85, 24);
		panelDescarregarCaminhao.add(lblDataSaida);
		
		tf_CodigoContainerCaminhao = new JTextField();
		tf_CodigoContainerCaminhao.setColumns(10);
		tf_CodigoContainerCaminhao.setBounds(286, 72, 150, 20);
		panelDescarregarCaminhao.add(tf_CodigoContainerCaminhao);
		
		tf_DescricaoContainerCaminhao = new JTextField();
		tf_DescricaoContainerCaminhao.setColumns(10);
		tf_DescricaoContainerCaminhao.setBounds(286, 103, 150, 20);
		panelDescarregarCaminhao.add(tf_DescricaoContainerCaminhao);
		
		tf_LocalizacaoContainerCaminhao = new JTextField();
		tf_LocalizacaoContainerCaminhao.setColumns(10);
		tf_LocalizacaoContainerCaminhao.setBounds(286, 139, 150, 20);
		panelDescarregarCaminhao.add(tf_LocalizacaoContainerCaminhao);
		
		
		MaskFormatter mascaraOrigemCaminhao = new MaskFormatter("UUU-####");
		tf_OrigemContainerCaminhao = new JFormattedTextField(mascaraOrigemCaminhao);
		//tf_OrigemContainerCaminhao = new JFormattedTextField((AbstractFormatter) null);
		tf_OrigemContainerCaminhao.setColumns(10);
		tf_OrigemContainerCaminhao.setBounds(286, 168, 150, 20);
		panelDescarregarCaminhao.add(tf_OrigemContainerCaminhao);
		
		
		MaskFormatter mascaraDestinoCaminhao = new MaskFormatter("UUU-####");
		tf_DestinoContainerCaminhao = new JFormattedTextField(mascaraDestinoCaminhao);
		//tf_DestinoContainerCaminhao = new JFormattedTextField((AbstractFormatter) null);
		tf_DestinoContainerCaminhao.setColumns(10);
		tf_DestinoContainerCaminhao.setBounds(286, 203, 150, 20);
		panelDescarregarCaminhao.add(tf_DestinoContainerCaminhao);
		
		
		MaskFormatter mascaraDataEntradaCaminhao= new MaskFormatter("##/##/####");
		tf_DataEntradaContainerCaminhao = new JFormattedTextField(mascaraDataEntradaCaminhao);
		//tf_DataEntradaContainerCaminhao = new JFormattedTextField((AbstractFormatter) null);
		tf_DataEntradaContainerCaminhao.setColumns(10);
		tf_DataEntradaContainerCaminhao.setBounds(286, 228, 150, 20);
		panelDescarregarCaminhao.add(tf_DataEntradaContainerCaminhao);
		
		MaskFormatter mascaraDataSaidaCaminhao= new MaskFormatter("##/##/####");
		tf_DataSaidaContainerCaminhao = new JFormattedTextField(mascaraDataSaidaCaminhao);
		//tf_DataSaidaContainerCaminhao = new JFormattedTextField((AbstractFormatter) null);
		tf_DataSaidaContainerCaminhao.setColumns(10);
		tf_DataSaidaContainerCaminhao.setBounds(286, 252, 150, 20);
		panelDescarregarCaminhao.add(tf_DataSaidaContainerCaminhao);
		
		JButton btnRemoverDescarregarCaminhao = new JButton("Remover");
		btnRemoverDescarregarCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultTableModel dt = (DefaultTableModel) tableDescarregarCaminhao.getModel();
				// Se o número de linhas for maior que zero
				if((tableDescarregarCaminhao.getRowCount() > 0) && (tableDescarregarCaminhao.getSelectedRow() >= 0)) {
					// Remove a linha selecionada
					dt.removeRow(tableDescarregarCaminhao.getSelectedRow());
				}
				
				//Aqui mostra msg de Remoção Efetuada
				JOptionPane.showMessageDialog(null, "Container Removido com Sucesso!");
			}
		});
		btnRemoverDescarregarCaminhao.setForeground(Color.WHITE);
		btnRemoverDescarregarCaminhao.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRemoverDescarregarCaminhao.setBackground(Color.RED);
		btnRemoverDescarregarCaminhao.setBounds(466, 184, 115, 23);
		panelDescarregarCaminhao.add(btnRemoverDescarregarCaminhao);
		
		JButton btnLimparDescarregarCaminhao = new JButton("Limpar");
		btnLimparDescarregarCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Limpar Campos
				tf_CodigoContainerCaminhao.setText("");
				tf_DescricaoContainerCaminhao.setText("");
				tf_LocalizacaoContainerCaminhao.setText("");
				tf_OrigemContainerCaminhao.setText("");
				tf_DestinoContainerCaminhao.setText("");
				tf_DataEntradaContainerCaminhao.setText("");
				tf_DataSaidaContainerCaminhao.setText("");		
			}
		});
		btnLimparDescarregarCaminhao.setForeground(Color.WHITE);
		btnLimparDescarregarCaminhao.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimparDescarregarCaminhao.setBackground(Color.BLUE);
		btnLimparDescarregarCaminhao.setBounds(466, 152, 115, 23);
		panelDescarregarCaminhao.add(btnLimparDescarregarCaminhao);
		
		JButton btnCadastrarDescarregarCaminhao = new JButton("Descarregar");
		btnCadastrarDescarregarCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel dt = (DefaultTableModel) tableDescarregarCaminhao.getModel();
				String codigo = tf_CodigoContainerCaminhao.getText();
				String descricao = tf_DescricaoContainerCaminhao.getText();
				String localizacao = tf_LocalizacaoContainerCaminhao.getText();
				String origem = tf_OrigemContainerCaminhao.getText();
				String destino = tf_DestinoContainerCaminhao.getText();

				String dataEntrada = tf_DataEntradaContainerCaminhao.getText(); //Converter DATE
				String dataSaida = tf_DataSaidaContainerCaminhao.getText(); //Converter DATE
				
				if((codigo.length() > 0) && (descricao.length() > 0) && (localizacao.length() > 0) &&
						(origem.length() > 0) && (destino.length() > 0) && (dataEntrada.length() > 0) 
						&& (dataSaida.length() > 0)) {
					dt.addRow(new String[] {codigo,descricao,localizacao,origem,destino,dataEntrada,dataSaida});
					
					//Aqui mostra msg de Cadastro Efetuado
					JOptionPane.showMessageDialog(null, "Container Cadastrado com Sucesso!");
				}
				
				//Objeto Container   MAS DEVO CRIAR E TROCAR POR OUTRO ARRAYLIST PARA O REGISTRO ex: <Container> regSaidaCaminhao
				containers.add(new Container(codigo, descricao, localizacao, origem, destino, dataEntrada, dataSaida));
				
				
				
			}
		});
		btnCadastrarDescarregarCaminhao.setForeground(Color.WHITE);
		btnCadastrarDescarregarCaminhao.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCadastrarDescarregarCaminhao.setBackground(new Color(0, 128, 0));
		btnCadastrarDescarregarCaminhao.setBounds(466, 120, 115, 23);
		panelDescarregarCaminhao.add(btnCadastrarDescarregarCaminhao);
		
		JScrollPane scrollPanedescarregaCaminhao = new JScrollPane();
		scrollPanedescarregaCaminhao.setBounds(10, 322, 584, 192);
		panelDescarregarCaminhao.add(scrollPanedescarregaCaminhao);
		
		tableDescarregarCaminhao = new JTable();
		tableDescarregarCaminhao.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Código", "Descrição","Localização","Remetente","Destino","Data Entrada","Data Saída"
				}
				));
		scrollPanedescarregaCaminhao.setViewportView(tableDescarregarCaminhao);
	}
}
