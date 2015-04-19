def any_lowercase(s):
    flag = False
    for c in s:
        flag = flag or c.islower()
    return flag
        
# if __name__ == '__main__':
#     status = any_lowercase("Sample")
#     print status
#     print 's'.islower()

def rotate(word,n):
    """
    """
    rotated_word = ''
    for letter in word: 
        if letter.islower():
            start  = ord('a')
        elif letter.isupper():
            start = ord('A')
        actual_letter = ord(letter) - start
        rotated_number = (actual_letter + n) % 26 + start
        rotated_word += chr(rotated_number)
    return  rotated_word

def rotate_13(word, num):
    new_word  =''
    for letter in word:
        int_letter = ord(letter)
        new_val =  int_letter + num
        if new_val < ord('A'):
            new_val = ord('Z')- ((ord('A') % new_val))%26  + 1
        elif new_val > ord('Z'):
             print "********",new_val
             new_val = ord('A') + ((new_val % ord('Z')))%26 - 1
        new_word += chr(new_val)
        
    return  new_word    
    
    
# print rotate_13("W", 325)

print rotate('SlEep', 9)