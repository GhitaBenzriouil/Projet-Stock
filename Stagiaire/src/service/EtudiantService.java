/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Etudiant;
import dao.EtudiantDao;
import java.util.List;

/**
 *
 * @author benzriouilghita
 */
public class EtudiantService {

    Etudiant etudiant = new Etudiant();
    EtudiantDao etudiantDao = new EtudiantDao();

    public int save(Etudiant etudiant) throws Exception {
        Etudiant loadedEtudiant = etudiantDao.findById(etudiant.getId());
        if (loadedEtudiant == null) {
            etudiantDao.save(etudiant);
            return 1;
        }

        return -1;

    }

    public int delete(Etudiant etudiant) throws Exception {
        return etudiantDao.delete(etudiant);

    }

    public int modifier(Etudiant etudiant) throws Exception {
        Etudiant loadedEtudiant = etudiantDao.findById(etudiant.getId());
        if (loadedEtudiant != null) {
            return etudiantDao.update(etudiant);
        }
        return -1;
    }

    public List<Etudiant> find() throws Exception {
        String requette = "Select * from Etudiant";
        return etudiantDao.load(requette);
    }
}
