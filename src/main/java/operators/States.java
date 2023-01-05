package operators;

public enum States {
    TAMILNADU("TN"),
    KARNATAKA("KA"),
    KERALA("KL"),
    ANDHRAPRADESH("AP"),
    TELANGANA("TS");

    private String state;

    States(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
    States(){
        this.state="TAMILNADU";
    }
}
