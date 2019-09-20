//on importe Scanner
import java.util.Scanner;

//La classe Main
public class Main {
	//La fonction main
	public static void main(String[] args) throws Exception {
		//cr�er un objet qui appelle la classe SQL on la nommera base
		SQL base = new SQL();
		//ajouter l'entr�e clavier pour dire qu'on va lire l'entr�e clavier
		Scanner sc = new Scanner(System.in);
		//new variable entier
		int choix = sc.nextInt();
		//on lui demande d'imprimer choix concaten� au caract�re tap�
		System.out.println("Choix: " + choix);
		switch(choix){
		//en rouge les fonctions systeme en vert les fonctions que je viens de cr�er
		//les fonctions de base comme case sont tout de suite reconnues
		//les fonctions que je cr�e comme sejours ou nbActes ne sont pas tout se suite reconnues
		//tant qu'elles n'existent pas dans la classe SQL
		//on va utiliser case pour tester 2 cas avec une sortie break � chaque fois 
		//pour ne pas saisir le code SQL dans main on appelle depuis main uniquement la fonction sejour de la classe SQL qui contient le code
		case 1: base.sejours();
		break;
		//pour le nom toujours 1er mot min au d�but et 2 eme MAJ au debut
		case 2: base.nbActes();
		break;
		//le default est �quivalent au else ici si aucun choix connu
		default: System.out.println("Erreur de saisie");
		}
	}

}
