package atm;

public enum Banknotes {
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100),
    TWOHUNDRED(200),
    FIVEHUNDRED(500),
    ;

    private final int value;
    Banknotes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
