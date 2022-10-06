package ch.heg.ig.sda.service;

import ch.heg.ig.sda.business.Competition;
import ch.heg.ig.sda.exceptions.EmptyListException;
import ch.heg.ig.sda.business.Participant;
import ch.heg.ig.sda.datastructure.ArrayList;

/**
 * @author isabelle.stransky
 */
public interface IMgmtCompetition {



    /**
     * Retourne le nombre de competition auxquelles un
     * participant est inscrit
     * @param competitionArrayList liste des compétitions
     * @param participant participant dont on veut avoir le nombre de course
     * @return nombre de compétitions auxquelles le participant est inscrit
     */
    public int nbCompetitionPartipipantIn(ArrayList<Competition> competitionArrayList, Participant participant);

    /**
     * Donne une liste de compétitons auquelles le participant est inscrit
     * @param competitionArrayList liste des compétitions
     * @param participant participant dont on veut savoir à quelles compétition il prend
     *                    part
     * @return retourne une liste des compétitions auxquelles le participant est inscrit
     */
    public ArrayList<Competition> listCompetitionParticipantIn(ArrayList<Competition> competitionArrayList, Participant participant);

    /**
     * Affiche seulement les participants d'une compétition qui sont dans une certaine catégorie
     * @param competition compétition dont on veut voir les participants
     * @param category la catégorie dont on veut voir les participants
     */
    public void showListParticipantsByCat(Competition competition, String category);

    /**
     * Permet d'ajouter un participant à toutes les ocmpétitions d'une liste
     * @param competitionArrayList la liste de compétitions
     * @param participant le participant à ajouter aux compétitions
     * @throws EmptyListException retourne une excpeption si la liste de compétitions
     * est vide
     */
    public void addParticipantMultipleCompetition(ArrayList<Competition> competitionArrayList, Participant participant) throws EmptyListException;
}
