📌 Description

This Java program prints a large star (*) pattern for any word entered by the user.
Each character of the word is displayed using a 7 × 5 grid pattern made of stars.

The program supports all uppercase English letters (A–Z).

🛠️ Features

Accepts a word from the user

Converts input to uppercase

Prints each letter using * symbols

Displays letters side by side

Uses modular methods for each alphabet pattern

📂 Project Structure
Word.java


Main components:

main() – Takes input and starts execution

printWordPattern() – Prints the whole word row by row

printLetterRow() – Chooses the correct letter pattern

printARow() to printZRow() – Pattern logic for each letter

printBlankRow() – Handles unsupported characters

▶️ How It Works

User enters a word

Word is converted to uppercase

Program loops through 7 rows

For each row:

Loops through every character

Calls the corresponding letter method

Each letter is printed using a 5-column star pattern

💻 How to Run

Save the file as Word.java

Compile the program:

javac Word.java


Run the program:

java Word


Enter a word when prompted

🧪 Sample Input
Enter a word to print its pattern:A

📤 Sample Output (Example)
                  *     
                *   *       
                * * *       
                *   *       
                *   *     


(Output varies based on the word)

🧠 Concepts Used

Java Methods

Nested Loops

Switch Case

Character Handling

Pattern Printing

Scanner Class

⚠️ Notes

Only A–Z alphabets are supported

Other characters are printed as blank spaces

Patterns are fixed to 7 rows and 5 columns

🎓 Use Case

Java mini project

Pattern printing practice

Lab assignment

Logic building using loops and conditions

✍️ Author

Bindusri Polinati
