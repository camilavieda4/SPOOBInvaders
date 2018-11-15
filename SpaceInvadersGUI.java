package Presentacion;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.awt.GridLayout.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
  }
