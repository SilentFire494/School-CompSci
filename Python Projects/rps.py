import random
from re import S

def play():
    user = input("'r' for rock, 'p' for paper, 's' for scissors ")
    computer = random.choice(['r', 'p', 's'])

    if is_tie(user, computer):
        return ("You tied")

    if is_win(user, computer):
        return 'You Win'

    if is_lost(user, computer):
        return 'You Lost!'


def is_win(user, computer):
    if (user == 'r' and computer == 's') or (user == 's' and computer == 'p') \
        or (user == 'p' and computer == 'r' ):
        return True

def is_lost(user, computer):
    if (user == 's' and computer == 'r') or (user == 'p' and computer == 's') \
        or (user == 'r' and computer == 's' ):
        return True

def is_tie(user, computer):
    if user == computer:
        return True
    
print(play())