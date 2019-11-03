import java.util.*;
public class Writer {
    private ArrayList<ComponentSyntactic> components;
    private View view;

    public Writer() {
        components = new ArrayList<ComponentSyntactic>();
        this.view = new View();

    }

    private void writeSubject(Subject subject){
        this.view.print("Valor del sujeto:");
        this.view.print(subject.getValue());
    }

    private void writePredicate(Predicate predicate){
        this.view.print("Valor del predicado: (verbo, complemento directo)");
        this.view.print(predicate.getVerb() + " " + predicate.getDirectComplement() );
    }

    public void writeComplements(){
        this.components.forEach(component -> {
            switch (component.getType()){
                case "predicate":
                    this.writePredicate((Predicate) component);
                    break;

                case "subject":
                    this.writeSubject((Subject) component);
                    break;

            }
        });
    }

    public ArrayList<ComponentSyntactic> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<ComponentSyntactic> components) {
        this.components = components;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
}
