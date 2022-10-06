package ch.heg.ig.sda.business;

import ch.heg.ig.sda.datastructure.ArrayList;

/**
 * @author isabelle.stransky
 * Une compétition est définie par sa liste de participants, son nom
 * et id
 */
public class Competition {

    private ArrayList<Participant> listeDepart;
    private String nom;
    private int id;

    /**
     * nombre de participants max que la compétition peut accueillir
     * (Taille de la ArrayListe de participants) ne peut pas être modifié
     * une fois qu'il a été défini
     */
    private final int capacity;

    public Competition(String nom, int id, int capacity) {
        listeDepart = new ArrayList<Participant>(capacity);
        this.capacity = capacity;
        this.nom = nom;
        this.id = id;
    }

    public ArrayList<Participant> getListeDepart() {
        return listeDepart;
    }

    public void setListeDepart(ArrayList<Participant> listeDepart) {
        this.listeDepart = listeDepart;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    /**
     * Ajoute un participant à la liste des participants de la compétition
     * après avoir contrôlé si la course est complète ou non
     * @param participant oarticipant à ajouter à la liste
     */
    public void addParticipant(Participant participant){
        if (!this.isComplete()) {
            if (!inCompetition(participant)) {
                this.listeDepart.add(participant);
            }
        }
    }

    /**
     * Contrôle si un participant fait déjà partie d'une compétition
     * @param participant
     * @return boolean
     */
    public boolean inCompetition(Participant participant){
        boolean isInCompetition = false;
        for (int i = 0; i<this.listeDepart.size(); i++){
            if (this.listeDepart.get(i).equals(participant)){
                isInCompetition = true;
            }
        }
        return isInCompetition;
    }

    /**
     * Retire le participant de la liste de départ d'une compétition
     * @param participant participant à retirer de la compétition
     */
    public void removeParticipant(Participant participant){

        for (int i = 0; i < this.listeDepart.size(); i++) {
            if (this.listeDepart.get(i).equals(participant)) {
                this.listeDepart.remove(i);
                break;
            }
        }

    }

    /**
     * Contrôle si une compétition est complète (si la capacité max de la liste a été
     * atteinte
     * @return boolean
     */
    private boolean isComplete(){
        return this.listeDepart.size()==capacity;
    }

    //Redéfinition de la méthode toString
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.nom).append("\n");
        for (int i = 0; i<this.listeDepart.size(); i++){
            sb.append(this.listeDepart.get(i).toString()).append("\n");
        }
        return sb.toString();
    }

}
