package clasesagregacion;

import java.util.ArrayList;
import java.util.Iterator;
import clasesagregacion.*;

public class Factcura extends Comprobante{
    private float tota;
    private cliente mCliente;
    private ArrayList<Producto> mProducto = new ArrayList<>();

    public Factcura(char tipo, int numero. Fecha fecha, Cliente cliente) {
        super(tipo, numero, fecha);
        setCliente(cliente);
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getTotal() {
        return total;
    } 

    public void setCliente(Cliente cliente) {
        this.mCliente = cliente; 
    }

    public cliente getCliente() {
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
        setTotal(getTotal() + p.getPrecio)
    }

    public void mostrarProducto() {
        Iterator<Empleado> iter = mProducto.iterator();
        while(iter.hasNext()) {
            Producto p = iter.next();
            system.out.print("codigo:%d Descripcion: %s Precio: %5.2f/n",
            p.getCodigo(), p.getDescripcion(), p.getPrecio(), getPrecio());
        }
    }

    public void mostrar() {
    System.out.printf("Tipo: %c Numero: %d Fecha: %d%d%\n" , getTipo(), get)
    }

}