package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
    
        ListaCircular<String> minhListaCircular = new ListaCircular<>();

        /*minhListaCircular.add("C0");
        System.out.println(minhListaCircular);

        minhListaCircular.remove(0);
        System.out.println(minhListaCircular);*/

        minhListaCircular.add("C1");
        minhListaCircular.add("C2");
        minhListaCircular.add("C3");
        /*System.out.println(minhListaCircular);

        System.out.println(minhListaCircular.get(0));
        System.out.println(minhListaCircular.get(1));
        System.out.println(minhListaCircular.get(2));
        System.out.println(minhListaCircular.get(30));*/

        for (int i = 0; i < 20; i++) {
            System.out.println(minhListaCircular.get(i));
        }
    }
}