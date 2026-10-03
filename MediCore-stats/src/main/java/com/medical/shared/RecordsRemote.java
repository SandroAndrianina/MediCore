package com.medical.shared;

import jakarta.ejb.Remote;
import java.util.List;

@Remote
public interface RecordsRemote {
    List<String> allCases();
}