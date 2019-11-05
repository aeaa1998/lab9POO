public class Subject extends ComponentSyntactic{
    String value;

    public Subject(String value) {
        super();
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    Boolean derivatives(ComponentSyntactic component) {
        return null;
    }
}
