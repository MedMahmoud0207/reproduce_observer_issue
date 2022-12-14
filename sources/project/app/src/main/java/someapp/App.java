/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package someapp;
import mylib.Library;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;

@Stateless
public class App {

    public String getGreeting() {
        return " #### log-3 Hello World!";
    }

    public static void init(@Observes @Initialized(ApplicationScoped.class) Object init) {
        System.out.println(new App().getGreeting());
    }

}
