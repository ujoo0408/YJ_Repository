#논리연산자

in_str = input("아이디를 입력해주세요.\n")
real_ujoo = "ujoo"
real_p0408 = "p0408"
if real_ujoo == in_str or real_p0408 == in_str:
  print("Hello!")
else:
  print("Who are you?")
  


#논리연산자 사용전 IF절 예제

input_id = input("아이디를 입력해주세요.\n")
input_pwd = input("비밀번호를 입력해주세요.\n")
real_id = "ujoo"
real_pwd = "11"
if real_id == input_id:
    if real_pwd == input_pwd:
        print("Hello!")
    else:
        print("잘못된 비밀번호입니다")
else:
    print("잘못된 아이디입니다")

#논리연산자를 사용한 IF절 예제

input_id = input("아이디를 입력해주세요.\n")
input_pwd = input("비밀번호를 입력해주세요.\n")
real_id = "ujoo"
real_pwd = "11"
if real_id == input_id and real_pwd == input_pwd:
    print("Hello!")
else:
    print("로그인에 실패했습니다")