import java.util.Comparator;
import java.io.Serializable;
/**
 * Compara dois clientes por número de encomendas. Se forem iguais, compara por o nome e se estes forem iguais, compara pelos códigos de utilizador. 
 * 
 * @author Anabela Pereira - A87990, Fernando Lobo - A87988, Márcia Cerqueira - A87992; 
 * @version 20200611
 */

public class CompClientes implements Comparator<Cliente>, Serializable
{
    public int compare(Cliente a, Cliente b){
        if(a.getNenc() < b.getNenc()) return 1;
        if(a.getNenc() > b.getNenc()) return -1;
        return a.compareTo(b);
    }
}