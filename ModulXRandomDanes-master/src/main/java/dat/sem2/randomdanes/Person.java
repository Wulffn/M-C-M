package dat.sem2.randomdanes;

/**
 * The purpose of this class is is to represent contact persons
 * @author kasper
 */
class Person {
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
    }

    @Override
    public String toString() {
        return _name + " ph: " + _phone;
    }
    
}
