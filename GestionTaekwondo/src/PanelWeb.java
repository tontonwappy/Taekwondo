import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.util.List;

import com.taekwondo.exporttomcat.HelloWorld;
import com.taekwondo.exporttomcat.HelloWorldImplService;


public class PanelWeb extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton boutonEnvoie= new JButton("OK");
	JButton boutonSupprimer= new JButton("Supprimer");
	JLabel titre = new JLabel("YATA");
	JLabel labelAjoutClub = new JLabel("Entrez le nom d'un club à ajouter");
	final JTextField nomClub = new JTextField();

	PanelWeb(){

		/** Initialisation des panels **/   
		this.setLayout(new BorderLayout());
		JPanel contenuHaut = new JPanel();
		JPanel contenuCenter = new JPanel();
		//JPanel panelinDroite = new JPanel();
		this.add(contenuHaut,BorderLayout.NORTH);	
		this.add(contenuCenter,BorderLayout.CENTER);	

		

		
		
		/** Placement des composants : titre et bouton **/
		contenuHaut.add(titre);		
		nomClub.setColumns(20);
		contenuCenter.add(labelAjoutClub);
		contenuCenter.add(nomClub);
		contenuCenter.add(boutonEnvoie);
		contenuCenter.add(boutonSupprimer);
		
		
		HelloWorldImplService helloWorldService = new HelloWorldImplService();  
        final HelloWorld helloWorld = helloWorldService.getHelloWorldImplPort();  

	
		
		boutonEnvoie.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				Club nouveauClub=new Club(1,nomClub.getText());
				Controleur.listClub.add(nouveauClub);
				nomClub.setText("");
				List<String> list=helloWorld.retrounePersonnes();
		        for(String l:list){
		        	System.out.println(l);
		        }

			}
		});

		boutonSupprimer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)

			{}
			
		});
		


	}

	

}	