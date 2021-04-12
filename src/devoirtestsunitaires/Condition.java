/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoirtestsunitaires;

/**
 *
 * @author jbuffeteau
 */
public class Condition
{
    static final int nbJours = 30;
     // Permet de savoir si on a le droit d'être remboursé
    // On l'est à condition que le nombre de jours ne dépasse pas 30 !
    // Voir la constante déclarée ci-dessus
    public static boolean Valider(int unNbDeJours)
    {
        boolean rembourse=true;
        int nbJoursClient = 0;
        if(nbJoursClient>=nbJours)
        {
            rembourse=false;
        }
        
        return rembourse;
    }
    // Permet de renvoyer le montant MAX remboursé en fonction de la catégorie
    // 30 pour Livre : si j'achète un livre à 14 euros ==> prix est de 14 ; si j'achète un livre à 54 euros ==> le prix est de 30
    // 50 pour Jouet
    // 1000 pour Informatique
    public static int CalculerMontantMaxCategorie(String uneCategorie)
    {
        int prixAchat;
        int montantMax;
        boolean livre=true;
        boolean jouet=true;
        boolean info=true;
        if(livre)
        {
            if(prixAchat<=30)
            {
                montantMax=prixAchat;
            }
            else
            {
                montantMax=prixAchat-30;
            }
        }
        
        if(jouet)
        {
            if(prixAchat<=50)
            {
                montantMax=prixAchat;
            }
            else
            {
                montantMax=prixAchat-50;
            }
        }
        
        if(info)
        {
            if(prixAchat<=1000)
            {
                montantMax=prixAchat;
            }
            else
            {
                montantMax=prixAchat-1000;
            }
        }
            
        return montantMax;
    }
    // Permet de retourner le total remboursé en fonction de tous les critères
    public static double CalculerMontantRembourse(int unNbDeJours, String uneCategorie,
            boolean estMembre, String unEtat,
            int unPrix)
    {
        
        return 0;

    }
    // Permet de renvoyer la réduction si on est membre ou pas
    // Membre  = 0.0
    // Pas membre = 0.2
    public static double CalculerReductionMembre(boolean estMembre)
    {
        int calculMembre;
        if(!estMembre)
        {
            calculMembre=montantMax*0.8;
        }
        return calculMembre;
    }
    // Permet de renvoyer la réduction en fonction de l'état de l'achat
    // Abimé ou Très abimé = 0.3
    // Pour tous les autres états = 0.1
    public static double CalculerReductionEtat(String unEtat)
    {
        int prixReductionEtat;
        if(unEtat.equals("Abimé") || unEtat.equals("Très abimé"))
        {
            prixReductionEtat=montantMax*0.7;
        }
        else
        {
            prixReductionEtat=montantMax*0.9;
        }
        
        return prixReductionEtat;
    }
}
