package ch.heg.ig.sda.business;

import java.time.LocalDate;

/**
 * @author isabelle.stransky
 *
 * Un participant est une personne, qui peut s'inscrire à une competition,
 * il a un numéro qui lui est spécifique
 */
public class Participant extends Person{
    private int number;

    private String category;

    /**
     * Constructeur de participant
     * @param firstName
     * @param lastName
     * @param gender
     * @param dateOfBirth
     * @param number
     */
    public Participant(String firstName, String lastName, char gender, LocalDate dateOfBirth, int number) {
        super(firstName, lastName, gender, dateOfBirth);
        this.category = generateCategory();
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCategory(){
        return category;
    }

    /**
     * Génère automatiquement la catégorie d'un participant et regardant
     * son sexe et son âge (vétéran >45 ans, senior <= 45ans)
     * @return la catégorie du participant
     */
    private String generateCategory() {
        int age = LocalDate.now().getYear() - this.getDateOfBirth().getYear();
        if (this.getGender() == 'M') {
            if (age > 45 ) {
                return "Veteran Homme";
            } else {
                return "Senior Homme";
            }
        } else {
            if (age > 45 ) {
                return "Veteran Femme";
            } else {
                return "Senior Femme";
            }
        }
    }

    //Redéfinition de la méthode toString
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getLastName()).append(" ");
        sb.append(this.getFirstName()).append(" : ");
        sb.append(this.category);
        return sb.toString();
    }


}
