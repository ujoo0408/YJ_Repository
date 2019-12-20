#파이썬 문자열 제어

print('Hello '+'world')     # Hello world
print('Hello '*3)           # Hello Hello Hello        
print('Hello'[0])           # H
print('Hello'[1])           # e
print('Hello'[2])           # o

print('hello world'.capitalize())   # Hello world
print('hello world'.upper())        # HELLO WORLD
print('hello world'.__len__())      # 11
print(len('hello world'))           # 11
print('Hello world'.replace('world', 'programming'))    # Hello programming