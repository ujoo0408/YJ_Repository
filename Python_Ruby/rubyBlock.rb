# 루비의 블럭
# 

5.times() {|i| puts i}
2.times() {puts '2times'}
3.upto(5) {|item| puts item}


#N.times(){} : 중괄호 안의 코드를 N번 반복하게 만드는 함수
#N.upto(입력값) {} : N 부터 입력값까지의 횟수만큼 반복하게 만드는 함수
''' 
0
1
2
3
4
2times
2times
3
4
5
'''

#블럭을 이용한 함수

5.times(){|i| puts i}
 
i = 0
while i < 5
  puts i
  i = i + 1
end

'''
0
1
2
3
4
0
1
2
3
4
'''


#배열과 블록

arr = ['A', 'B', 'C']
arr.each(){|i| puts i}
 
for value in arr
  puts value
end
'''
A
B
C
A
B
C
'''

arr = [1, 3, 56, 7, 13 , 52]
arr.delete_if() do |item|
  item > 7
end
#arr.delete_if() {|item| item > 7} 도 가능하지만 여러줄은 do-end 선호함
puts arr

#배열.delete_if(){조건} : 배열의 길이만큼 반복되는 데 조건에 맞는 값을 삭제
'''
1 
3
7
'''


