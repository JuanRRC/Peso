package grafica;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Inferior extends JPanel{

	public Inferior() {
		
		setLayout( new BorderLayout( ) );
        JLabel imagen = new JLabel( );

        ImageIcon icono = new ImageIcon( "img/imagen.jpg" );
       
        
        imagen.setIcon( icono );

        imagen.setHorizontalAlignment( JLabel.CENTER );
    
        add( imagen, BorderLayout.CENTER );

        setBackground( Color.WHITE );
	}
}
