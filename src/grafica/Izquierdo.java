package grafica;

import Objeto.*;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
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
import javax.swing.table.DefaultTableModel;

public class Izquierdo extends JPanel implements ActionListener {


    public static final String AGREGAR = "AGREGAR";
    public static final String LISTAR = "LISTAR";
     
	 /**
     * Botón para agregar 
     */
    private Derecho mapa3;
    private JButton btnAgregar;
    private JButton btnListar;
    private String[] columnas = {" CC ", " Nombre", " Apellido ", " Edad ", " Peso "};
    private JTextField nombre,apellido,cedula,edad,peso;
    private ArrayList<Persona> lista2 = new ArrayList<Persona>();
    private Map<Integer, String> mapa = new TreeMap<Integer, String>();
    private ArrayList<Object[]> lista1 = new ArrayList<Object[]>();
    private DefaultTableModel referencia_tabla_model;
	private ArrayList<Object[]> referencia_almacen;
    
	
	
	
    
	public Map<Integer, String> getMapa() {
		return mapa;
	}

	public void setMapa(Map<Integer, String> mapa) {
		this.mapa = mapa;
	}

	
	public Izquierdo(DefaultTableModel referencia_tabla_model, ArrayList<Object[]> referencia_almacen) {
		super();
		this.referencia_tabla_model = referencia_tabla_model;
		this.referencia_almacen = referencia_almacen;
		
	    this.iniciar();  
	}

	public void iniciar() {

		 		
        setLayout( new GridBagLayout( ) );

        Border borde = BorderFactory.createTitledBorder( "Datos" );
        setBorder( borde );
        
       
        GridBagConstraints constraint = new GridBagConstraints( );

        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.BOTH;

        Insets insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        
        
        btnAgregar = new JButton( "Agregar" );
        btnAgregar.addActionListener( this );
        btnAgregar.setActionCommand( AGREGAR );	       
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 12;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;	        
        add( btnAgregar, constraint );
        
        
        JLabel nom = new JLabel("Nombre :");
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 1;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(nom,constraint);
        
        nombre = new JTextField(5);
        nombre.addActionListener(this);
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 2;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(nombre,constraint);
       
        
        JLabel ape = new JLabel("Apellido :");
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 3;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(ape,constraint);
        
        apellido = new JTextField(5);
        apellido.addActionListener(this);
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 4;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(apellido,constraint);
        
        
        JLabel cc = new JLabel("Cedula :");			
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 5;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(cc,constraint);
        
        
        cedula = new JTextField(5);
        cedula.addActionListener(this);
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 6;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(cedula,constraint);
       
        
        JLabel ed = new JLabel("Edad :");
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 7;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(ed,constraint);
        
        edad = new JTextField(5);
        edad.addActionListener(this);
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 8;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(edad,constraint);
        
        
        JLabel pes = new JLabel("Peso :");
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 9;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(pes,constraint);
        
        
        peso = new JTextField(5);
        peso.addActionListener(this);
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 10;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(peso,constraint);
        
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String accion = e.getActionCommand( );
        if( accion.equals( AGREGAR ) ) {
        	
        	
        	String n = nombre.getText();
        	if(n.length()==0){
        		JOptionPane.showMessageDialog(this, "Campo nombre vacio", "Error!", JOptionPane.ERROR_MESSAGE);
                
            }
                 	
        	String a = apellido.getText();
        	if(a.length()==0){
        		JOptionPane.showMessageDialog(this, "Campo apellido vacio", "Error!", JOptionPane.ERROR_MESSAGE);
                
            }
            
        	String c = cedula.getText();
        	if(c.length()==0){
        		JOptionPane.showMessageDialog(this, "Campo cedula vacio", "Error!", JOptionPane.ERROR_MESSAGE);
                
            }
  
        	int ce = Integer.parseInt(c);
            String ed = edad.getText();
            if(ed.length()==0){
            	JOptionPane.showMessageDialog(this, "Campo edad vacio", "Error!", JOptionPane.ERROR_MESSAGE);
                
            }
            
            int eda = Integer.parseInt(ed);
            String p = peso.getText();
            if(p.length()==0){
            	JOptionPane.showMessageDialog(this, "Campo Peso vacio", "Error!", JOptionPane.ERROR_MESSAGE);
                
            }
            
            int pe = Integer.parseInt(p);
            
            String datos2 ="Nombre :  "+n+"  "+a+"   Edad :  "+ed+"   Peso : "+p+" ";
            
            mapa.put(ce,datos2);
            Persona perso = new Persona(n,a,ce,pe,eda);
            lista1.add(perso.getDetalles());
            //int cedula, String nombre, String apellido,int edad,int peso
            referencia_almacen.add(Persona.build(ce,n,a,eda,pe).getDetalles());
    		Object[][] datos = referencia_almacen.toArray(new Object[referencia_almacen.size()][]);
    		referencia_tabla_model.setDataVector(datos, columnas);
    		mapa3 = new Derecho(mapa);
            this.nombre.setText("");
            this.apellido.setText("");
            this.cedula.setText("");
            this.edad.setText("");
            this.peso.setText("");
            
            
        }
        else {
        	
        }
        if( accion.equals( LISTAR ) ) {
           	Centro c = new Centro(lista1);
           	Iterator<Integer> it = mapa.keySet().iterator();
    		while(it.hasNext()){
    		  Integer key = it.next();
    		  System.out.println("Clave: " + key + " -> Valor: " + mapa.get(key));
    		}
           	
	}
	
	
}
	

}
