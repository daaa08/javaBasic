# javaBasic
20170510

##### 식별자
- 개체의 이름을 붙일때 사용 됨.
- 메모리에 대한 식별자.
- int number = 157; 에서 메모리에는 157이 올라가고 number가 식별자가 됨.
마찬가지로 String str = "안녕" 의 경우도 안녕 이 메모리에 올라가고 str이 식별자가 됨.


##### 자바 주석 넣기
- 한줄 주석 : //
- 여러 줄 주석 : /* 내용*/
- javaDoc 주석 (HTML 파일로 저장 가능) : /** 내용*/


##### 연산자
![enter image description here](http://pds27.egloos.com/pds/201307/25/44/f0361044_51f07510d49d2.png)
- 위로 올라갈수록 우선 순위가 높음
- 괄호가 최우선 순위

##### 조건문

1-1. if(조건문){}

``` java

int a = 1;
int b = 2;

if(a>b){   
			System.out.print("a가 b보다 큽니다");
		}
  ```
1-2. if(조건문){}else if{}else{}
``` java
		if(a>b){  
			System.out.print("a가 b보다 큽니다");
		}else if(a == b){
			System.out.print("a랑 b가 같습니다");

		}else {
			System.out.print("a가 b 보다 작습니다");
		}
  ```
  - 조건은 참 또는 거짓이 되어야 함
  - if괄호의 내용이 참이 아닐경우 else if를 수행
  - else if도 아닌 나머지의 경우 else를 수행

  2. switch(비교값){}
  ``` java
  		switch(a){  
  			case 72:
  				System.out.print("a의 값은 37입니다.");
  			case 12:
  				System.out.print("a의 값은 38입니다.");
  		}
  ```

  - 조건이 하나가 맞으면 끝까지 다 실행되므로 case마다 break;을 써줘야 함.
  - break; 을 써줘야 switch 문을 빠져나옴

  ``` java
  		switch(a){  
			case 72:
				System.out.print("a의 값은 37입니다.");
				break;
			case 12:
				System.out.print("a의 값은 38입니다.");
                break;
		}
```

###### 반복문
1. for(초기화값; 조건값; 증감값){}
``` java
	for (int i=0; i<100; i=i+1){   
	System.out.print(i);
	}
```
- i++ == i=i+1
- 조건을 통해 증감하다가 false가 나올때까지 실행하다가 for문이되면 종료



##### RUNTIME컴파일 (실행환경)

1. JIT (Dalvik)
- class파일을 실행 시 최초 한번 기계어로 컴파일 함
- 최조 한번은 속도 저하 발생 가능 (번역한걸 메모리에 올려야학때문에 메모리를 많이 먹음)

2. AOT (ART)
- 속도 저하가 없음
- 설치할때 한 번 컴파일을 하기때문에 메모리 확보가능
- 롤리팝 5.0부터 가능

![enter image description here](https://www.ibm.com/support/knowledgecenter/en/SSSTCZ_3.0.0/com.ibm.wrt.rtlinux.doc.30/realtime/rt2_aot.gif)

![enter image description here](https://image.slidesharecdn.com/artvsdalvik-141017103318-conversion-gate01/95/art-aot-vs-dalvik-jit-4-638.jpg?cb=1477301741)

- 7.0부터 JIT, AOT 둘 다 사용 가능

##### Instance
- 클래스의 정의를 통해 만들어진 객체
- 코드로 바꿔 실행 시 new를 통해 메모리에 올라간 것
- 코드 자체가 올라가진 않음 (Method area에 올라감)
- 멤버변수만 올라감

```java
CalcChange cc = new CalcChange();		
		cc.calc(10000, 3750);
```
###### object(객체)
- 실 생활속에있는걸 실행하기전 추상화 한 것
- 코드를 짜기 전 상태

##### class
- 추상화한 것을 코드로 바꾼 것

##### 문자열을 숫자로 변형 : 타입.parse타입
```java
int number = 555;
String num = "1000.35"; // 숫자 안에 문자를 넣어 변형할 경우 에러가 뜸.		
Double dbl = Double.parseDouble(num); // 소수점이 포함된 문자를 숫자를 변형 	
int num_temp = Integer.parseInt(num); //문자열을 숫자로 변형
```

##### 숫자를 문자열로 변형 : 숫자 + "";
```java
String number_temp = number + "";
```
