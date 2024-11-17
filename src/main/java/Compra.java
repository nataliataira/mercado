import java.util.Date;
import java.util.List;

public class Compra extends Operacao {
    private Date dataCompra;

    public Compra(List<Item> itens, Date dataCompra) throws IllegalArgumentException {
        super(itens);
        setDataCompra(dataCompra);
    }

    public Date getDataCompra() {
        return new Date(dataCompra.getTime());
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = new Date();
    }

    public void realizarCompra() {
        //
    }
}
