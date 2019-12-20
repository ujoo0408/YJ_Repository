#파이썬 문자열 제어

puts('Hello '+'world')     # Hello world
puts('Hello '*3)           # Hello Hello Hello        
puts('Hello'[0])           # H
puts('Hello'[1])           # e
puts('Hello'[2])           # o

puts('hello world'.capitalize())   # Hello world
puts('hello world'.upcase())       # HELLO WORLD
puts('Hello world'.length())       # 11
puts('Hello world'.sub('world', 'programming'))    # Hello programming