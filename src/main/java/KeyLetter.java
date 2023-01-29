public enum KeyLetter {
    //First Layer
    Q(16),
    W(17),
    E(18),
    R(19),
    T(20),
    Y(21),
    U(22),
    I(23),
    O(24),
    P(25);
    //Second Layer


    private final int value;
    KeyLetter(final int newValue) {
        this.value = newValue;
    }
    public int getValue(){
        return value;
    }
}
