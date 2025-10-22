package ie.atu.week5lab3.controller.errorHandling;

public class DuplicateExceptionHandling extends RuntimeException{

    private String field;
    private String message;

    public DuplicateExceptionHandling(String field, String message){
        this.field = field;
        super(message);
    }

    public DuplicateExceptionHandling(String field){
        this.field = field;
    }

}
