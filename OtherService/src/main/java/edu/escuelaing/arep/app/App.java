package edu.escuelaing.arep.app;

import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        port(getPort());
        secure("keystores/ecikeystore.p12","carlos1","keystores/myTrustStore","567890");
        get("/information", (req, res) -> "Informacion de ejemplo");
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5001; //returns default port if heroku-port isn't set (i.e. on localhost)
    }}
