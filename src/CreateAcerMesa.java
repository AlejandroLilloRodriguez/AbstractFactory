public class CreateAcerMesa implements ProductoFactory{
    public Producto crearProducto() {
        return new AcerMesa(2);
    }
}
