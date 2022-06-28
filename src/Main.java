class Main {
    public static void main(String[] args) {

        Caixa<String> caixa1 = new Caixa<>();

        caixa1.guarda("Caneta");
        caixa1.guarda("Caneta");
        caixa1.remove("Caneta");

        Caixa<Integer> caixa2 = new Caixa<>();
        caixa2.guarda(10);
        caixa2.remove(10);

        Caixa<Number> caixa3 = new Caixa<>();
        caixa3.guarda(20);
        caixa3.remove(20);
    }
}