# Barbershop API Documentation

=====================================

## Introduction

---

The Barbershop API is a RESTful API designed to manage the operations of a barbershop. The API provides endpoints for creating, reading, updating, and deleting (CRUD) users, barbers, and appointments.

## Entities

---

### User

#### Attributes:

- `id`: Unique identifier for the user (Long)
- `name`: Name of the user (String)
- `email`: Email address of the user (String)

### Barber

#### Attributes:

- `id`: Unique identifier for the barber (Long)
- `name`: Name of the barber (String)
- `email`: Email address of the barber (String)

### Appointment

#### Attributes:

- `id`: Unique identifier for the appointment (Long)
- `date`: Date of the appointment (Date)
- `time`: Time of the appointment (Time)
- `user`: The user who booked the appointment (User)
- `barber`: The barber who will provide the service (Barber)

## Controllers

---

### UserController

#### Endpoints:

- `GET /users`: Retrieves a list of all users
- `GET /users/{id}`: Retrieves a user by ID
- `POST /users`: Creates a new user
- `PUT /users/{id}`: Updates an existing user
- `DELETE /users/{id}`: Deletes a user

### BarberController

#### Endpoints:

- `GET /barbers`: Retrieves a list of all barbers
- `GET /barbers/{id}`: Retrieves a barber by ID
- `POST /barbers`: Creates a new barber
- `PUT /barbers/{id}`: Updates an existing barber
- `DELETE /barbers/{id}`: Deletes a barber

### AppointmentController

#### Endpoints:

- `GET /appointments`: Retrieves a list of all appointments
- `GET /appointments/{id}`: Retrieves an appointment by ID
- `POST /appointments`: Creates a new appointment
- `PUT /appointments/{id}`: Updates an existing appointment
- `DELETE /appointments/{id}`: Deletes an appointment

## API Endpoints

---

| Endpoint             | Method | Description                          |
| -------------------- | ------ | ------------------------------------ |
| `/users`             | GET    | Retrieves a list of all users        |
| `/users/{id}`        | GET    | Retrieves a user by ID               |
| `/users`             | POST   | Creates a new user                   |
| `/users/{id}`        | PUT    | Updates an existing user             |
| `/users/{id}`        | DELETE | Deletes a user                       |
| `/barbers`           | GET    | Retrieves a list of all barbers      |
| `/barbers/{id}`      | GET    | Retrieves a barber by ID             |
| `/barbers`           | POST   | Creates a new barber                 |
| `/barbers/{id}`      | PUT    | Updates an existing barber           |
| `/barbers/{id}`      | DELETE | Deletes a barber                     |
| `/appointments`      | GET    | Retrieves a list of all appointments |
| `/appointments/{id}` | GET    | Retrieves an appointment by ID       |
| `/appointments`      | POST   | Creates a new appointment            |
| `/appointments/{id}` | PUT    | Updates an existing appointment      |
| `/appointments/{id}` | DELETE | Deletes an appointment               |

## Request and Response Bodies

---

The API uses JSON to represent request and response bodies. The following is an example of a JSON representation of a user:

```json
{
  "id": 1,
  "name": "John Doe",
  "email": "johndoe@example.com"
}
```

# Error Handling

The API uses standard HTTP error codes to indicate errors. The following is a list of error codes used by the API:

| Error Code | Description           |
| ---------- | --------------------- |
| 400        | Bad Request           |
| 401        | Unauthorized          |
| 404        | Not Found             |
| 500        | Internal Server Error |

# Security

The API uses authentication and authorization to secure endpoints. The API uses JSON Web Tokens (JWT) to authenticate users and barbers.

# Conclusion

The Barbershop API provides a comprehensive set of endpoints for managing users, barbers, and appointments. The API uses standard HTTP methods and JSON to represent request and response bodies. The API also uses authentication and authorization to secure endpoints.
