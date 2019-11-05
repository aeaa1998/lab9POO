import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Writer writer = new Writer();
//        ESTE SERIA EL ARRAYLIST YA CON ORDEN CORRECTO QUE SE MANDARIA
        ArrayList<ComponentSyntactic> components = new ArrayList<ComponentSyntactic>();
        String[] whoElse = {"a sus vidas", "al mundo"};
        components.add(new Subject("El principio de abierto-cerrado (open-closed principle en inglés) "));
        components.add(new Predicate("trae", "bendiciones"));
        components.add(new IndirectComplement("a sus programas", whoElse));
        writer.setComponents(components);
        writer.writeComplements();




    }
}
