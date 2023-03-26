# Caesar Cipher

This Java program is a basic implementation of the Caesar Cipher algorithm, which is a simple encryption technique that involves shifting the letters of a message by a certain number of positions down the alphabet.

The program prompts the user to input a string and a numeric key, which represents the number of positions each letter in the message will be shifted. The user is also asked to choose between two options: to encode or decode the message.

The code first converts the string input to a character array, then iterates through each element of the array. For each letter in the message, the code first checks whether it is a lowercase or uppercase letter of the English alphabet, by comparing its ASCII value to the range of ASCII values of the lowercase and uppercase letters. If it is not a letter, it is left unchanged.

If the letter is a lowercase letter, the code adds the key to its ASCII value to get the ASCII value of the new shifted letter. If this new value exceeds the ASCII value of the letter 'z', the code calculates the difference between the new value and 'z', then adds this difference to the ASCII value of 'a'. This allows the cipher to "wrap around" to the beginning of the lowercase alphabet. This process continues until a valid lowercase letter is obtained.

If the letter is an uppercase letter, the process is similar, but the code checks if the new value exceeds the ASCII value of the letter 'Z', and if so, it wraps around to the beginning of the uppercase alphabet.

If the user chose to decode the message, the code performs the opposite operation: it subtracts the key from each letter's ASCII value, and performs a similar "wrap-around" process to ensure that the resulting letter is within the range of valid lowercase or uppercase letters.

After all letters have been processed, the character array is converted back to a string and printed to the console.

Note that this implementation is not very secure and can be easily broken by an attacker with knowledge of the algorithm. It is meant as a simple exercise to introduce the concept of encryption and basic string manipulation in Java.
