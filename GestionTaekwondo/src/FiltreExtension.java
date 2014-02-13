import java.io.File;

public class FiltreExtension extends javax.swing.filechooser.FileFilter
{
	// 2 cha�nes qui contiendront respectivementl�entension du fichier (de la forme "jpg", "txt", etc�) et la descritpion
	// par exemple "Fichier JPEG" ou "Fichier Texte Brut".
	String extension;
	String description;

	// Notre constructeur qui admet donc comme arguments l�extension souhait�e ainsi que la description que l�on lui associe
	public FiltreExtension(String extension, String description)
	{
		// on n�a ainsi pas besoin (on ne doit pas) inclure le "." (point) dans le libell� de l�extension
		if (extension.indexOf("'") == -1)
			extension = "." + extension;
		// on assimile les Strings du d�part (variables de classe) aux Strings fournis comme argument au constructeur (variableslocales)
		this.extension = extension;
		this.description = description;
	}

	public boolean accept(File fichier)
	{
		// v�rifier si le le fichier finit avec l�extension que nous avons sp�cifi� dans le constructeur, et, dans ce cas "accepter" de l�afficher
		// dans la fen�tre du JFileChooser
		if (fichier.getName().endsWith(extension))
			return true;
		// les r�pertoires aussi doivent �treaffich�s dans la fen�tre du JFileChooser
		else if (fichier.isDirectory())
			return true;
		return false;
	}

	public String getDescription()
	{
		// la description du fichier, que l�on associe � son extension, on a un affichage du type: "Fichier JPEG (*.jpg)"
		return this.description + "(*" + extension + ")";
	}
}