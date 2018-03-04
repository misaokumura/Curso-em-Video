
package idiomadosistema;

import java.util.Properties;

public class IdiomaDoSistema {

    public static void main(String[] args) {
        Properties idioma = new Properties();
        System.out.print("Seu sistema está em ");
        System.out.println(System.getProperty("user.language"));
    }
    
}
