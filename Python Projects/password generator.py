import random

upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
lowerCase = upperCase.lower()
digits = "1234567890"
symbols = "~`!@#$%^*()_-+=|}]{[;:/?.>,<"

passLenth = input("Please enter a password length ")
if passLenth.isnumeric():
    passLenth = int(passLenth)
    firstPassword = upperCase + lowerCase + digits + symbols
    finalPassword = firstPassword
    finalPassword = list(finalPassword)
    random.shuffle(finalPassword)
    result = "".join(finalPassword[0:passLenth])
    print(result)
else:
    print("Please enter a number")
