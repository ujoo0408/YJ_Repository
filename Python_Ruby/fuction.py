#함수

def make_string(str, num):
    return str*num
print(make_string('b', 3))

# 로그인 애플리케이션 (파이썬) 

input_id = input("아이디를 입력해주세요.\n")
def login(_id):
    members = ['ujoo', 'dongho', 'cotton']
    for member in members:
        if member == _id:
            return True
    return False
if login(input_id):
    print('Hello, '+input_id)
else:
    print('Who are you?')