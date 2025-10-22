package ie.atu.week5lab3.controller.errorHandling;

public class DuplicateExceptionHandling extends RuntimeException{

    private String field;

    public DuplicateExceptionHandling(String message, String field){
        super(message);
        this.field = field;
    }

    public DuplicateExceptionHandling(String message){
        super(message);
    }

}