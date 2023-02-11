"Email Splicer with @ as the seperator"

# Raw input is used to get the email address as a string
emailFull = input("Enter your email address: ")
emailSplit = emailFull.split("@")  # The string is split at the @ symbol
# The first part of the split string is the username
print("Your username is:", emailSplit[0], "and your domain is:", emailSplit[1])