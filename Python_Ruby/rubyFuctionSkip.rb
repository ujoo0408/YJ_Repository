#루비의 함수에서 일어나는 생략 
#생략이 가능하지만 해석이 어려울 수 있다.
def f1()
  return 'f1'
end
puts(f1())		#f1
def f2
  return 'f2'
end
puts(f2())		#f2
def f3
  return 'f3'
end
puts(f3)		#f3
def f4(a1)
  return a1
end
puts(f4('f4'))	#f4
def f5 a1
  return a1
end
puts(f5 'f5')	#f5
puts f5 'f5'	#f5
def f6
  return 'f6'
end
puts f6			#f6
def f7
  'f7'
end
puts f7			#f7
def f8
  a = 1
  b = 2
  a + b
end
puts f8			#3