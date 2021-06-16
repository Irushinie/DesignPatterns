import java.lang.System.Logger;
import java.lang.System.Logger.Level;


public class Example {

    public static void main(String[] args) {
        
        

        Logger logger = Logger.getLogger(Example.class.getName());
        logger.setLevel(Level.WARNING);

        logger.log(Level.INFO, "this is info");
        logger.log(Level.WARNING, "this is warning");
        logger.log(Level.DEBUG, "this is debug");
        logger.log(Level.ERROR, "this is error");

        
    }
}
