SimpleClient client = ProxyFactory.create(SimpleClient.class, 
		"http://localhost:8080/api");
client.putBasic("hello world"); 