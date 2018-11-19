public class SpaceInvaderGUI extends JFrame {
	
	public static Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
	//public JPanel grilleta;
	public Image naveImagen;
	private Container contentPane;

	
	
	public SpaceInvaderGUI() {
		
		//super("SPOOB Invaders");
		prepareElements();
		prepareAcciones();
		
	}
	public void prepareElements() {
		contentPane=getContentPane();
		setTitle("SPOOB Invaders");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setLayout(new BorderLayout());
		setSize((int)(screenSize.getWidth()),(int)(screenSize.getHeight()));
		setResizable(false);
		//setLocationRelativeTo(null);
		//setBackground(Color.BLACK);
		contentPane.add(new Menu(),BorderLayout.CENTER);
		//contentPane.
		validate();
		//grid();
		
	}
	
	private void prepareAcciones() {
		addWindowListener (new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				accionSalir();
			}
		});
		
	}
	
	private void accionSalir() {
		int salidaConfirmada=JOptionPane.showConfirmDialog(null,"¿Esta seguro que desea salir?","",JOptionPane.YES_NO_OPTION);
		if(salidaConfirmada==JOptionPane.YES_OPTION) {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else {
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
		
		}

	/*public static void main(String[] args) {
		SpaceInvaderGUI sp = new SpaceInvaderGUI();
		sp.setVisible(true);
		
	}*/
	
	/*public void grid() {
		grilleta=new JPanel();
		grilleta.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        grilleta.setLayout(new  GridLayout(7,7,3,3));
        grilleta.setBackground(Color.BLACK);
        add(grilleta,BorderLayout.CENTER);
		
		
	} */
	/*public void paintComponent (Graphics g) {
		super.paintComponents(g);
		drawing(g);
		Toolkit.getDefaultToolkit();
	}
	
	
	
	public void drawing(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(naveImagen,70,50,this);
		setAdequateTargetImage(1);
		
	}*/
	

}
