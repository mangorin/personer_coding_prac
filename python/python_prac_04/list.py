# 리스트 선언

list_1 = [10, 25, 70, 0.5]
list_2 = ['파이썬', '머신러닝', '딥러닝']
list_3 = [2.7, 8, '파이썬', '머신러닝']

# 리스트 출력
print(list_1)
print(list_2)
print(list_3)

# 리스트 인덱신/슬라이싱
print(list_1[0]) # list1의 첫번째
print(list_1[0:3]) # list1의 첫번째부터 세번째 까지
print(list_2[1:3]) # list2의 두번째부터 세번째 까지
print(list_3.index(8)) # list3의 요소중 8의 위치

# 리스트 주요 메소드
list_1 = [10, 25, 0.5]
list_2 = ['파이썬','머신러닝']

#요소 추가 메소드 : append, insert, extend
list_1.append(100) # list_1에 100을 추가
list_2.append('난이도') # list_2에 문자열 '난이도'를 추가
print(list_1, list_2) # list_1, list_2를 순서대로 출력
list_1.insert(0,'서울') # 문자열 '서울'을 list_1의 첫 번째 요소로 삽입
list_2.extend(list_1) # list_2과 list_1을 이어 붙임
print(list_1, list_2)

#요소 삭제 메소드 : pop, remove, clear
list_1.pop(1) # list_1의 두 번째 값을 꺼냄
list_2.pop(0) # list_2의 첫 번째 값을 꺼냄
print(list_1, list_2)
list_1.remove(0.5) # list_1에서 0.5를 삭제
list_2.clear() # list_2를 비움
print(list_1, list_2)

