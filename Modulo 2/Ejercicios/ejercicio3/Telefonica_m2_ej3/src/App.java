public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayEncapsulado arrayE = new ArrayEncapsulado();

        arrayE.rellenar(24);
        arrayE.visualizar();
        System.out.println("------------------------");
        arrayE.rellenar();
        arrayE.visualizar();
        System.out.println("------------------------");
        arrayE.ordenar();
        arrayE.visualizar();

    }
}
