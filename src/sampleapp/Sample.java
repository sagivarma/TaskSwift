/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapp;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author ssvarma
 */
public class Sample {

    public static void main(String[] args) {
        String entDisplayName = "EMERGENCY_ACCESS_SUPPORT_ORADOC";

        List<String> l = new ArrayList<String>();
        l.add("EMERGENCY_ACCESS");
        l.add("EMERGENCY_ACCESS_SUPPORT");
        
        
        for (String search : l) {
            if (entDisplayName.matches("[EMERGENCY_ACCESS_SUPPORT]{23}")) {
                System.err.printf("Yes '%s' contains word 'EMERGENCY_ACCESS' %n", search);
            } else {
                System.err.printf("Sorry %s does not contains word 'EMERGENCY_ACCESS' %n ", search);
            }

        }

    }
}
