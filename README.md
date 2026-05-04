# 🎯 Guess the Number (Java Mini Project)

A simple console-based number guessing game built using Java.  
The program generates a random number, and the user has to guess it with hints provided after each attempt.

---

## 📌 Features

- 🔢 Random number generation  
- 🎮 Interactive user input via console  
- 📉 Hints for each guess:  
  - Too high  
  - Too low  
- 🔁 Continuous guessing until correct  
- 🧠 Beginner-friendly logic and structure  

---

## 🛠️ Technologies Used

- Java  
- `java.util.Scanner` for input  
- `Math.random()` for random number generation  

---

## 🚀 How It Works

1. The program generates a random number between **0 and 99**  
2. The user is prompted to enter a number  
3. The program compares the guess with the generated number:  
   - If correct → displays success message  
   - If higher → "Too Large"  
   - If lower → "Too Small"  
4. The loop continues until the correct number is guessed  
5. Finally, the correct number is displayed  

---

## ▶️ How to Run

1. Clone the repository:
```
git clone https://github.com/your-username/guess-the-number.git
```

2. Navigate to the project folder:
```
cd guess-the-number
```

3. Compile the program:
```
javac mini_Project/Main.java
```

4. Run the program:
```
java mini_Project.Main
```

---

## 💡 Sample Output

```
Enter your Number:
50
Your Number is toooo Large.

Enter your Number:
25
Your Number is toooo Small.

Enter your Number:
37
Wohooooooooooooo Correct Number....

The Number was:
37
```

---

## ⚠️ Notes / Improvements

- Currently generates numbers from **0–99**  
- Loop condition can be simplified (`while(true)`)  
- No attempt counter (can be added for enhancement)  
- Input validation is not implemented  

---

## 🌟 Future Enhancements

- ✅ Add attempt counter  
- 🎚️ Difficulty levels (Easy/Medium/Hard)  
- 🧮 Score system  
- ❌ Input validation (handle invalid inputs)  
- 🧱 Convert into modular code using methods/classes  

---

## 🙌 Author

- Saquib.
