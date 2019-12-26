#반복문과 컨테이너_루비

members = ['ujoo', 'dongho', 'juncotton']
i = 0
while i < members.length do
    puts(members[i])
    i = i + 1
end

#for문

members = ['ujoo', 'dongho', 'juncotton']
for member in members do
	puts(member)
end

#범위
for item in (5..10) do
  puts(item)				# 5 6 7 8 9 10
end

#로그인 프로그램

puts("아이디를 입력해주세요")
input_id = gets.chomp()
members = ['ujoo', 'dongho', 'juncotton']

for member in members do
    if member == input_id
        puts('Hello!, '+member)
        exit
    end
end
puts('Who are you?')