@Provider
public class CustomProvider<T> implements MessageBodyReader<T>,
	MessageBodyWriter<T> {
	public T readFrom(Class<T> tClass, Type type, Annotation[] annotations, 
		MediaType mediaType, MultivaluedMa stringStringMultivaluedMap, 
		InputStream inputStream) {...}
		
	public void writeTo(T target, Class<?> aClass, Type type, Annotation[] as, 
		MediaType mediaType, MultivaluedMap stringObjectMultivaluedMap,
		OutputStream outputStream) {...}
}