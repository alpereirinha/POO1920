import java.util.Comparator;
import java.io.Serializable;
/**
 * Compara duas empresas por número de quilômetros percorridos (ordem decrescente). Se forem iguais, compara pelo nome e se estes forem iguais, compara pelos códigos de empresa. 
 * 
 * @author Anabela Pereira - A87990, Fernando Lobo - A87988, Márcia Cerqueira - A87992; 
 * @version 20200611
 */

public class CompEmpresas implements Comparator<Empresa>, Serializable
{
    public int compare(Empresa a, Empresa b){
        if(a.getKms() < b.getKms()) return 1;
        if(a.getKms() > b.getKms()) return -1;
        return a.compareTo(b);
    }
}
