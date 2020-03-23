package com.almacenmuchascosas.manejadores;
import com.almacenmuchascosas.entidades.Proveedor;
import com.almacenmuchascosas.articulo.Articulo;
import com.almacenmuchascosas.factura.FacturaProveedor;
import com.almacenmuchascosas.articulo.Transaccion;
/**
 *
 * @author angelrg
 * @author marcosvg 
 */
public class ManejadorProveedores {
    public Proveedor[] crearDatos() {
        Proveedor[] providers = new Proveedor[5];
        providers[0] = new Proveedor("1","John","Pueblo",30253614,"Empresa Factory");
        providers[1] = new Proveedor("2","William","Pueblo",30253414,"Williams");
        providers[2] = new Proveedor("3","Jorge","Ciudad",77893614,"JorgesUnidos");
        providers[3] = new Proveedor("4","Raul","Pueblo",54123614,"Raul Menendez");
        providers[4] = new Proveedor("5","Mario","Pueblo",36453617,"Heladeria DonMario");
        return providers;
    }

    /**
     * Busca un proveedor en base a su NIT
     * @param providers
     * @param NIT
     * @return 
     */
    public Proveedor findProvider(Proveedor[] providers, String NIT){
        for (Proveedor provider : providers) {
            if (provider.getNIT().equalsIgnoreCase(NIT)){
                return provider;
            }
        }
        return null;
    }
    
    
    /**
     * Devuelve un arreglo de articulos que pertenecen al objeto FacturaProveedor
     * @param articles
     * @param providersBills
     * @param NIT
     * @param providerBill
     * @return 
     */
    public Articulo[] getArticlesArr(FacturaProveedor[] providersBills, String NIT, FacturaProveedor providerBill){
        
        for (int i=0; i<providersBills.length;i++) {
            Proveedor provider = providersBills[i].getProvider();
            
            if ( (providersBills[i].getCode() == providerBill.getCode()) && (provider.getNIT().equalsIgnoreCase(NIT))) {
                Transaccion[] transaccion = providersBills[i].getTransactions();
                Articulo[] articles = new Articulo[transaccion.length];
                System.out.println(articles.length);
                System.out.println(transaccion.length);
                    for(int b=0; b<transaccion.length;b++){
                        articles[b] = transaccion[b].getArticulo();
                    }
                return articles;
            }
        }
        return null;
    }
    /*Metodo que nos permite saber los articulos en base a la factura y a un nit
      Dicho metodo en el diagrama es articulosProveedor, donde devolveremos 
     los articulos que coincidan con la factura dada a buscar y con un nit a hallar
     por lo que devolveremos los articulos de la factura de ese proveedor que le ofrecio al almacen*/
    
    
    
    /**
     * Permite imprimir en consola el arreglo que se indican(Proveedores)
     * 
     * @param providers 
     */
    public void printProviders(Proveedor[] providers){
        for (Proveedor provider : providers) {
            provider.printMe();
        }
    }
}
