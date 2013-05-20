@Component
public SampleApplication {
	@Resouce(name="userClient")
	private UserService userService;
	
	public void displayUser(String id) {
		User user = userService.get(id);
		(...)
	}
}