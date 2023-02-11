import random
import string
def loadWords():
    """Load the words from the file and return a list of words"""
    with open("words.txt", "r") as f:
        words = f.read().splitlines()
    return words

def chooseWord(words):
    """Choose a random word from the list of words"""
    return random.choice(words)

def isWordGuess(secretWord, lettersGuessed):
    """Check if the word has been guessed"""
    for letter in secretWord:
        if letter not in lettersGuessed:
            return False
    return True

def getGuessedWord(secretWord, lettersGuessed):
    """Get the word with the guessed letters"""
    guessedWord = ""
    for letter in secretWord:
        if letter in lettersGuessed:
            guessedWord += letter
        else:
            guessedWord += "_"
    return guessedWord

def getAvaliableLetters(lettersGuessed):
    """Get the letters that have not been guessed"""
    avaliableLetters = ""
    for letter in string.ascii_lowercase:
        if letter not in lettersGuessed:
            avaliableLetters += letter
    return avaliableLetters

def handman(secretWord):
    numGuesses = 8
    lettersGuessed = []
    print()
    print(f"Welcome to Hangman! The secret word has {len(secretWord)} letters.")
    print("----------------------------------------")
    while(True):
        print("you have", numGuesses, "guesses left.")
        print("Avaliable letters:", getAvaliableLetters(lettersGuessed))
        guess = input("Please guess a letter: ").lower()
        if len(guess) != 1:
            print("Please enter a single letter.")
        elif(guess not in "abcdefghijklmnopqrstuvwxyz"):
            print("Please enter a letter.")
        else:
            guess = guess.lower()
            if guess in lettersGuessed:
                print("You have already guessed that letter.")
            else:
                lettersGuessed.append(guess)
                if guess in secretWord:
                    print("Good guess:", getGuessedWord(secretWord, lettersGuessed))
                else:
                    print("Oops! That letter is not in my word:", getGuessedWord(secretWord, lettersGuessed))
                    numGuesses -= 1
        print("----------------------------------------")
        if isWordGuess(secretWord, lettersGuessed):
            print("Congratulations, you won!")
            break
        elif numGuesses == 0:
            print("Sorry, you ran out of guesses. The word was", secretWord)
            break