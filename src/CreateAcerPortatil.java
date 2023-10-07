public class CreateAcerPortatil implements ProductoFactory{
    public Producto crearProducto() {
        return new AcerPortatil(1);
    }
}

