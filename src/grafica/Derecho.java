package grafica;

import Objeto.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Derecho extends JPanel implements ActionListener {

	 /**
     * Constante para la serialización
     */
    private static final long serialVersionUID = 1L;
    public static final String BUSCARCC = "BUSCARCC";
    private Map<Integer, String> mapa2 = new TreeMap<Integer, String>();
    Ventana aux;
	 /**
     * Botón para agregar 
     */
    private JButton buscar;
    private JTextField busqueda;
    private int llave;
    private String datos;
    

   
    
	public Map<Integer, String> getMapa2() {
		return mapa2;
	}


	public void setMapa2(Map<Integer, String> mapa2) {
		this.mapa2 = mapa2;
	}


	public int getLlave() {
		return llave;
	}


	public void setLlave(int llave) {
		this.llave = llave;
	}


	public String getDatos() {
		return datos;
	}


	public void setDatos(String datos) {
		this.datos = datos;
	}


	public Derecho(Map<Integer, String> mapa) {
		super();
    	this.mapa2=mapa;
		this.inicio();
        
    }
	
	public void inicio() {

		
        setLayout( new GridBagLayout( ) );

        
        Border borde = BorderFactory.createTitledBorder( "Panel Izquierdo" );
        setBorder( borde );

        GridBagConstraints constraint = new GridBagConstraints( );

        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.BOTH;
      
        Insets insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
	
        buscar = new JButton( "Agregar" );
        buscar.addActionListener( this );
        buscar.setActionCommand( BUSCARCC );	       
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 12;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;	        
        add( buscar, constraint );
        
        
	JLabel bus = new JLabel("Cedula");
    constraint = new GridBagConstraints( );
    constraint.gridx = 0;
    constraint.gridy = 1;
    constraint.fill = GridBagConstraints.BOTH;
    insets = new Insets( 5, 10, 5, 10 );
    constraint.insets = insets;
    add(bus,constraint);
    
    
    busqueda = new JTextField(5);
    busqueda.addActionListener(this);
    constraint = new GridBagConstraints( );
    constraint.gridx = 0;
    constraint.gridy = 2;
    constraint.fill = GridBagConstraints.BOTH;
    insets = new Insets( 5, 10, 5, 10 );
    constraint.insets = insets;
    add(busqueda,constraint);
    
	}
    
 	
 	public void buscar() {
 		Iterator<Integer> it = mapa2.keySet().iterator();
		while(it.hasNext()){
		  Integer key = it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + mapa2.get(key));
		}
 	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String accion = e.getActionCommand( );
        if( accion.equals( BUSCARCC ) ) {
        	String bus = busqueda.getText();
        	int k = Integer.parseInt(bus);
            JOptionPane.showMessageDialog(this,mapa2.get(k));
            
        }
           	
	}
    

}

