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
import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;

import Aplicacion.*;


public class Game extends Canvas implements Runnable,  Serializable{
	private Player nave;
	private ImageIcon naves;
	public int puntuacion;
	public String puntaje;
	private boolean is_moving = false;
	private int contmuertes;
	private String modo;
	private ResourceLoader loader;
	private Image background;
	
	/*int x;
	int y;
	
	public Game(int x, int y) {
		this.x=x;
		this.y=y;
		
	}*/
	
	
	
	public Game (String modo) {
		this.modo=modo;
		init();
		//start();
	}
	
	/*public GameCanvas(ControllerGame controller) {
		modo="user";
		this.controller=controller;
		start();
	}*/



	public void init() {
		requestFocus();
		//loader = new ResourceLoader();
		background= new ImageIcon(getClass().getResource("/Resources/background.png")).getImage();
		//setLayout(null);
		loadNave();
		//loadVidas();
		//loadScore();
		
		
	}
	
	

	private void loadNave() {
		Image naves=null;
		//Carga el juego para modo de un solo jugador
		if(modo=="user") {
			naves=new ImageIcon(getClass().getResource("/Resources/nave.png")).getImage();
		}
		/*Nave nave= new Nave(modo,naves,columna,fila);*/
		/*naves = nave.grabImage(160,0, 40, 40);*/
	}
	//private void loadVidas() {
		
	
		

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
