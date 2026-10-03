/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medical.stats.service;

/**
 *
 * @author rabarijohnsandroandrianina
 */
import jakarta.ejb.Stateless;
import jakarta.ejb.EJB;
import java.util.List;
import com.medical.shared.RecordsRemote;

@Stateless
public class EpidemiologyService {

    @EJB(lookup = "corbaname:iiop:1.2@localhost:3700#java:global/MediCore-records-1.0-SNAPSHOT/RecordsService!com.medical.shared.RecordsRemote")
    private RecordsRemote records;

    public int totalCases() {
        List<String> cases = records.allCases();
        return cases.size();
    }
}
