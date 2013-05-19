@Path("/users")
public interface UserService() {
	@GET
	@Path("/{id}")
	@Produces("application/json")
	User getUser(@PathParam("id") String id);
	
	@PUT
	@Path("/{id}")
	Response updateUser(@PathParam("id") Long id, User user);
	
	@POST
	void addUser(User user);
	
	@GET
	@Path("/search")
	public List<User> findUser(@QueryParam("query") String query, 
			@QueryParam("limit") int limit);
}