package ch.heg.ig.sda.app;

import ch.heg.ig.sda.business.Competition;
import ch.heg.ig.sda.business.Participant;
import ch.heg.ig.sda.datastructure.ArrayList;
import ch.heg.ig.sda.exceptions.EmptyListException;
import ch.heg.ig.sda.service.MgmtCompetition;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws EmptyListException {
        Participant part1 = new Participant("Albert", "LeVert", 'M', LocalDate.parse( "1990-09-09"), 23432);
        Participant part2 = new Participant("Claudette", "LeVert", 'F', LocalDate.parse( "1965-09-09"), 23654);
        Competition comp = new Competition("Trophée de Marchissy", 542543, 120);
        Competition comp2 = new Competition("Trophée de l'escalade", 54435, 400);
        ArrayList<Competition> compTrophy = new ArrayList<Competition>(10);
        compTrophy.add(comp);
        compTrophy.add(comp2);

        MgmtCompetition mgmt = new MgmtCompetition();

        comp.addParticipant(part1);
        mgmt.showListParticipantsByCat(comp, "Senior Homme");
        mgmt.addParticipantMultipleCompetition(compTrophy, part2);
        int nbCoursePart1 = mgmt.nbCompetitionPartipipantIn(compTrophy, part1);
        System.out.println(comp.toString()+comp2.toString());
        System.out.println(part1.toString()+" participe à "+nbCoursePart1+" compétition du tournoi des Trophées.");
        ArrayList<Competition> compPart1 = mgmt.listCompetitionParticipantIn(compTrophy, part1);



    }
}
