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

public class NaveGUI extends JPanel{
	
	private Image background;
	private ImageIcon nave;
	private JLabel encabezado;
	private JLabel muñecoNave;
	
	public NaveGUI() {
		prepareElementos();
		//prepareBotones();
		
	}
	
	
	private void prepareElementos() {
		background = new ImageIcon(getClass().getResource("/Resources/fondo.png")).getImage();
		setLayout(null);
		prepareBotones();
		
	}
	
	private void prepareBotones() {
		int ancho=100;
		int alto=100;
		ImageIcon naves= new ImageIcon(getClass().getResource("/Resources/nave3.png"));
		naves= new ImageIcon (naves.getImage().getScaledInstance(ancho,alto,java.awt.Image.SCALE_DEFAULT));
		muñecoNave=new JLabel(naves);
		muñecoNave.setBounds(900,940, ancho, alto);
		add(muñecoNave);
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(background,0,0,getWidth(),getHeight(),this);
	}
		
	
	

}
