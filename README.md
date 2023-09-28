# How to run the application

Run the Run.java file at orderManagement/src/main/java/com/orderManagement/internship/Run.java
___
# You will have these endpoints available:

- POST: localhost:8080/api/customer
    - Body:
      {
      "registrationCode": 123,
      "fullName": "James Bond",
      "email": "bond@007.com",
      "telephone": "007"
      }

- POST: localhost:8080/api/product
    - Body:
        {
        "skuCode": "123-FFFF",
        "productName": "Crate",
        "unitPrice": 123.321
        }

- POST: localhost:8080/api/order
    - {
      "orderDto": {
      "customerRegistrationCode": 123,
      "orderDate": "2023-09-28"
      },
      "orderLineDtos": [
      {
      "orderId": 0,
      "productId": 1,
      "quantity": 3
      },
      {
      "orderId": 0,
      "productId": 2,
      "quantity": 4
      }
      ]
      }

- GET: localhost:8080/api/order/date/{date}
  - date format: yyyy-MM-dd
  - example: localhost:8080/api/order/date/2023-09-28
  - returns all orders from that date