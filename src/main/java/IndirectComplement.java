public class IndirectComplement extends ComponentSyntactic{
    String toWho;
    String[] whoElse;

    public IndirectComplement(String toWho, String[] whoElse) {
        super();

        this.toWho = toWho;
        this.whoElse = whoElse;
//        this.setType(this.getClass().getName());
    }

    public String getToWho() {
        return toWho;
    }

    public void setToWho(String toWho) {
        this.toWho = toWho;
    }

    public String[] getWhoElse() {
        return whoElse;
    }

    public void setWhoElse(String[] whoElse) {
        this.whoElse = whoElse;
    }

}
