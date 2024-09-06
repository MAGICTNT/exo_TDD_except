package fr.maxime.entity;

import fr.maxime.exception.NotFoundException;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class RechercheVille {
    private List<String> villes;

    public RechercheVille(List<String> villes) {
        this.villes = villes;
    }

    public List<String> Rechercher(String mot) {
        if (mot.equals("*")) {
            return villes;
        } else if (mot.length() < 2) {
            throw new NotFoundException("mot pas bon");
        } else{
            List<String> villesReturn = new ArrayList<String>();
            for (String ville : villes) {
                if(mot.toLowerCase().contains(ville.toLowerCase().substring(0,mot.length()))) {
                    villesReturn.add(ville);
                }
            }
            return villesReturn;
        }
    }

}