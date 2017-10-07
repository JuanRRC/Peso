package grafica;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Superior extends JPanel {

	public Superior() {
		  setLayout( new BorderLayout( ) );
	        JLabel imagen = new JLabel( );
	        JLabel imagen2 = new JLabel( );
	        ImageIcon icono = new ImageIcon( "img/imagen.jpg" );
	        ImageIcon icono2 = new ImageIcon( "img/imagen2.jpg" );
	        imagen.setIcon( icono );
	        imagen2.setIcon(icono2);
	        add( imagen, BorderLayout.CENTER );
	        add( imagen2, BorderLayout.EAST );
	               
	        setBackground( Color.WHITE );
	}
	
}

