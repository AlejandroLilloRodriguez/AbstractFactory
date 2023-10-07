public class CreateLenovoPortatil implements ProductoFactory{
    public Producto crearProducto() {
        return new LenovoPortatil(3);
    }
}
