public class Subject extends ComponentSyntactic{
    String value;

    public Subject(String value) {
        this.value = value;
        this.setType(this.getClass().getName());
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
