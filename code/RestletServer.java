public class RestletServer extends ServerResource {  
   public static void main(String[] args) throws Exception {  
      new Server(Protocol.HTTP, 8182, RestletServer.class).start();  
   }

   @Get  
   public String toString() {  
      return "hello, world";  
   }
} 