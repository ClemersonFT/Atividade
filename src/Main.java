import br.univille.log.Level;
import br.univille.log.LoggerFactory;
import br.univille.log.Logger;
import br.univille.log.Level;
import br.univille.log.LoggerFactory;

public class Main {
    public static void main(String [] args){
        LoggerFactory.onConsole().log(Level.WARNING, "Texto");
        LoggerFactory.onFile().log(Level.WARNING,"Texto");
    }
}


