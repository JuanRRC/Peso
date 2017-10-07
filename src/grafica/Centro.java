package grafica;
import Objeto.*;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class Centro extends JPanel{

	private JTable tabla_vehiculos;
	
	Izquierdo i;
	private String[] columnas = {" CC ", " Nombre", " Apellido ", " Edad ", " Peso "};
	private ArrayList<Object[]> personas = new ArrayList<Object[]>();
	private DefaultTableModel table_model;
	private Object[][] datos;
	Persona persona;
	private int j=0;
	
		
	public Centro(ArrayList<Object[]> a) {
		this.personas=a;
		
	}
	
	


	public ArrayList<Object[]> getPersonas() {
		return personas;
	}




	public void setPersonas(ArrayList<Object[]> personas) {
		this.personas = personas;
	}




	public Centro() {
			
			
			this.configurarComponentes();
			
			
			this.setVisible(true);
		}


		private void configurarComponentes() {
			
			datos = personas.toArray(new Object[personas.size()][]);
			table_model = new DefaultTableModel(datos, columnas);
			tabla_vehiculos = new JTable(table_model);
			
			
			i = new Izquierdo(table_model, personas);
		
			
			this.add(new JScrollPane(tabla_vehiculos), BorderLayout.CENTER);
		}
		
		
		/*
		public void mostrar() {
			Iterator<Object[]> it = personas.iterator();
			while(it.hasNext()){
				
			  Object key = it.next();
			  System.out.println("Datos :"+persona.getCedula());
			  j++;
			}
		}
		*/
	
}
