/# java-coordinate
좌표계산기 미션을 진행하기 위한 저장소

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## java-coordinate
1. 좌표값을 입력 받는다.
    * 좌표값과 좌표값 사이는 "-" 문자로 구분한다.
    * 각 좌표값에서 "(", ")" 제거한다.
    * ","문자로 x값과 y값을 구분한다.
2. x값과 y값을 만든다.
    * [예외] 각 값은 0~24중 하나의 값을 가진다.
3. x값과 y값으로 점을 만든다.
4. 두 점으로 선을 만든다.
5. 두 점을 이용해 선의 길이를 구한다.
6. 네 점을 이용 해 직사각형을 만든다.
    * [예외] 직사각형이 아닐 경우를 확인한다. 
7. 직사격형의 넓이를 구한다.
    