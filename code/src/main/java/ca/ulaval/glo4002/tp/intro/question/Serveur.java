package ca.ulaval.glo4002.tp.intro.question;

import ca.ulaval.glo4002.tp.intro.question.domaine.Health;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

public class Serveur implements Runnable {
    private static final int PORT = 8181;

    public static void main(String[] args) {
        new Serveur().run();
    }

    public void run() {
        Server serveur = new Server(PORT);
        ServletContextHandler contexte = new ServletContextHandler(serveur, "/");
        ResourceConfig configurationPackage = new ResourceConfig()
            .packages("ca.ulaval.glo4002.tp.intro.question")
            .register(Health.class);
        ServletContainer conteneur = new ServletContainer(configurationPackage);
        ServletHolder conteneurServlet = new ServletHolder(conteneur);

        contexte.addServlet(conteneurServlet, "/*");

        try {
            serveur.start();
            System.out.println("Le serveur a démarré sur le port " + PORT);
            serveur.join();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (serveur.isRunning()) {
                serveur.destroy();
            }
        }
    }
}
