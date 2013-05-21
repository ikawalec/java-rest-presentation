public class App {
  public static final String API_URL = "http://localhost:8080/api/";

  public static void main(String[] args){

    Client client = Client.create();
    
    String productToAdd = "beer";
    WebResource webResource = client.resource(API_URL + "product");
    
    // following will work, however...
    // webResource.accept(MediaType.TEXT_PLAIN).post(productToAdd);
    
    ClientResponse clientResponse = webResource.accept(MediaType.TEXT_PLAIN)
    		.post(ClientResponse.class, productToAdd);
    if(clientResponse.getStatus() != 201){
        throw new WebApplicationException(clientResponse.getStatus());
    } else {
        // process next steps...
    }