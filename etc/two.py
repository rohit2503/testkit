def fun():
    a = 0
    b = 1
    s = 0
    for i in range(10):
        yield b
        s = a + b
        a , b = b , s
        
for number in fun():
