@Path("/product")
public class ProductListService {

	@GET
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN) 
	public String get(@PathParam("id") Integer id){
	    return dao.get(id);
	}
	
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	public void add(String name){
	    dao.add(name);
	}
    
 }