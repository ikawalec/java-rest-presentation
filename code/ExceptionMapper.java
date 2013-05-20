@Provider
public class MyExceptionMapper implements
        ExceptionMapper<MyException> {

    @Override
    public Response toResponse(MyException e) {
        return Response.status(Status.NOT_ACCEPTABLE)
        		.entity("{'msg':'FORGIVE ME'}").build();
    }

}