import java.util.ArrayList;

abstract class ComponentSyntactic {
    private String type;

    ComponentSyntactic() {
        this.type = this.getClass().getName();

    }

    Boolean derivatives(ArrayList<ComponentSyntactic> components, ComponentSyntactic component){
        int key = 0;
        for (int i = 0; i < components.size(); i++) {
            if (components.get(i).getType().equalsIgnoreCase(this.getType()))
                key = i;
        }
        return (key != (components.size() -1) && (component.getType().equalsIgnoreCase(components.get(key + 1).getType())));
    };

    String getType() {
        return type;
    }



    private void setType(String type) {
        this.type = type;
    }


}
