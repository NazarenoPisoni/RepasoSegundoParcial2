package exceptions;

public class EdadMinimaException extends Exception{
    private final int age;

    public EdadMinimaException(String message, int age){
        super(message);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
