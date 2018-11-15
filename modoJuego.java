package Presentacion;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;

public class modoJuego extends JPanel{
	private JButton user;
	private JButton userVsUser;
	private JButton userVsPc;
	private ImageIcon userOne;
	private ImageIcon userVs;
	private ImageIcon userPc;
	private Image background;
	private JLabel encabezado;
	private JLabel muñecoOne;
	private JLabel muñecoTwo;
	Game p;
	
	
	
	
	
	public modoJuego() {
		//p= new Player(modoJuego_Width/2,modoJuego_Height/2);
		
		prepareElementos();
		prepareAcciones();
		
	}
	
	private void prepareElementos() {
		background = new ImageIcon(getClass().getResource("/Resources/background.png")).getImage();
		setLayout(null);
		prepareBotones();
		
		
		
		ImageIcon portada= new ImageIcon(getClass().getResource("/Resources/space-invaders-logo.png"));
		portada=new ImageIcon(portada.getImage().getScaledInstance(550,150,java.awt.Image.SCALE_DEFAULT));
		encabezado=new JLabel(portada);
		encabezado.setBounds(700,0,550,150);
		add(encabezado);
		
	
	}
	
	private void prepareBotones() {
		int ancho = 500;
		int alto=100;
		
		//Boton de un solo jugador 
		ImageIcon unJugador = new ImageIcon (getClass().getResource("/Resources/player.png"));
		unJugador=new ImageIcon(unJugador.getImage().getScaledInstance(ancho,alto,java.awt.Image.SCALE_DEFAULT));
		ImageIcon dosJugadores=new ImageIcon(getClass().getResource("/Resources/unPlayer.png"));
		dosJugadores= new ImageIcon(dosJugadores.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
		ImageIcon panelControl= new ImageIcon(getClass().getResource("/Resources/paneljugar.png"));
		ImageIcon panelControl2= new ImageIcon(getClass().getResource("/Resources/paneljugar2.png"));
		panelControl= new ImageIcon(panelControl.getImage().getScaledInstance(534, 110, java.awt.Image.SCALE_DEFAULT));
		panelControl2=new ImageIcon(panelControl2.getImage().getScaledInstance(534, 110, java.awt.Image.SCALE_DEFAULT));
		user = new JButton("1 Player", panelControl);
		userVsUser=new JButton ("2 Players",panelControl2);
		muñecoOne=new JLabel(unJugador);
		muñecoTwo=new JLabel(dosJugadores);
		user.setBorderPainted(false);
		user.setContentAreaFilled(false); 
		user.setFocusPainted(false); 
		user.setOpaque(false);
		user.setHorizontalTextPosition(SwingConstants.CENTER);
		user.setHorizontalTextPosition(SwingConstants.CENTER);
		Font fuente2 = new Font("Rockwell", Font.PLAIN, 70);
		user.setFont(fuente2);
		user.setForeground(java.awt.Color.BLACK);
		user.setBounds(800,370,ancho,alto);
		userVsUser.setBorderPainted(false);
		userVsUser.setContentAreaFilled(false); 
		userVsUser.setFocusPainted(false); 
		userVsUser.setOpaque(false);
		userVsUser.setHorizontalTextPosition(SwingConstants.CENTER);
		userVsUser.setHorizontalTextPosition(SwingConstants.CENTER);
		userVsUser.setFont(fuente2);
		userVsUser.setForeground(java.awt.Color.BLACK);
		userVsUser.setBounds(800,520,ancho,alto);
		muñecoOne.setBounds(500, 300, 250 ,250);
		muñecoTwo.setBounds(500,450,250,250);
		//muñecoOne.setBounds(1500, 1100, 1500, 400);
		
		
		
	
		//Adicionar boton de jugador 
		add(user);
		add(muñecoOne);
		add(userVsUser);
		add(muñecoTwo);
		
	}
	
	private void prepareAcciones() {
		user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				accionJugar("user");
			}
		});
		
	}
	
	
	private void accionJugar(String modo) {
		
		Main.sp.getContentPane().removeAll();
		Main.sp.getContentPane().add(new Game(modo),BorderLayout.CENTER);
		Main.sp.repaint();
		Main.sp.validate();
		
		
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(background,0,0,getWidth(),getHeight(),this);
	}

	
	

}
