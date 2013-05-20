@Component("sampleInterceptor")
public class SampleInterceptor extends AbstractOutDatabindingInterceptor {
	public void handleMessage(Message outMessage) {	
		MultivaluedMap headers = message.get(Message.PROTOCOL_HEADERS);
		headers.putSingle("myHeader", "someValue");
	}
}