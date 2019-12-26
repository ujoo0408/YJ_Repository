# 컨테이너 => 배열

print(type('ujoo')) #<class 'str'>
name = 'ujoo'
print(name) #ujoo
print(type(['ujoo', 'dongho', 'jun'])) #<class 'list'>
names = ['ujoo', 'dongho', 'jun']
print(names) 
print(names[2]) #jun
ujoo = ['programmer', 'seoul', 25, False]
ujoo[1] = 'busan'
print(ujoo) #['programmer', 'busan', 25, False]


#리스트 심화

al = ['A', 'B', 'C', 'D']
print(len(al)) # 4
al.append('E')
print(al) #['A', 'B', 'C', 'D', 'E']
del(al[0])
print(al) #['B', 'C', 'D', 'E']