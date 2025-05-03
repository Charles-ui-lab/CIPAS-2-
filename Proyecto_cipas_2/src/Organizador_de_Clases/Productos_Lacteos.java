package Organizador_de_Clases;

public class Productos_Lacteos {
    //Atributos
    private String marca;
    private String presentacion;
    private String sabor;
    private double precio;

    //Constructor Inicializador de los atributos
    public Productos_Lacteos(String marca, String presentacion, String sabor, double precio) {
        this.marca = marca;
        this.presentacion = presentacion;
        this.sabor = sabor;
        this.precio = precio;
    }
    
    public void MostrarInforme1(){
        System.out.println("Marcar :"+marca+" Presentacion : "+presentacion+" Sabor : "+sabor+" Precio : "+precio);
    }


}

