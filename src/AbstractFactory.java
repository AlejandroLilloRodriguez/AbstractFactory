public class AbstractFactory {

    public static ProductoFactory getFactory(int producto) {
    if (producto == 1) {
        return new CreateAcerPortatil();
    } else if (producto == 2) {
        return new CreateAcerMesa();
    } else if (producto == 3) {
        return new CreateLenovoPortatil();
    } else if(producto == 4) {
        return new CreateLenovoMesa();
    }else{
        return null;
    }
    }
}
