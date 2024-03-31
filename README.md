**REST API for an E-Commerce Application**
The E-Commerce Application is built using Java and Spring Boot.This API performs all the fundamental CRUD operations of any e-commerce platform 
The backend uses Spring Data JPA to interact with a MySQL database, making it easy to manage and store important entities such as users, products, categories, orders, and more.

**Tech Stack**
Java
Spring Framework
Spring Boot
Spring Data JPA
Hibernate
MySQL

**API Module Endpoints**

Category API

•	POST /category/ createCategory : Create category
•	GET /getCategory : Gets all category
•	POST /category/updateCategoryById/{category_id}: Get category by id

Product API
•	GET /product/createProduct: Create product 
•	GET /products/getAllProduct : Gets all products
•	GET /products /getProductById/{product_id} } : Gets product with given id

Cart API
•	POST  /cart/createProduct /addToCart: Add product to the cart
•	GET /cart/viewCart : View Cart
•	POST /cart/updateQuantity/{product_id}: Update quantity using product id
•	DELETE /cart/removeProduct/{product_id}: Remove product from cart using product id

Order API
•	POST order/orderCraete- Create order with cart values



