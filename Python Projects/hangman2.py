import random

# list of words to choose from
words = ["apple", "banana", "orange", "strawberry", "grape"]

# choose a word at random
word = random.choice(words)

# create a list of underscores the same length as the word
guesses = ["_" for letter in word]

# initialize the number of incorrect guesses
incorrect_guesses = 0

# maximum number of incorrect guesses allowed
max_incorrect_guesses = 6

# game loop
while incorrect_guesses < max_incorrect_guesses:
  print("Current state: " + " ".join(guesses))
  print("You have {} incorrect guesses left".format(max_incorrect_guesses - incorrect_guesses))
  
  # get the player's guess
  guess = input("Guess a letter: ")
  
  # check if the guess is in the word
  if guess in word:
    # update the list of guesses with the correct letter
    for i, letter in enumerate(word):
      if letter == guess:
        guesses[i] = letter
  else:
    # increment the number of incorrect guesses
    incorrect_guesses += 1
  
  # check if the player has won
  if "_" not in guesses:
    print("Congratulations, you won!")
    break

# check if the player has lost
if incorrect_guesses == max_incorrect_guesses:
  print("Sorry, you lost. The word was {}".format(word))
