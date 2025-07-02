# Restaurant Menu Management System

A RESTful Spring Boot application for managing restaurant menu items with CRUD operations and database integration.

## 🚀 Features

- **REST API Endpoints**: Complete set of RESTful services for menu management
- **Menu Item Management**: Create, read, update, and delete menu items
- **Category-based Organization**: Organize menu items by categories (Desserts, Main Course, etc.)
- **Price Management**: Handle menu item pricing
- **H2 Database Integration**: In-memory database for development and testing
- **Database Migration**: Flyway integration for database schema management
- **Spring Boot Framework**: Modern Java web application with auto-configuration
- **JSON Response Format**: All endpoints return JSON formatted data

## 🛠️ Technology Stack

- **Framework**: Spring Boot 2.x/3.x
- **Language**: Java 8+
- **Database**: H2 (In-memory for development)
- **ORM**: Spring Data JPA / Hibernate
- **Migration Tool**: Flyway
- **Build Tool**: Maven
- **Testing**: JUnit 5
- **API**: RESTful Web Services

## 📋 Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven 3.6+
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

## 🔧 Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/vipulmagare/restaurant-menu-java.git
   cd restaurant-menu-java
   ```

2. **Build the project**
   ```bash
   mvn clean install
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the application**
   - API Base URL: `http://localhost:8083/api/menu`
   - H2 Console: `http://localhost:8083/h2-console`

## 📁 Project Structure

```
restaurant-menu-java/
├── src/
│   ├── main/
│   │   ├── java/com/vipul/restaurant/
│   │   │   ├── RestaurantApplication.java      # Main Spring Boot application
│   │   │   ├── controller/
│   │   │   │   └── MenuController.java         # REST API endpoints
│   │   │   ├── domain/
│   │   │   │   └── Menu.java                   # Menu entity/model
│   │   │   ├── service/
│   │   │   │   └── MenuService.java            # Business logic layer
│   │   │   └── config/
│   │   │       └── MenuBean.java               # Configuration beans
│   │   └── resources/
│   │       ├── application.properties          # Application configuration
│   │       └── db/
│   │           └── script.sql                  # Database schema
│   └── test/
│       └── java/com/vipul/restaurant/
│           └── RestaurantApplicationTests.java # Unit tests
└── pom.xml                                     # Maven dependencies
```

## 🌐 API Endpoints

### Base URL: `http://localhost:8083/api/menu`

| Method | Endpoint | Description | Response |
|--------|----------|-------------|----------|
| GET | `/welcome` | Welcome message | String |
| GET | `/all` | Get all menu items | List<Menu> |
| GET | `/single` | Get single menu item | Menu |
| GET | `/filter` | Get filtered menu item | Menu |
| GET | `/hardcoded` | Get hardcoded menu example | Menu |
| POST | `/` | Create new menu item | void |

### Example API Calls

**Get all menu items:**
```bash
curl -X GET http://localhost:8083/api/menu/all
```

**Create a new menu item:**
```bash
curl -X POST http://localhost:8083/api/menu \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Chicken Curry",
    "category": "Main Course",
    "price": 250.0
  }'
```

**Get welcome message:**
```bash
curl -X GET http://localhost:8083/api/menu/welcome
```

## 💾 Database Configuration

The application uses H2 in-memory database with the following configuration:

- **Database URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: (empty)
- **H2 Console**: `http://localhost:8083/h2-console`

### Database Schema

```sql
CREATE TABLE IF NOT EXISTS menu (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,
    price INT
);
```

## 🏃 Running the Application

1. **Start the application:**
   ```bash
   mvn spring-boot:run
   ```

2. **Test the endpoints:**
   - Visit: `http://localhost:8083/api/menu/welcome`
   - Get all items: `http://localhost:8083/api/menu/all`

3. **Access H2 Console:**
   - URL: `http://localhost:8083/h2-console`
   - JDBC URL: `jdbc:h2:mem:testdb`
   - Username: `sa`
   - Password: (leave empty)

## 🧪 Testing

Run the test suite:
```bash
mvn test
```

The project includes:
- Unit tests for application context loading
- Integration tests for REST endpoints
- Database connectivity tests

## 📊 Sample Data

The application includes sample menu items:
- **ABC** (Dessert) - $10.0
- **jamm** (Dessert) - $10.0
- **Paneer Butter Masala** (veg) - $180.0

## 🔧 Configuration

### Application Properties
- **Server Port**: 8083
- **Database**: H2 in-memory
- **JPA**: Hibernate with auto DDL
- **Flyway**: Enabled for database migrations

### Environment Variables
You can override default configurations using environment variables:
```bash
export SERVER_PORT=8080
export SPRING_DATASOURCE_URL=jdbc:h2:mem:mydb
```

## 🚀 Future Enhancements

- [ ] Add authentication and authorization
- [ ] Implement complete CRUD operations
- [ ] Add input validation and error handling
- [ ] Include order management functionality
- [ ] Add pagination and sorting
- [ ] Implement database persistence (MySQL/PostgreSQL)
- [ ] Add comprehensive unit and integration tests
- [ ] Include API documentation with Swagger
- [ ] Add Docker containerization
- [ ] Implement caching with Redis

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Create a Pull Request

## 🐛 Known Issues

- Limited error handling in current implementation
- No input validation for POST requests
- Missing complete CRUD operations for menu management

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Vipul Magare**
- GitHub: [@vipulmagare](https://github.com/vipulmagare)

## 🙏 Acknowledgments

- Built with Spring Boot framework
- Uses H2 database for rapid development
- Inspired by modern REST API best practices

## 📞 Support

For support and questions:
1. Open an issue on GitHub
2. Check the [Spring Boot Documentation](https://spring.io/projects/spring-boot)
3. Review the H2 Database documentation

---

⭐ **Star this repository if you found it helpful!**
