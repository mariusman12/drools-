package com.sample;

import java.util.ArrayList;
import java.util.Scanner;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
        	Flag flag = new Flag();

        	
        	Scanner scanner = new Scanner(System.in);
        	System.out.println("Dati o culoare");
        	String colorName = scanner.nextLine();  
        	flag.setColorSearch(colorName);
            kSession.insert(flag);
            kSession.fireAllRules();
            System.out.print("Tarile care continc culoarea  {"+flag.getColorSearch() +"} sunt {" + flag.getCountry() + "}");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

   

}
