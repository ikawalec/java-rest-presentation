public interface SimpleClient {
  @PUT
  @Path("basic")
  @Consumes("text/plain")
  void putBasic(String body);
}  
