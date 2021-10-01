# 함수의 정의와 호출

def sum(x, y): # x, y를 입력으로 받는 함수 sum 정의 // x, y의 합을 결과로 반환
	return x + y # 함수의 입력으로 받은 x, y의 합을 함수의 출력으로 반환

sum(20, 30) # 위에서 정의된 sum 함수 호출 (20+30)

# 매개 변수가 여러 개인 경우

def order(drink, cookie): # drink, cookie를 입력으로 받는 함수 order 선언
						  # 주문(order)받은 drink와 cookie를 화면에 출력
  print('음료 :', drink,',','쿠키 :', cookie) # 함수의 입력으로 받은 drink cookie를 차례대로 출력

order('아메리카노', '치즈쿠키') # order 함수 호출 (drink=아메리카노, cookie=치즈쿠키)
order('카페라떼', '녹차쿠키')# order 함수 호출 (drink=카페라떼, cookie=녹차쿠키)

# 여러 개의 입력 받기

def cal_many(*args): # tuple 형태의 복수 입력(tuple)을 갖는 cal_many 함수 선언 // 입력으로 받은 값의 총합을 반환
  result = 0
  for i in args: # args의 값들을 i에 순서대로 대입하며 반복
	  result += i # result = result + i
  return result # result를 함수의 출력으로 반환

x = cal_many(2, 3, 4) # cal_many 함수를 호출하여 입력한 값의 총합 계산
y = cal_many(2, 3, 4, 50, 2, 7) # cal_many 함수를 호출하여 입력한 값의 총합 계산
print(x, y, sep=',')

# 모듈/패키지 활용

import math # math module 불러오기
import math as m # math 모듈을 불러오면서 이름을 m으로 지정
from math import sqrt # math안에 있는 sqrt 함수를 직접 불러오기

import matplotlib

print(2**3) # 2의 세제곱 출력
print(pow(2,3)) # python 내장함수 pow를 사용하여 2의 세제곱을 구하여 출력

print(math.sqrt(4)) # math함수 안에 있는 sqrt 함수를 호출
print(m.sqrt(4)) # m으로 지정된 math 모듈안에 있는 sqrt 함수를 호출
print(sqrt(4)) # from ~ import ~ 구문을 통해 직접 불러온 sqrt 함수를 호출

# 머신러닝 라이브러리
import numpy as np  # 행렬 연산 기능을 제공하는 라이브러리
import pandas as pd # 테이블과 시계열을 조작하기 위한 데이터 구조와 연산을 제공하는 라이브러리
from sklearn.svm import SVC # SVM (Support Vector Machine)의 모형인 SVC (Support Vector Classifier) 클래스를 제공하는 라이브러리
import matplotlib.pyplot as plt # 데이터 시각화 라이브러리
import seaborn as sns # 데이터 시각화 라이브러리
from keras.models import Sequential # 순차형(Sequential) 모델을 제공하는 라이브러리