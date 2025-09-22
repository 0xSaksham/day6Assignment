# 🏦 BankApp (Java OOP Example)

A simple Java console application that demonstrates **Object-Oriented Programming (OOP)** concepts such as **classes, objects, encapsulation, and methods**.  

This project simulates a bank account with the ability to:
- Create an account
- Deposit money
- Withdraw money
- View account details

---

## 📂 Project Structure

```

src/
├── BankAccount.java   # Class representing a bank account
└── BankApp.java       # Main class with the program entry point

````

---

## ⚙️ Requirements

- Java 11 or later (JDK)
- IntelliJ IDEA (Community Edition or Ultimate) **or** any Java IDE
- (Optional) Termux on Android (for running `.jar` files on phone)

---

## 🚀 How to Run

### On Desktop / Laptop

1. **Compile and run inside IntelliJ IDEA**
   - Open the project
   - Right-click `Main.java` → **Run 'BankApp.main()'**

2. **Build a JAR file**
   - Go to `File > Project Structure > Artifacts`
   - Add new JAR → *From modules with dependencies*
   - Select `BankApp` as the main class
   - Build → `Build Artifacts > Build`

3. **Run the JAR**
   ```sh
   java -jar BankApp.jar
    ```

---

### On Android (via Termux)

1. Install Java:

   ```sh
   pkg update && pkg upgrade
   pkg install openjdk-17
   ```

2. Verify Java:

   ```sh
   java -version
   ```

3. Copy `BankApp.jar` to `Downloads`, then run:

   ```sh
   cd /storage/emulated/0/Download
   java -jar BankApp.jar
   ```

---

## 🧑‍💻 Example Output

```
--- Account Details ---
Account Holder: John Doe
Account Number: 123456789
Balance: $500.0

Successfully deposited: $200.0

Successfully withdrew: $100.0

Insufficient balance!


--- Account Details ---
Account Holder: John Doe
Account Number: 123456789
Balance: $600.0
```

---

## 📚 OOP Concepts Demonstrated

* **Encapsulation**: Private fields with public methods
* **Abstraction**: User interacts only with deposit/withdraw/display methods
* **Objects**: Each `BankAccount` represents a separate account
* **Reusability**: Multiple accounts can be created and managed

---

## 📌 Next Steps (Optional Enhancements)

* Make the program interactive with a menu (`Scanner`)
* Support multiple bank accounts (ArrayList)
* Save account data to a file or database
* Port to an Android app (with UI)

---

✨ Built with Java OOP principles for learning and practice.



