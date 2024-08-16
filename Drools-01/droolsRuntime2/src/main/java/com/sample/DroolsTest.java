package com.sample;

import com.sample.State;
import org.kie.api.KieServices;
import org.kie.api.builder.Results;
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
    	    
    	    // session 1
        	KieSession kSession = kContainer.newKieSession("ksession-1");
            Message message = new Message();
            message.setMessage("Hello from ksession-1");
            message.setStatus(Message.HELLO);
            kSession.insert(message);
            kSession.fireAllRules();
            kSession.dispose();
            
            // session 2
            kSession = kContainer.newKieSession("ksession-2");
            message.setMessage("Hello from ksession-2");
            message.setStatus(Message.HELLO);
            kSession.insert(message);
            kSession.fireAllRules();
            kSession.dispose();
            
            //session 3
            kSession = kContainer.newKieSession("ksession-3");

            final State a = new State( "A" );
            final State b = new State( "B" );
            final State c = new State( "C" );
            final State d = new State( "D" );

            kSession.insert( a );
            kSession.insert( b );
            kSession.insert( c );
            kSession.insert( d );

            kSession.fireAllRules();
            kSession.dispose();

            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}

