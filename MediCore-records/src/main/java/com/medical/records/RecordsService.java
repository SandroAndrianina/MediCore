package com.medical.records;

import com.medical.shared.RecordsRemote;
import com.medical.records.entity.Case;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class RecordsService implements RecordsRemote {

    @PersistenceContext(unitName = "recordsPU")
    private EntityManager em;

    @Override
    public List<String> allCases() {
        return em.createQuery("SELECT c.disease FROM Case c", String.class)
                 .getResultList();
    }
}