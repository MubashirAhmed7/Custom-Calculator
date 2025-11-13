# Custom Calculator 🧮

- ***A **menu-driven calculator** in **Java** with **custom exceptions**, **input validation**, **division-by-zero protection**, and **calculation history*****.

- ***Built to demonstrate **robust error handling**, **OOP**, and **user-friendly CLI apps*****.

---

## ✨ Features

| Feature | Description |
|--------|-------------|
| **Addition / Subtraction** | Unlimited range (within `Double.MAX_VALUE`) |
| **Multiplication** | Safe limit ≤ 70,000 to prevent overflow |
| **Division** | Zero-division protection |
| **Custom Exception** | `MyCusCalcException` for controlled errors |
| **Calculation History** | View all past operations |
| **Retry on Invalid Input** | No crashes — just try again! |

---

## 🖥️ Demo

**Calculator Menu:**
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Show History
6. Exit
   
Choose an option (1-6): 1

Enter any two numbers for addition!

Enter The Number Here: 25.5

Enter The Number Here: 10

25.50 + 10.00 = 35.50

Back to menu...

- ***Try entering letters, dividing by zero, or multiplying huge numbers — it handles everything gracefully!***

---

## 🛠️ Tech Stack

- **Java 8+**
- **Core Java**: `Scanner`, `LinkedList`, `Exception`
- **OOP**: Custom class, methods, encapsulation

---

## 📜 Project Structure

    *src/
        └── io/github/mubashirahmed7/customcalculator/
            ├── CustomCalculator.java     Main entry & menu
            ├── CustomCalc.java           Core logic + history
            └── MyCusCalcException.java   Custom exception

---

## Author

***Made with ❤️ by Mohd Mubashir Ahmed***

---

## 📄 License

- This project is open source and available under the MIT License.

---

## 🤝 Contributing

-  Contributions are welcome via Pull Requests.
