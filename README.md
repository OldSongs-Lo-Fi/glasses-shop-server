# Eyewear Store Server

Welcome to the Eyewear Store Server project!

This project is a full-stack application built on Java and the Spring Framework. It provides a server-side solution for an eyewear store website, allowing users to browse and purchase eyewear products. The following technologies are used:

- Java: The programming language used for server-side development.
- Spring Framework: Provides a comprehensive set of tools and libraries for building Java applications, including Spring Boot for easy setup and configuration.
- MySQL: A relational database management system used to store and retrieve data.
- JPA (Java Persistence API): A standard specification for object-relational mapping in Java, used for interacting with the database.
- Client Side Rendering: The website utilizes client-side rendering, meaning that the rendering of web pages is done on the client's browser using JavaScript frameworks like Angular.
- CORS (Cross-Origin Resource Sharing) Filter: A filter used to handle cross-origin requests, allowing the website to make requests to the server from different origins.

The project follows the Model-View-Controller (MVC) architectural pattern, which separates the application logic into three interconnected components:

1. Models: Represent the entities in the system, such as Eyewear and Orders. These entities are stored and retrieved from the database using JPA.
2. Views: Handled by the client-side rendering framework (e.g., Angular) and responsible for displaying the user interface.
3. Controllers: Handle the incoming requests, perform necessary operations, and return responses. They interact with the models and views to fulfill the user's requests.

One of the key functionalities of the server is the ability to save orders in the relational database using JPA. This ensures that the orders are securely stored and can be accessed for further processing.

# Order Controller

The Order Controller is responsible for handling HTTP requests related to orders in the eyewear store.

### Endpoints:

- **GET /order**: Retrieves all orders in the system.
- **GET /order/{id}**: Retrieves a specific order by its ID.
- **POST /order/addOrder**: Creates a new order by providing the order details in the request body.
- **PUT /order/updateOrder**: Updates an existing order by providing the updated order details in the request body.
- **DELETE /order/deleteOrder**: Deletes an order based on its ID.

Please note that the implementation of these endpoints redirects to the root URL ("/") after completing the requested operation.

# Glass Controller

The Glass Controller handles HTTP requests related to eyewear products in the eyewear store.

### Endpoints:

- **GET /glasses**: Retrieves all eyewear products in the system.
- **GET /glasses/{id}**: Retrieves a specific eyewear product by its ID.
- **POST /glasses/addGlass**: Creates a new eyewear product by providing the product details in the request body.
- **PUT /glasses/updateGlass**: Updates an existing eyewear product by providing the updated product details in the request body.

Please note that the implementation of these endpoints redirects to the root URL ("/") after completing the requested operation.

Both controllers are annotated with `@RestController` and have the base URL path set to "/order" and "/glasses" respectively, using the `@RequestMapping` annotation.

The controllers utilize services (`OrderService` and `GlassService`) to perform the necessary operations related to orders and eyewear products. Please refer to the source code for more specific implementation details.

If you have any questions or need further assistance, please feel free to reach out.

To get started with the Eyewear Store Server project:

1. Clone the repository.
2. Set up the necessary dependencies and configurations in your Java development environment.
3. Run the server application.
4. Ensure that the client-side application (Angular) is properly configured to communicate with the server.
5. Explore the eyewear store website, browse products, and place orders.

Please refer to the source code for more specific implementation details, including the database schema, RESTful endpoints, and business logic.

If you have any questions or feedback, feel free to reach out. Thank you for your interest in our project!
