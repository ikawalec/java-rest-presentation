public interface ContactResource {
    @Get
    public Contact retrieve();
}

ClientResource cr = new ClientResource("http://r.com/contacts/123");
ContactResource resource = cr.wrap(ContactResource.class);
Contact contact = resource.retrieve();
