package com.almacenmuchascosas.manejadores;
import com.almacenmuchascosas.articulo.Articulo;

/**
 *
 * @author angelrg 
 * @author marcosvg 
 */
public class ManejadorArticulos {
     public Articulo[] crearDatos() {
        Articulo[] articles = new Articulo[5];
        articles[0] = new Articulo(123,"Desinfectante",125.00,30.00);
        articles[1] = new Articulo(213,"Gel de Manos",0.00,5.00);
        articles[2] = new Articulo(345,"Arroz",2560.00,3.00);
        articles[3] = new Articulo(446,"Azucar",1158.00,25.00);
        articles[4] = new Articulo(512,"Chocolate",525.00,9.50);
        return articles;
    }
    
    /**
     * Obtener la lista de articulos presentes en el almacen
     * @param articles
     * @return 
     */
    public Articulo[] getArticles(Articulo[] articles) {
        return articles;
    }
    
    /**
     * Obtener un articulo en especifico en base a un codigo
     * @param articles
     * @param code
     * @return 
     */
    public Articulo lookArticle(Articulo[] articles, int code){
        for (Articulo article:articles){
            if (article.getCodigo() == code){
                return article;
            }
        }
        return null;
    }
    
}
