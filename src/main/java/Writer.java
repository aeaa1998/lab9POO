import com.sun.tools.javac.util.StringUtils;

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
    private void writeIndirectComplement(IndirectComplement complement){
        this.view.print("Valor del complemento indirecto: (a quien,  quienes mas)");
        this.view.print(complement.getToWho() + "  , " + String.join(" y ", complement.getWhoElse()));
    }

    public void writeComplements(){
        this.components.forEach(component -> {
            view.print(component.getType());
            switch (component.getType()){
                case "Predicate":
                    this.writePredicate((Predicate) component);
                    break;

                case "Subject":
                    this.writeSubject((Subject) component);
                    break;

                default:
                    this.writeIndirectComplement((IndirectComplement) component);
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
