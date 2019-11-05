public class Predicate extends ComponentSyntactic{
    String verb;
    String directComplement;

    public Predicate(String verb, String directComplement) {
        super();

        this.verb = verb;
        this.directComplement = directComplement;
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
