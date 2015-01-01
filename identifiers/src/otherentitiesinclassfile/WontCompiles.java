package otherentitiesinclassfile;

public class WontCompiles{

}

class OhOk{}

enum OhFine{FINE}

enum OhFineWithSemiColonEnding{FINE(1);private int someValue;OhFineWithSemiColonEnding(int i){this.someValue = i;}};

private class AnotherClass{} // Wont

protected class AnotherClass2{} // Wont

private enum AnotherEnum{ZOP,ZAP} // Wont

protected enum AnotherEnum2{UFF} // Wont
