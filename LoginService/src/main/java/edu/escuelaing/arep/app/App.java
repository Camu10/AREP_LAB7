package edu.escuelaing.arep.app;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import static spark.Spark.*;
import com.google.common.hash.Hashing;
import com.google.gson.Gson;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        port(getPort());
        URLReader.ssl();
        Gson gson=new Gson();
        Map<String,String> users=new HashMap<>();
        users.put("carlos@mail.com",Hashing.sha256().hashString("123", StandardCharsets.UTF_8).toString());
        staticFileLocation("/public");
        secure("keystores/ecikeystore.p12", "carlos", null, null);

        get("/hello", (req, res) -> "Hello World");
        get("/", (req, res) -> {
            res.redirect( "index.html");
            return "";
        });
        post("/login", (req, res) ->{
            req.session(true);
            User user = gson.fromJson(req.body(), User.class);
            if(Hashing.sha256().hashString(user.getPassword(), StandardCharsets.UTF_8).toString().equals(users.get(user.getEmail()))){
                req.session().attribute("User",user.getEmail());
                req.session().attribute("Loged",true);
            }
            else{
                return "Usuario o contraseña incorrecta, por favor ingresar de nuevo las credenciales";
            }
            return "";
        });

        get("/information", (req, res) -> {
            String resp = URLReader.readURL("https://ec2-54-221-90-156.compute-1.amazonaws.com:8000/information");
            System.out.println(resp);
            return resp;
        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}
