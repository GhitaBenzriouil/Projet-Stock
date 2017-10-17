/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Etudiant;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author ghita.benzriouil
 */
public class EtudiantHelper extends AbstractHelper<Etudiant>{
     private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{new AbstractHelperItem("id", "id"),
            new AbstractHelperItem("Nom", "nom"),
            new AbstractHelperItem("prenom", "prenom"),
            new AbstractHelperItem("Date de Naissance", "dateNaissance"),
            new AbstractHelperItem("Moyenne", "moyenne"),
        
            
        };
    }

    public EtudiantHelper(JTable jTable, List<Etudiant> list) {
        super(titres, jTable, list);
    }

    public EtudiantHelper(JTable jTable) {
        super(titres, jTable);

    }
    
}


