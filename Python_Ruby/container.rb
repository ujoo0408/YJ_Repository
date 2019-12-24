# 컨테이너 => 배열

names = ['ujoo', 'dongho', 'jun']
puts(names.class) # Array
puts(names[0]) # ujoo
names[0] = 'u0408'
print(names) # ["u0408", "dongho", "jun"]

#배열 심화

al = ['A', 'B', 'C', 'D']
puts(al.length) # 4
al.push('E')
print(al) # ["A", "B", "C", "D", "E"]
al.delete_at(0)
print("\n")
print(al) # ["B", "C", "D", "E"]