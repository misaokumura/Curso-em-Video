package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) resolucao.getWidth();
        int altura = (int) resolucao.getHeight();
        System.out.println("Sua tela está na resolução " + largura + "x" + altura);
    }
    
}
