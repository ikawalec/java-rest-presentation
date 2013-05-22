public class ProductList extends JerseyTest {
 public static final String API_URL = "http://localhost:8080/api/";
	
  public MainTest() throws Exception {
    super("com.example.resources");
  }

  @Test
  public void testHelloWorld() {
    WebResource webResource = resource();
    String response = webResource.path(API_URL + "/product/1")
    		.get(String.class);
        
    String expectedProduct = "beer";
    assertEquals(expectedProduct, response); 
  }
}