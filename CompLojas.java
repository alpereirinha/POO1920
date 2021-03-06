import java.util.Comparator;
import java.io.Serializable;
/**
 * Compara duas lojas por a quantidade de produtos. Se forem iguais, compara pelo nome e se estas forem iguais, compara pelos códigos de loja. 
 *
 * @author Anabela Pereira - A87990, Fernando Lobo - A87988, Márcia Cerqueira - A87992; 
 * @version 20200611
 */

public class CompLojas implements Comparator<Loja>, Serializable
{
    public int compare(Loja a, Loja b){
        if(a.getProdutos().size() < b.getProdutos().size()) return 1;
        if(a.getProdutos().size() > b.getProdutos().size()) return -1;
        return a.compareTo(b);
    }
}
