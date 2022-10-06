package ch.heg.ig.sda.service;
import ch.heg.ig.sda.business.*;
import ch.heg.ig.sda.datastructure.ArrayList;
import ch.heg.ig.sda.exceptions.EmptyListException;

/**
 * @author isabelle.stransky
 */
public class MgmtCompetition implements IMgmtCompetition {

    @Override
    public int nbCompetitionPartipipantIn(ArrayList<Competition> competitionArrayList, Participant participant){
        return listCompetitionParticipantIn(competitionArrayList,participant).size();
    }


    @Override
    public ArrayList<Competition> listCompetitionParticipantIn(ArrayList<Competition> competitionArrayList, Participant participant){
        ArrayList<Competition> listCompetition = new ArrayList<Competition>(competitionArrayList.size());
        for (int i = 0; i < competitionArrayList.size(); i++){
            if (competitionArrayList.get(i).inCompetition(participant)){ //test si un participant fait partie d'une competition
                listCompetition.add(competitionArrayList.get(i));
            }
        }
        return listCompetition;
    }


    @Override
    public void showListParticipantsByCat(Competition competition, String category) {
        for (int i = 0; i < competition.getListeDepart().size(); i++){
            Participant part = competition.getListeDepart().get(i);
            if (part.getCategory() == category){
                System.out.println(part.toString());
            }
        }
    }

    @Override
    public void addParticipantMultipleCompetition(ArrayList<Competition> competitionArrayList, Participant participant) throws EmptyListException {
        if (competitionArrayList.isEmpty()){
            throw new EmptyListException("La liste de compétition est vide");
        } else {
            for (int i = 0; i < competitionArrayList.size(); i++) {
                competitionArrayList.get(i).addParticipant(participant);
            }
        }
    }




}
