import java.util.Date;
import java.util.List;

public class Venda extends Operacao {
    private Date dataVenda;

    public Venda(List<Item> itens, Date data) throws IllegalArgumentException {
        super(itens, data);
    }

    public void realizarVenda() {
        //
    }
}
