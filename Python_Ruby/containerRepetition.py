#반복문과 컨테이너_파이썬

members = ['ujoo', 'dongho', 'juncotton']
i = 0
while i < len(members):
    print(members[i])
    i = i + 1
    
    
#for문

members = ['ujoo', 'dongho', 'juncotton']
for member in members:
    print(member)
    
#범위 주기 

for item in range(5, 11):
    print(item)      # 5 6 7 8 9 10
 
 
#로그인 프로그램

input_id = input("아이디를 입력해주세요.\n")
members = ['ujoo', 'dongho', 'juncotton']
for member in members:
    if member == input_id:
        print('Hello!, '+member)
        import sys
        sys.exit()
print('Who are you?')
