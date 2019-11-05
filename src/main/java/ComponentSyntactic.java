abstract class ComponentSyntactic {
    private String type;

    ComponentSyntactic() {
        this.type = this.getClass().getName();

    }

    abstract Boolean derivatives(ComponentSyntactic component);

    String getType() {
        return type;
    }



    private void setType(String type) {
        this.type = type;
    }


}
