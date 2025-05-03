import Organizador_de_Clases.Producto_Kumis;
import Organizador_de_Clases.Producto_Yogurt;
import Organizador_de_Clases.Productos_Lacteos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Productos_Lacteos producto1 = new Productos_Lacteos("CIPAS2","Litro","Vainilla",15899.50 );
        producto1.MostrarInforme1();
        //Producto_Yogurt producto1 = new Producto_Yogurt();
       // Producto_Kumis  producto1 = new Producto_Kumis();

    }
}