package dat.sem2.randomdanes;

/**
 * The purpose of this class is is to represent contact persons
 * @author kasper
 */
class Person {
    private final String navn;
    private final String tlfnumr;

    public Person(String name, String phoneNo) {
        this.navn = name;
        this.tlfnumr = phoneNo;
    }

    public String getName() {
        return navn;
    }

    public String getPhoneNo() {
        return tlfnumr;
    }

    @Override
    public String toString() {
        return navn + " ph: " + tlfnumr;
    }
    
}
