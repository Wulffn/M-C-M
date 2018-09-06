package dat.sem2.randomdanes;

/**
 * The purpose of this class is is to represent contact persons
 * @author kasper
 */
class Person {
<<<<<<< HEAD
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
=======
    private final String _name;
    private final String _phone;

    public Person(String name, String phoneNo) {
        this. _name = name;
        this._phone = phoneNo;
    }

    public String getName() {
        return _name;
    }

    public String getPhoneNo() {
        return _phone;
>>>>>>> 0c1267d375daaa414f68b749a8795208d6e388f4
    }

    @Override
    public String toString() {
        return _navn + " ph: " + _tlfnumr;

    }
    
}
