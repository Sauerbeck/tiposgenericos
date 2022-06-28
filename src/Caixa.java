public class Caixa<T> {
    T objeto;

    public Caixa() {
    }

    public void guarda(T obj) {
        if (this.objeto == null )
        {
            this.objeto = obj;
            System.out.println("Objeto adicionado:" + obj + " / " + this.objeto.getClass().getTypeName());
        }
        else
        {
            System.out.println("Objeto existente");
        }
    }
    public void remove(T obj) {
        if (this.objeto != null) {
            this.objeto = null;
            System.out.println("Objeto removido:" + obj + " / " + obj.getClass().getName() );
        }
    }
}