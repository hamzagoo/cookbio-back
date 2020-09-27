*Spring Boot API & Java 8*

*Data models :*
====================

*Product:*
	```
	
	private Long id;
	private String title;
	private String description;
	private Double price;
	
*Cart:*
	```
	
	private Long id;
	private User user;
	private List<Product> products;
	private Double total;
	
	
*User:*
	```
	
	private Long id;
	private String email;
	private String username;
	private String password;
		