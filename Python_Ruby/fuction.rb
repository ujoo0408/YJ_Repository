#함수
def make_string(str, num)
    return str*num
end
puts(make_string('b', 3))

#로그인 애플리케이션 (루비)
puts("아이디를 입력해주세요")
input_id = gets.chomp()
 
def login(_id)
  members = ['ujoo', 'dongho', 'cotton']
  for member in members do
      if member == _id
          return true
      end
  end
  return false
end
 
if login(input_id)
  puts('Hello, '+input_id)
else
  puts('Who are you?')
end