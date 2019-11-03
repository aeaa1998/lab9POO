public class Predicate extends ComponentSyntactic{
    String verb;
    String directComplement;

    public Predicate(String verb, String directComplement) {
        this.verb = verb;
        this.directComplement = directComplement;
        this.setType(this.getClass().getName());
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getDirectComplement() {
        return directComplement;
    }

    public void setDirectComplement(String directComplement) {
        this.directComplement = directComplement;
    }
}
