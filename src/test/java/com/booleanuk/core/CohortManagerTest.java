package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CohortManagerTest {

    @Test
    public void searchForCohortsThatExists(){
        // Setup
        CohortManager cohortManager = new CohortManager();
        ArrayList<String> cohorts = new ArrayList<>(){{
            add("Liverpool");
            add("Tottenham");
            add("Arsenal");
            add("Newcastle");
        }};
        String name = "Liverpool";

        // Execute and verify
        Assertions.assertTrue(cohortManager.search(cohorts, name));
    }

    @Test
    public void searchForCohortsThatDoesNotExists(){
        // Setup
        CohortManager cohortManager = new CohortManager();
        ArrayList<String> cohorts = new ArrayList<>(){{
            add("Liverpool");
            add("Tottenham");
            add("Arsenal");
            add("Newcastle");
        }};
        String name = "Burnley";

        // Execute and verify
        Assertions.assertFalse(cohortManager.search(cohorts, name));
    }

}
