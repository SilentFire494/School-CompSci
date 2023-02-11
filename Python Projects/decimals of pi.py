import math

lastNumber = 0  # Sets the last number to a value for while function
while lastNumber != 1:
    # Person inputs number
    lastNumber = input("How many decimals do you want shown (0-15)? ")
    if lastNumber.isnumeric(): # Checks if input is postitve whole number
        lastNumber = int(lastNumber) + 2 # Accounts for the '3.' in pi
        pi = str(math.pi)
        print(pi[0:lastNumber])
    elif lastNumber != lastNumber.isnumeric():
        print("Please input a number")
