package ch.heg.ig.sda.datastructure;

/**
 *
 * @author maximili.jeannere
 */
public interface List<E> {

    /** Retourne le nombre d'éléments stockés dans la liste.
     * @return Nombre d'éléments dans la liste. */
    int size( ); // (public abstract facultatifs)

    /** Retourne un booléen qui indique si la liste est vide.
     * @return True si la liste est vide. */
    boolean isEmpty( );

    /** Retourne l'élément à l'indice i.
     * @param i Indice
     * @return Instance de Person à l'indice i */
    E get(int i) throws IndexOutOfBoundsException;

    /** Remplace l'élément à l'indice i par une instance de Person et renvoie l'élément remplacé.
     * @param i Indice
     * @param elem Instance de Person.
     * @return  */
    E set(int i, E elem);

    /** Insère un élément de type Person à l'indice i, en décalant les éléments suivants d'un indice.
     * @param i Indice ou la personne est ajoutée.
     * @param elem Instance de Person. */
    void add(int i, E elem);

    void add(E elem);

    /** Supprime et renvoie l'élément à l'indice i, en décalant les éléments suivants.
     * @param i indice
     * @return Instance de personne supprimée*/
    E remove(int i);

}
