package vue.navigation;

import javax.swing.JPanel;

/** 
 * <b> Cette classe permet à l'élève de choisir l'exercice qu'il souhaite effectué.</b> 
 * 
 * <p> Il sera représenté sous forme d'un table qui utilise la classe asbtraite ModelTableauExercice.</p> 
 * <p> Il doit donc prendre en paramètre une liste d'exercice.</p> 
 * <p> Pour lancer un exercice, l'élève doit appuyer sur le bouton contenu dans la ligne de l'exercice </p>
 * <p> Lorsque l'élève n'a jamais réalisé d'exercice, le résultat est automatiquement "???".</p> 
 * <p> Lorsque l'élève a réalisé un exercice, le résultat est modifier en fonction du résultat obtenu lors de 
 * sa tentative. Lorsque la tentative n'est pas encore corrigée par le professeur, le statut est "en cours de correction"</p> 
 * <p> Si le résultat est "acquis", l'exercice n'est plus disponible par l'élève, le bouton est grisée. </p>
 * <p> Un élève ne peut pas lancer deux exercices en même temps. </p>
 * 
 * @author groupe 4
 *
 */
public class ChoixExercice extends JPanel {

}
