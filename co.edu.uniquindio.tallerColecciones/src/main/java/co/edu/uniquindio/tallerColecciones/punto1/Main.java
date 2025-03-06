package co.edu.uniquindio.tallerColecciones.punto1;

public class Main {

    public static void main(String[] args) {

        //El taller fue presentado por:
        //Andres Felipe Ortega Mendez
        //Karen Valentina Valbuena

        Empresa empresa = new Empresa();

        empresa.agregarProducto(new Producto("123", "carro", 50000));
        empresa.agregarProducto(new Producto("456", "moto", 5000));
        empresa.agregarProducto(new Producto("789", "cicla", 9000));

        String codigoBuscar = "123";

        Producto producto = empresa.buscarProducto(codigoBuscar);

        if (producto == null) {
            System.out.println("No se encontro el producto");
        }else {
            System.out.println("Producto encontrado: " +producto);
        }
    }

}
