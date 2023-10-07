public class CreateLenovoMesa implements ProductoFactory{
    public Producto crearProducto() {
        return new LenovoMesa(4);
    }
}
