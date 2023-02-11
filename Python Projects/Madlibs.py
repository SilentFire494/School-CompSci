# string concatenation (aka how to put strings together)
# suppose we want to create a string that says "subscrive to ____"
youtuber = "" #some string variable

# a few ways to do this
# print("subscribe to" +youtuber)
# print("subscribe to {}".format(youtuber))
# print(f"subscrobe to {youtuber}")

adj = input("adj ")
verb1 = input("verb ")
verb2 = input("verb ")
famous_person = input("famous person ")

madlib = (f"Computer programming is so {adj}! It makes me so excited all the time because \
     I love to {verb1}. Stay hydrated and {verb2} like you are {famous_person}")

print(madlib)
