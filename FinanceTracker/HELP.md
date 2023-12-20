# Personal Finance Tracker API

This is a Spring Boot based RESTful API service for a basic Personal Finance Tracker.

## Table of Contents

- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)


## Getting Started

### Prerequisites

Make sure you have the following installed on your machine:

- Java Development Kit (JDK) 8 or higher
- Maven
- Your preferred IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/personal-finance-tracker.git

2. Navigate to the Project Directory
cd personal-finance-tracker

3.Build the Project
mvn clean install

4. Run the Application
mvn spring-boot:run

5.Using IDE
Import the project into your IDE and run the FinancesApplication class.

API Endpoints
The API provides the following endpoints:

Record a new expense:

Method: POST
URL: /api/expenses
Request Body: JSON payload representing the expense.
Update an existing expense:

Method: PUT
URL: /api/expenses/{expenseId}
Request Body: JSON payload with updated expense details.
Delete an expense:

Method: DELETE
URL: /api/expenses/{expenseId}
Record a new income:

Method: POST
URL: /api/incomes
Request Body: JSON payload representing the income.
Generate a financial report:

Method: POST
URL: /api/reports
Request Body: (Optional) JSON payload with report generation parameters.
Set up a new budget:

Method: POST
URL: /api/budgets
Request Body: JSON payload representing the budget.
Retrieve all budgets:

Method: GET
URL: /api/budgets

Contributing
Feel free to contribute to this project. If you find any issues or have suggestions, please open an issue.


