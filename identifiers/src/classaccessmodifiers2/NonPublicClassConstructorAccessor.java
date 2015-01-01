package classaccessmodifiers2;

class NonPublicClassConstructorAccessor{
    public NonPublicClassConstructorAccessor(){// could it be?
    // yes it could be but it doesnt have any value
    // because a class with default accessor can only be accessed from the same package
    // and making the constructor public wont be any use.
    }    
}
