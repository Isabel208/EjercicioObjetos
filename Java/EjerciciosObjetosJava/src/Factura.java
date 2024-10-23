package clasesagregacion;

import java.util.ArrayList;
import java.util.Iterator;
import clasesagregacion.*;

public class Factura extends Comprobante{
    private float total;
    private cliente mcliente;
    private ArrayList<Producto> mProducto = new ArrayList<>();

    public Factura(char tipo, int numero, Fecha fecha, Cliente cliente) {
        super(tipo, numero, fecha);
        setCliente(cliente);
    }

    public void setTtotal(float total) {
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    public void setCliente(Cliente cliente) {
        this.mCliente = cliente;
    }
    
    public void setCliente() {
        return mCliente;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.mProducto = producto;
    }

    public ArrayList<Producto> getProducto() {
        return mProducto;
    }

    public void agregarProducto(Producto p) {
        mProducto.add(p);
        setTotal(getTotal() + p.getPrecio());
    }

    public void mostrarProducto() {
        Iterator<Producto> iter = mProducto.iterator();
        while(iter.hasNext()) {
            Producto p = iter.next("Codigo: %d Descripcio: %s Precio: %5.2");
        }
    }
}
