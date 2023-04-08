# algorithms

# Algorithms
FORTH EDITION

[북사이트](https://algs4.cs.princeton.edu/home/)
[예제 소스](https://algs4.cs.princeton.edu/code/) 
[데이터](https://github.com/gilbutITbook/006782)

## Libraries
 * Standard
    + Math.*
    + Integer.*
    + Double.*
    + String.*
    + StringBuilder
    + System.*
    + java.util.Arrays
 * Book
    + StdIn
        + isEmpty() boolean: 읽어 들일 값이 없으면 true, 있으면 false
        + readInt() int
        + readDouble() double
        + readFloat() float
        + readLong() long
        + readBoolean() boolean
        + readChar() char
        + readByte() byte
        + readString() String
        + hasNextLine() boolean: 입력 스트림에 읽어 들여야 할 무낮열 라인이 남아 있는지 여부
        + readLine() String: 문자열 한 라인 읽어들이기
        + readAll() String: 입력 스트림에 남아 있는 모든 내용 읽기
    + StdOut
        + print(String s) void:
        + println(String s) void
        + println() void
        + printf(String f, ...) void
    + StdDraw
        + line(double x0, y0, x1, y1)
        + point(double x, y)
        + text(double x, y, String s)
        + circle(double x, y, r)
        + filledCircle(x, y, r)
        + ellipse(double x, y, rw, rh)
        + filledEllipse(double x, y, rw, rh)
        + square(double x, y, r)
        + filledSquare(double x, y, r)
        + reactangle(x, y, rw, rh)
        + fiiledRectangle(double x, y, rw, rh)
        + polygon(double[] x, y)
        + fiiledPolygon(double[] x, y)
        +
        + setXscale(double x0, x1): x축 스케일(좌표 범위)을 (x0, x1)로 설정
        + setYscale(double y0, y1): y축
        + setPenRadius(double r): 펜 굵기(반지름)를 r로 설정
        + setPenColor(Color c): 펜 색깔을 c로 설정
        + setFont(Font f): 텍스트 표시용 폰트를 f로 설정
        + setCanvasSize(int w, int h): 캔버스 크기를 가로 w, 세로 h로의 윈도로 설정
        + clear(color c): 캔버스를 색깔 c로 지움
        + show(int dt): dt msec 후, 모든 그림을 보여지게 함
    + StdRandom
        + setSeed(long seed) void: 난수 시드 초기화
        + random() double: 실수 난수
        + uniform(int N) int: 난수
        + uniform(int lo, int hi): 난수
        + bernoulli(double p) boolean: 확률 p로 true 리턴
        + gaussian() double: 평균 0, 표준편차 1인 정규분포 난수
        + gaussian(double m, double s) double: 정규분포 난수
        + discreate(double[] a) int: i일 확률이 a[i]인 난수
        + shuffle(double[] a): 배열 a[]의 항목들을 무작위로 뒤섞기
    + StdStats
        + max(double[] a) double:
        + min
        + mean
        + var(double[] a) double: 분산
        + stddev(double[] a) dobule: 표준편차
        + median: 중앙값
    + In.*
        + readAllints() int[]
        + readAllDoubles() double[]
        + readAllFloats() float[]
        + readAllLongs() long[]
        + readAllBooleans() boolean[]
        + readAllChars() char[]
        + readAllBytes() byte[]
        + readAllStrings() String[]: 남아 있는 모든 String 값들을 배열로써 읽어 들이기
        + readAllLines() String[]: 남아 있는 모든 문자열 라인들을 배열로써 읽어들이기
    + Out.*
