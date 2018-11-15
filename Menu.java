package Presentacion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class Menu extends JPanel{
	
	private Image fondo;
	//private ImageIcon spaceLogo;
	
	private JButton play;
	private JButton help;
	private JButton exit;
	private JLabel logo;
	
	public Menu() {
		
		prepareElementos();
		prepareAcciones();
		
	}
	
	private void prepareElementos() {
		//Background del juego 
		fondo= new ImageIcon(getClass().getResource("/Resources/background.png")).getImage();
		//Quitar el BorderLayout
		setLayout(null);
		//Preparando los botones del menu
		prepararBotones() ;
		
	}
	
	private void prepararBotones() {
		ImageIcon spaceLogo= new ImageIcon(getClass().getResource("/Resources/space-invaders-logo.png"));
		ImageIcon panelControl= new ImageIcon(getClass().getResource("/Resources/paneljugar.png"));
		ImageIcon panelControl2= new ImageIcon(getClass().getResource("/Resources/paneljugar2.png"));
		panelControl= new ImageIcon(panelControl.getImage().getScaledInstance(534, 110, java.awt.Image.SCALE_DEFAULT));
		panelControl2=new ImageIcon(panelControl2.getImage().getScaledInstance(534, 110, java.awt.Image.SCALE_DEFAULT));
		
		//Inicializando los botones 
		play=new JButton("Play",panelControl);
		//panelControl=new ImageIcon(panelControl.getImage)
		help=new JButton("Help",panelControl2);
		exit=new JButton("Exit",panelControl);
		logo= new JLabel(spaceLogo);
		
		//Posiciones de los botones
		Dimension screenSize=SpaceInvaderGUI.screenSize;
		play.setBounds(screenSize.width-1250,screenSize.height-700,486,110);
		help.setBounds(screenSize.width-1250,screenSize.height-560,486,110);
		exit.setBounds(screenSize.width-1250,screenSize.height-420,486,100);
		logo.setBounds(screenSize.width-1780, screenSize.height-1100, 1500, 400);
		
		
		//Botones transparentes
		play.setBorderPainted(false);
		play.setContentAreaFilled(false);
		play.setFocusPainted(false);
		play.setOpaque(false);
		play.setHorizontalTextPosition(SwingConstants.CENTER);
		
		help.setBorderPainted(false);
		help.setContentAreaFilled(false);
		help.setFocusPainted(false);
		help.setOpaque(false);
		help.setHorizontalTextPosition(SwingConstants.CENTER);
		
		exit.setBorderPainted(false);
		exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);
		exit.setOpaque(false);
		exit.setHorizontalTextPosition(SwingConstants.CENTER);		
		
		
		//Texto 
		play.setHorizontalTextPosition(SwingConstants.CENTER);
		help.setHorizontalTextPosition(SwingConstants.CENTER);
		exit.setHorizontalTextPosition(SwingConstants.CENTER);
		
		//Tipo texto
		//Font fuente1 = new Font("Ravie", Font.BOLD, 72);
		Font fuente2 = new Font("Rockwell", Font.PLAIN, 70);
		//Font fuente3 = new Font("Goudy Stout", Font.PLAIN, 18);
		play.setFont(fuente2);
		help.setFont(fuente2);
		exit.setFont(fuente2);
		play.setForeground(java.awt.Color.BLACK);
		help.setForeground(java.awt.Color.BLACK);
		exit.setForeground(java.awt.Color.BLACK);
		
		//Agregando los botones
		add(play);
		add(help);
		add(exit);
		add(logo);
	}
	
	
	private void prepareAcciones() {
		//Salir
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				accionSalir();
				
			}
		});
		
		//Jugar
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				accionJugar();
			}
		});
		
		/*help.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent ev) {
				accionHelp();
		
			}
		});*/
	}
	
	private void accionSalir() {
		int confirmacionSalir = JOptionPane.showConfirmDialog(null,"¿Esta seguro que desea salir?","",JOptionPane.YES_NO_OPTION);
		if(confirmacionSalir==JOptionPane.YES_OPTION) {
			setVisible(false);
			System.exit(0);
		}
	}
	
	private void accionJugar() {
		Main.sp.getContentPane().removeAll();
		
		Main.sp.getContentPane().add(new modoJuego(),BorderLayout.CENTER);
		Main.sp.validate();
		
	}
	
	/*private void accionHelp() {
		Main.sp.getContentPane().removeAll();
		Main.sp.getContentPane().add(new Help(), BorderLayout.CENTER);
		Main.sp.validate();
		
	}*/

	public void paintComponent(Graphics g){
		g.drawImage(fondo,0,0,getWidth(),getHeight(),this);
	}

	
	
	}
