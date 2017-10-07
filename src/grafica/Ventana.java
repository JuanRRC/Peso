package grafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Ventana extends JFrame {

	Superior Arriba;
	Inferior Abajo;
	Centro PCentro;
	Izquierdo datos;
	Derecho busqueda;
	private Izquierdo formulario;
	private Derecho mapa;
	private JTable tablaP;
	private String[] columnas = {" CC ", " Nombre", " Apellido ", " Edad ", " Peso "};
	private ArrayList<Object[]> personas = new ArrayList<Object[]>();
	private DefaultTableModel table_model;
	private Object[][] datos2; 
	 private Map<Integer, String> mapa3 = new TreeMap<Integer, String>();
	
	
	
	
	public Ventana(){
		 super("Programa");
		 iniciar();
		 componente();
		 setVisible(true);
		 pack();
		
         setLocationRelativeTo( null );
	}
	
	public Ventana iniciar(){
				
				Dimension dims = new Dimension(800, 550);
				this.setSize(dims);
				this.setPreferredSize(dims);
				this.getContentPane( ).setLayout( new BorderLayout( ) );
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				return this;
	}
	
	
	public void componente() {
		
		
		
		Arriba = new Superior( );
        add( Arriba, BorderLayout.NORTH );

        Abajo = new Inferior();
        add( Abajo, BorderLayout.SOUTH );

        //PCentro = new Centro();
        //add( PCentro, BorderLayout.CENTER );

        //datos = new Izquierdo();
        //add( datos, BorderLayout.WEST );
        
        
        
        
		//busqueda = new Derecho();
		//add(busqueda ,BorderLayout.EAST);
		
		
		datos2 = personas.toArray(new Object[personas.size()][]);
		table_model = new DefaultTableModel(datos2, columnas);
		tablaP = new JTable(table_model);
		
		
		formulario = new Izquierdo(table_model, personas);
		mapa=new Derecho(formulario.getMapa());
		this.add(mapa, BorderLayout.EAST);
		this.add(formulario, BorderLayout.WEST);
		this.add(new JScrollPane(tablaP), BorderLayout.CENTER);
	}
	
}
