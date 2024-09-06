package fr.maxime.entity;

import fr.maxime.exception.NotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class RechercheVilleTest {
    private RechercheVille rechercheVille;


    @BeforeEach
    public void setUp() {

        List<String> villeList = Arrays.asList("Lille","Roubaix","Tourcoing");
        rechercheVille = new RechercheVille(villeList);

    }
//        Assertions.assertThrows(
//        DividedByZeroException.class,
//                () -> {
//        calcul.division(x, y);
//                }
//                        );

    @Test
    public void testRechercheVille_if_search_length_lower_at_2_assertTrhows_NotFoundException() {
        Assertions.assertThrows(NotFoundException.class, () -> {rechercheVille.Rechercher("m");});
    }
    @Test
    public void testRechercheVille_return_all_city_start_by_lil() {
        List<String> awaitListe = Arrays.asList("Lille");
        Assertions.assertTrue(awaitListe.containsAll(rechercheVille.Rechercher("Lil")));
    }
    @Test
    public void testRechercheVille_not_casse_sansitive() {
        List<String> awaitListe = Arrays.asList("Lille");
        Assertions.assertTrue(awaitListe.containsAll(rechercheVille.Rechercher("lil")));
    }
    @Test
    public void testRechercheVille_any_same_word() {
        List<String> awaitListe = Arrays.asList("Lille");
        Assertions.assertTrue(awaitListe.containsAll(rechercheVille.Rechercher("ll")));
    }

    @Test
    public void testRechercheVille_return_all_city_if_stars() {
        List<String> awaitListe = Arrays.asList("Lille","Roubaix","Tourcoing");
        Assertions.assertTrue(awaitListe.containsAll(rechercheVille.Rechercher("*")));
    }

}