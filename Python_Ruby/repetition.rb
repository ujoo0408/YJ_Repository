#While
i = 0
while i < 3 do
    puts('Hello world')
    i = i + 1
end

# 활용

i = 0
while i < 10 do
    puts('puts("Hello world '+(i*9).to_s()+'")')
    i = i + 1
end
    
#조건문 + 반복문

i = 0
while i < 10 do
  if i == 4
    puts(i)
  end
  i = i + 1
end

###################    
i = 0
while i < 10 do
    if i == 4
        break
    end
    puts(i)
    i = i + 1
end
print('after while')