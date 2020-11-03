*Spring Boot API & Java 8*

*Data models :*
====================

*Product Module:*
	
	private Long id;
	private String title;
	private String description;
	private Double price;
	
*Endpoint :*
	
	getProducts() : GET /product
	getProduct() : GET /product/{id}
	createProduct() : POST /product
	deleteProduct() : PUT /product
	updateProduct() : PUT /product
	
*Cart:*
	
	private Long id;
	private User user;
	private List<Product> products;
	private Double total;
	
*Endpoint :*
	
	getCartByUser() : GET /cart/{idUser}
*User:*
	
	private Long id;
	private String email;
	private String username;
	private String password;
	
*Endpoint :*
	
	authentification() : GET /login
		- param username
		- param password 
		