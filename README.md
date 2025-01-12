# JD2-Homework-03

## 1. Number Guessing Game with Leaderboard

### Problem Description

Create an application where the user is prompted to guess a randomly generated number between 1 and 100. Based on their guess, the application will provide feedback such as "Too low, try again" or "Too high, try again". If the user guesses the correct number, the application will show the number of attempts taken to guess correctly.

Additionally, keep track of the number of guesses each user takes and display a leaderboard showing the best results.

### Requirements

1. **Random Number Generation**:
   - Generate a random number between 1 and 100 using **Math.random()**.
   
2. **User Input**:
   - Use a **Scanner** to get user input for their guess.
   
3. **Feedback**:
   - If the guess is too low, print "Too low, try again".
   - If the guess is too high, print "Too high, try again".
   - When the guess is correct, display the number of guesses taken to find the correct number.

4. **Leaderboard**:
   - Track the number of attempts made by each user.
   - Maintain a leaderboard to show the best scores of multiple users.

5. **Bonus**:
   - Modify the application for multiplayer functionality where multiple users can play simultaneously and their scores are tracked.

### Design

- **Counter**: Use a counter to track the number of guesses made by the user.
- **Leaderboard**: Store the number of correct guesses for different users in an array or list to display the leaderboard.
- **Multiplayer**: Implement user input for multiple players and store the results of their guesses.

---

## 2. Palindrome Checker and Reverse Word Application

### Problem Description

Create an application that asks the user for a word, reverses it, and checks if the word is a palindrome (i.e., it reads the same forwards and backwards).

### Requirements

1. **User Input**:
   - Prompt the user to enter a word using the **Scanner** class.

2. **Reversing the Word**:
   - Reverse the word using a loop or built-in string manipulation methods.

3. **Palindrome Check**:
   - Check if the word is the same forwards and backwards.
   - Print whether the word is a palindrome.

4. **Example**:
   - For the input "kayak", the program should output "The word is a palindrome."
   - For the input "hello", the program should output "The word is not a palindrome."

### Design

- **Reversing**: Use a loop to reverse the string or use built-in string methods.
- **Palindrome Check**: Compare the original word with the reversed word to check if they are the same.

---

## Prerequisites

- **Java 17 or later**
- An IDE like IntelliJ IDEA or Eclipse

---
